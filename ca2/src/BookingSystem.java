
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
        /** This class is where bookings are made, added to the list of bookings, and also removed, thus it is also where assistants in shift and bookable rooms are created, added and removed */
public class BookingSystem {




    private ArrayList<BookableRoom> bookableRooms=new ArrayList<BookableRoom>();
    private ArrayList<AssistantOnShift> assistantsOnShifts=new ArrayList<AssistantOnShift>();
    private ArrayList<Booking>bookings=new ArrayList<Booking>();
    public static final String ENTERDAT = "Please enter a date and time";
    public ArrayList createBookableRooms(){
      /** This function creates the bookable rooms by adding them to the list of bookable rooms, with approriate varibles
       * @return the list of bookable rooms after the new bookable rooms have been added
       */
       bookableRooms.add(new BookableRoom(2021-05-25 08:00:00, "EMPTY", BR12, 0)); //1
       bookableRooms.add(new BookableRoom(2021-06-24 09:00:00, "AVAILABLE", BR23, 2)); //2
       bookableRooms.add(new BookableRoom(2021-09-12 07:00:00, "EMPTY", BR34, 0)); //3
       bookableRooms.add(new BookableRoom(2021-10-09 07:00:00, "FULL", BR43, 2)); //4
       bookableRooms.add(new BookableRoom(2021-12-06 09:00:00, "AVAILABLE", BR49, 3)); //5
       bookableRooms.add(new BookableRoom(2021-11-21 08:00:00, "FULL", BR51, 1)); //6
       bookableRooms.add(new BookableRoom(2021-06-15 09:00:00, "AVAILABLE", BR60, 4)); //7
       bookableRooms.add(new BookableRoom(2021-07-04 08:00:00, "AVAILABLE", BR73, 2)); //8
       bookableRooms.add(new BookableRoom(2021-05-16 07:00:00, "FULL", BR98, 4)); //9

       return bookableRooms;
    }
    //• 6 assistants on shift
    public ArrayList createAssistantsOnShift(){
      /** This function creates the assistants on shift by adding them to the list of assistants on shift, with approriate varibles
       * @return the list of assistantsOnShifts after the new assistantsOnShifts have been added
       */
        assistantsOnShifts.add(new AssistantOnShift(2021-05-10 07:00:00, "JA32@uok.ac.uk")); //1
        assistantsOnShifts.add(new AssistantOnShift(2021-06-21 07:00:00, "Molly20@uok.ac.uk")); //2
        assistantsOnShifts.add(new AssistantOnShift(2021-09-09 07:00:00, "Sam43@uok.ac.uk")); //3
        assistantsOnShifts.add(new AssistantOnShift(2021-07-07 07:00:00, "Bryan90@uok.ac.uk")); //4
        assistantsOnShifts.add(new AssistantOnShift(2021-10-16 07:00:00, "Jose56@uok.ac.uk")); //5
        assistantsOnShifts.add(new AssistantOnShift(2021-11-05 07:00:00, "Amy72@uok.ac.uk")); //6

        return assistantsOnShifts;
    }



    public BookableRoom getBookableRoom(){
      /**@return the bookable room*/
      return this.BookableRoom;
    }



    //list of bookable rooms status:EMPTY
    ArrayList EmptyBookableRooms;
    String EMPTY;

    public void addBookableRooms() {
            /** add a new bookable room to the list*/

        //bookableRooms.add(dateAndTime, status,roomCode, occupancy);
        //bookableRooms.add(12/03/2022, AVAILABLE,A567, 1);
        //Print template: | <dd/mm/yyyy HH:MM> | <status> | <roomCode> | occupancy: <occupancy> |
        Scanner scanner = new Scanner(System.in);
        System.out.print(ENTERDAT);
        String dateAndTimeString = scanner.next();
        LocalDateTime dateAndTime = LocalDateTime.parse(dateAndTimeString);
        System.out.print("Please enter a room code");
        String code = scanner.next();
        int oocupancy = BookableRoom.updateOccupancy(); //increase the occupancy by 1 //STATIC ERRORR CHECK
        int status = BookableRoom.getRoomBookableRoomStatus(); //STATIC ERRORR CHECK //get the statuis of the room
        bookableRooms.add(new BookableRoom(dateAndTime, Status, code, occupancy));

    }

