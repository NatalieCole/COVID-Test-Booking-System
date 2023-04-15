import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
/**This booking class defines what variables belong to the ooking object */
public class Booking {

    public LocalDateTime dateAndTime;
    public String status;
    public String studentEmail;
    public int bookingIDcode;
    public String roomCode;
    public String assistantEmail;

    public String COMPLETED;
    public String FREE;
    public String SHEDULED;
    public String FULL;

    public String AssistantOnShiftstatus; //HOW CAN I GET THIS FROM THE ASSISTANT ON SHIFT CLASS? CHECK!
    public String BookableRoomStatus; // HOW CAN I CGET THIS FROM THE BOOKABLE ROOM CLASS? CHECK!

    public String emailInput;

    public String getEmail(){
      /**This function is used to get the students' email
      @return the students' email*/
        System.out.print("What is the start of the students email?");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        String emailInput = sc.nextLine(); //reads string.
        return studentEmail = (emailInput + "@uok.ac.uk");
    }
    public boolean happened = false;
    public String getBookingStatus(){
      /**This function calculates tje booking status based on whether or not the test has occured
      @return the status of the booking*/
        if (happened = true){
            this.status = "SCHEDULED";
        }
        else if (happened = false) {
            this.status = "COMPLETED";
        }
        return this.status;
    }
    public boolean available = false;
    public boolean AvailableResources() {
      /**This function calculates whether or not a resource is available based on its statuses
      @return all of the available resources*/
        if (this.BookableRoomStatus == "FULL"){
            available = false;
            System.out.print("This Bookable Room is full, choose another room");
        }
        else if (this.AssistantOnShiftstatus != "FREE"){
            available = false;
            System.out.print("This Assistant on shift isn't availabe right now, please choose another assistant.");
        }
        //return AvailableResources = true;
        else {
            return available = true;}
        //do i need to make this method a boolean? how do i do this
        return available;
    }

    public boolean rb = false; //rb = removable Booking
    public boolean rb() {
      /**This function calculates whether or not a boking is removable based on whether it has been completed or not which we can find out from its status
      @return the boolean value of the removable booking variable */
        if (status.equals("COMPLETED")) {
            rb = true;
        }
        else {
            rb = false;
        }
        return rb;
    }
    public Booking getBooking(){
      return this.booking;
    }
    //constructor:
public Booking(LocalDateTime dateAndTime, String status, String assistantEmail, String roomCode, String studentEmail, int bookingIDcode) {
  /**This function constructs the booking class*/
    this.dateAndTime = dateAndTime;
    this.status = status;
    this.assistantEmail = assistantEmail;
    this.roomCode = roomCode;
    this.studentEmail = studentEmail;
    this.bookingIDcode = bookingIDcode;
}
}


//1. A booking consists of matching a bookable room and an assistant on shift at a specific time-slot to perform a
//COVID-19 test on a student. It is the main function of the system.

//2. A booking has a unique sequential number (identification code) and the email of the student being tested

//3. To create a booking in a time-slot, the system must certify the availab
//5. A booking not COMPLETED can be cancelled, i.e., deleted from the system.
//After cancellation, the resources (room and assistant) should be released for booking again, i.e., their statuses must be updated.



//1. A booking consists of matching a bookable room and an assistant on shift at a specific time-slot to perform a
//COVID-19 test on a student. It is the main function of the system.
//6. A booking SCHEDULED can become COMPLETED. Once completed, the booking cannot be deleted due to audit processes.
//7. Print template: | <dd/mm/yyyy HH:MM> | <status> | <assistantEmail> | <roomCode> | <studentEmail> |



  /*public static void main (String args[]) {

        Scanner input = new Scanner(System.in);
        String newAssistant = Scanner.nextline();

       // String newAssistant = input.next();
        assistants.add(newAssistant);
        //return assistants;

    }
    /*public function addRoom(){
        rooms.add(userInput.next());
        return rooms;
    } */
