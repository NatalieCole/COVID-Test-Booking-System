import java.util.ArrayList;
/** This class defines a room (object) incthe unicversity trhat can be used as a bookable room for covid tests */
public class Room {
    public String code;
    public int capacity;


    public String getCode() {
      /**This function is a getter method to retrieve the unique room getCode
      @return the unique room code*/
        this.code = code;
        UniversityResources.getRooms();
        ArrayList rooms = UniversityResources.getRooms();
        if(rooms.contains(this.code)){
            System.out.print("This room code is already being used for another room, please use another room code.");
        }
        else {
            return this.code;
        }
    }

    public int getCapacity() {
      /**This function is a getter method used to retrieve the capacity of a room if it is not < or = to 0
      @return the capacity if it is legitimate, otherwise @return 1 as a defult room capacity */
        this.capacity = capacity;
        if (this.capacity<=0){
            System.out.print("The capacity needs to be an integer value greater than 0, please try again");
            return 1;
        }
        else {
            return this.capacity;
        }
    }

//constructor:
public Room(String code, int capacity) {
  /**This function sonstructs the room class*/
    this.code = code;
    this.capacity = capacity;
}
}
 //System.out.print(getCode() + getCapacity());

/*1.1.2 Room
public Module(int year, byte term, ModuleDescriptor module, StudentRecord[] records, double finalAverageGrade) {
    this.year = year;
1. The university has several rooms, and some of the rooms can be allocated to apply COVID tests.
2. A room must have a string code (e.g., IC215) and a capacity.
3. The code is used to identify the room and, therefore, must be unique.
4. The capacity must be an integer value greater than zero. It represents the number of concurrent assistants that
can be safely allocated in the room to perform tests.
5. Print template: | <code> | capacity: <capacity> | */