    public void addAssistantsOnShift() {
            //** add a new assistanmt on shift to the list*/

        // Print template: | <0dd/mm/yyyy HH:MM> | <status> | <assistantEmail> |
        Scanner scanner = new Scanner(System.in);

        System.out.print(ENTERDAT);
        String dateAndTimeString = scanner.next();
        LocalDateTime dateAndTime = LocalDateTime.parse(dateAndTimeString);
        System.out.print("Please enter an assistant's email");
        String email = scanner.next();
        //AssistantOnShift.getAssistantStatus(); //get the status of the assistant
        assistantsOnShifts.add(new AssistantOnShift(dateAndTime, email));
        }

    public void addBookings() {
            /** add a new booking to the list*/

            //7. Print template: | <dd/mm/yyyy HH:MM> | <status> | <assistantEmail> | <roomCode> | <studentEmail> |
            Scanner scanner = new Scanner(System.in);

            System.out.print(ENTERDAT);
            String dateAndTimeString = scanner.next();
            LocalDateTime dateAndTime = LocalDateTime.parse(dateAndTimeString);
            System.out.print("Please enter an assistant's email");
            String email = scanner.next();
            System.out.print("Please enter a room code");
            String code = scanner.next();
            System.out.print("Please enter a student's email");
            String studentEmail = scanner.next();
            //BookableRoom.updateOccupancy(); //increase the occupancy of the room by 1 //CHECK

            BookableRoom.getBookableRoomStatus(); //get the status of the room //CHECK
            AssistantOnShift.getAssistantStatus(); //get the status of the assistant  //CHECK
            Status = Booking.getBookingStatus(); //get the status of the booking
            //Booking b = new Booking();
            bookings.add(new Booking(dateAndTime, Status, email, code, studentEmail));

    }
    public String removeBookableRooms() {
            /** remove a bookable room from the list
             * @return a string confirming to the user that the bookable room has been removed
            */
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the code of the room you wish to delete");
            String UserCode = scanner.next();
            int deleteIndex1 = bookableRooms.indexOf(UserCode);
            bookableRooms.remove(deleteIndex1);
            return "The bookable room has been removed";
    }

    public String removeAssistantOnShift() {
            /** remove an asssitant on shift from the list
             * @return a string confirming to the user that the assistant on shift has been removed
            */
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the email address of the assistant on shift you would like to remove");
            String UserEmail1 = scanner.next();
            int deleteIndex2 = assistantsOnShifts.indexOf(UserEmail1);
            assistantsOnShifts.remove(deleteIndex2);
            return "The assistant on shift has been removed";
    }

    public String removeBookings() {
            /** remove a booking from the list
             * @return a string confriming to the user that the booking jas beem removed
            */
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the students email of the booking you would like to remove");
            String UserEmail2 = scanner.next();
            int deleteIndex3 = bookings.indexOf(UserEmail2);
            bookings.remove(deleteIndex3);
            return "The booking has been removed";
    }

    public ArrayList showAssistantsOnShift(){
            /** @return the list of assistants on shift */
            return assistantsOnShifts;
    }
    public ArrayList showBookableRooms(){
            /** @return the list of bookable rooms */
            return bookableRooms;
    }
    public ArrayList showBookings(){
            /** @return the list bookings */
            return bookings;
    }
}//DO: check
//3. There is a time-slot concept that will guide the booking system. For instance, rooms will be available, and
//assistants will work at a specific time-slot, i.e., date, time and duration. Hence, tests should be booked at
//available slots.
//4. Every time-slot has a fixed duration – a positive number representing the duration of a test, in minutes. This
//quantity includes the time spent doing the test and the time to sanitize the room. The current policy establishes
//this duration to be 60 minutes.

    /*1. The booking System is responsible for most functionalities. It has a list of bookable rooms, a list of assistants on
shift, and a list of bookings.

3. There is a time-slot concept that will guide the booking System. For instance, rooms will be available, and
assistants will work at a specific time-slot, i.e., date, time and duration. Hence, tests should be booked at
available slots.

4. Every time-slot has a fixed duration – a positive number representing the duration of a test, in minutes. This
quantity includes the time spent doing the test and the time to sanitize the room. The current policy establishes
this duration to be 60 minutes.
*/
