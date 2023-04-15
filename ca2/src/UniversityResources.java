import java.lang.reflect.Method;
import java.util.javadoc;
import java.util.ArrayList;
import java.util.Scanner;
/**This class is where all of the university resources are made, such s rooms and assitants. */
public class UniversityResources {
    private ArrayList<Assistant> assistants = new ArrayList<Assistant>();
    public static ArrayList<Room> rooms = new ArrayList<Room>();

    public static ArrayList getRooms(){
        /** @return the list of rooms */
        return rooms;
    }
    public ArrayList getAssistants() {
        /** @return the list of assistants*/
        return assistants;
    }

    public ArrayList createRooms(){
        /** This function creates the rooms by adding them to the list of rooms, with approriate varibles for the room code and capcity
         * @return the list of rooms after the new rooms have been added
         */
        //getcode();
        rooms.add(new Room("A33",5));
        rooms.add(new Room("B22", 1));
        rooms.add(new Room("C39", 2));
        rooms.add(new Room("D54", 3));
        rooms.add(new Room("E28", 1));
        return rooms;
    }
    public ArrayList createAssistants() {
        /** This function creayes the assistants by adding them to the list of assistants, with appropriate variables for the name and email
         * @return the list of assistants after the new assistants have been added
         */
        assistants.add(new Assistant("Julie", "JA32@uok.ac.uk"));
        assistants.add(new Assistant("Sandy", "MrsSandMan@uok.ac.uk"));
        assistants.add(new Assistant("Louise", "LoulOU00@uok.ac.uk"));
        assistants.add(new Assistant("Kathrin", "Kay7890@uok.ac.uk"));
        assistants.add(new Assistant("Robbert", "Bobbles@uok.ac.uk"));
        return assistants;
    }
        //private ArrayList<Assistant> assistants = new ArrayList<Assistant>();


public String addRoom() {
    /** This function allows the user to add a room to the list of rooms (if a new room is available for testing in the university for example)
     * @return a message confirming to the user that the room has been added
     */

    Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    System.out.print("Please enter a room code");
    String code = sc.nextLine();  //reads string
    System.out.print("Please enter a capacity");
    String cap = sc.nextLine();
    int capInt=Integer.parseInt(cap);
    rooms.add(new Room(code, capInt));
    return "The room has been added";
}

public String addAssistant() {
    /**This function allows the user to add an assistant to the list of assists (if for example a new memeber of staff at the university now has the time to jelp with covid tests)
     *@return a message confirming to the user that the assistant has been added
     */
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    System.out.print("Please enter an assistant name");
    String name = sc.nextLine();  //reads string
    System.out.print("Please enter an email");
    String email = sc.nextLine();  //reads string
    assistants.add(new Assistant(name, email));
    return "The assistant has been added";
}
//constructor:
public UniversityResources(ArrayList assistants, ArrayList rooms) {
  /**This function sonstructs the University Recourses class*/
    this.assistants = assistants;
    this.rooms = rooms;
}
}
/*University Resources
1. The University has a list of assistants and a list of rooms.
2. You should implement functions to add, both assistants and rooms.
3. Due to time constraints, you don’t need to develop screen to manage the university resources, but you need to
pre-load the system with instances of rooms and assistants. Please, check section 1.3 for more details.
*/
