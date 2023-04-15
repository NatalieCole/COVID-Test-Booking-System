import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
/** This class defines a bookable room (object) in which the tests will take place once they are booked. */
public class BookableRoom {
    public LocalDateTime dateAndTime;
    public int occupancy;
    public String BookableRoomStatus;
    public String code;

    public int Capacity;
    //Room.getCapacity();
    public String EMPTY;
    public String AVAIABLE;
    public String FULL;

    public ArrayList EMPTYBookableRoomslist;
    public ArrayList getEMPTYBookableRoomslist(){
      /** This function loops through all of the bookable rooms in the list, and selects the ones with an EMPTY status and puts them in a list specific for that type of bookable rooms
      *@return the list of bookablerooms with an EMPTY status*/
      //FREEBookableRoomslist.size() = size
      //for (bookableRooms in bookableRooms) {
      for(int i = 0; i < BookableRoomslist.size(); i++) {
        if (this.BookableRoomStatus == EMPTY){

          this.dateAndTime = dateAndTime;
          this.occupancy = occupancy;
          this.BookableRoomStatus = BookableRoomStatus;
          this.code = code;
          EMPTYBookableRoomslist.add(new BookableRoom(dateAndTime, occupancy, BookableRoomStatus, code));
        }
      }
      return EMPTYBookableRoomslist;
    }

    public String removeEBR(String usersRoom){
      /**This function removes the bookable room from the list of bookable rooms status:EMPTY)*/
      EMPTYBookableRoomslist.remove(usersRoom);
      //getEMPTYBookableRoomslist.remove(room);
      String message;
      message = "The room is no longer empty";
      return message;
    }
    public String getremovedRoom(String usersRoom){
      /**@returns the bookable room that was removed*/
      return usersRoom;
    }

    public String getBookableRoomStatus(){
        /** Calaculates and returns the status of the bookable room based on its occupancy
         * @return the status of the bookable room as a string
         */
        if (occupancy == 0){
            this.BookableRoomStatus = EMPTY;
        }
        else if (occupancy < Capacity) {
            this.BookableRoomStatus = AVAIABLE;
        }
        else if (occupancy == Capacity) {
            this.BookableRoomStatus = FULL;
        }
        else if (occupancy > Capacity){
            //print error message
            System.out.print("The occupancy of a room cannot be higher than itds capacity, please enter a lower occupancy");

           // System.out.print("")
        }
        return this.BookableRoomStatus;
    }
    public boolean removable = false;
    public boolean removable(){
        /** Returns whether the bookable room is removable or not based on its status
         * @return the boolean value of removable
         */
        if (this.BookableRoomStatus == "EMPTY"){
            removable = true;
        }
        else {
            removable = false;
        }
        return removable;
    }
    public int updateOccupancy() {
        /** Adds one to the occupancy of the bookable room, this is called whenever a booking is made i n a particular bookable room
         * @return the updated occupancy as an integer
         */
        return occupancy += 1;
    }
    public int getOccupancy(){
        /** @return the occupancy of the room */
        return this.occupancy;
    }

    //constructor:
public BookableRoom(LocalDateTime dateAndTime, int occupancy, String BookableRoomStatus, String code){
  /**This function constructs the BookableRoom class*/
  this.dateAndTime = dateAndTime;
  this.occupancy = occupancy;
  this.BookableRoomStatus = BookableRoomStatus;
  this.code = code;
}
}
  //if the occupancy changes, then the getBookableRoomStatus method is called to update the BookableRoomStatus of the bookable room
//to do check

//2. A bookable room is a room allocated in a specific time-slot (dd/mm/yyyy HH:MM). Since rooms are available
//from 7 AM - 10 AM, the system will offer at most three bookable rooms (time-slots) per room per day.

//6. The BookableRoomStatus of a bookable room must be updated whenever its occupancy changes.

//7. Print template: | <dd/mm/yyyy HH:MM> | <BookableRoomStatus> | <roomCode> | occupancy: <occupancy> |

//@param
//@return
