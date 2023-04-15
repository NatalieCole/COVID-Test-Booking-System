import java.util.*;
//import java.util.Scanner;
/**This application class is where the covid test bookinjg application is run, it's where things actually happen*/
public class BookingApp {
    /**The main class for the program, where the menus are loaded and all of the functions are called. */
    public static void someMethod() {
        /*This function is used for outputting the original menu screen*/
        System.out.println("University of Knowledge - COVID test");
        System.out.println();
        System.out.println("Manage Bookings");
        System.out.println();

        System.out.println("Please, enter the number to select your option:");
        System.out.println();
        System.out.println("To manage Bookable Rooms:");
        System.out.println("1. List");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println("To manage Assistants on Shift:");
        System.out.println("4. List");
        System.out.println("5. Add");
        System.out.println("6. Remove");
        System.out.println("To manage Bookings:");
        System.out.println("7. List");
        System.out.println("8. Add");
        System.out.println("9. Remove");
        System.out.println("10. Conclude");

    }

    public static final String QUIT = "-1. Quit application.";
    public static final String BACK = "0. Back to main menu.";
    public static final String ERROR = "Error!";

    public static void main(String[] args) {
        /** This is the main method where the application is run*/
        someMethod();
        System.out.println("Enter a string: ");

        Scanner input = new Scanner(System.in);
        int userOption = input.nextInt();
        if (userOption == 1) {
            //collection.clear(); //clear interface
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            UniversityResources.getRooms();
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();

        }
        else if (userOption == 2) {
            //collection.clear(); //clear interface
            Boolean Valid = true;
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            System.out.println("Adding bookable room");
            System.out.println();
            System.out.println(UniversityResources.getRooms());
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space.");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();

            //Adding bookable room
            if (Valid = true) {
                System.out.println("Bookable Room added successfully:");
                System.out.println(BookingSystem.getBookableRoom());
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (Valid = false) {
                System.out.println(ERROR);

                System.out.println("There is no availability for this room at this particular time, please try again rooom isn't available");
                System.out.println("This room does not exist, please try again");
                System.out.println("This time isn't available, you can only book for 07:00, 08:00 and 09:00");
                /*If the entry is NOT valid, the system remains unchanged. In this way, you should append to the screen the following message explaining the problem:
                Error!
                <message explaining the error>*/

                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space.");
                System.out.println(BACK);
                System.out.println(QUIT);

                System.out.println();
            }
        }
        else if (userOption == 3) {
            //collection.clear(); //clear interface
            Boolean Valid = true;
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            System.out.println(BookableRoom.getEMPTYBookableRoomslist()); //static error
            System.out.println("Removing bookable room");
            System.out.println();
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID to select the bookable room to be removed.");
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
            String usersRoom= sc.nextLine(); //reads string.
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();


            if (Valid = true) {

                BookableRoom.removeEBR(usersRoom);  //static error  //remove the bookable room from the list of bookable rooms status:EMPTY)
                System.out.println("Bookable Room removed successfully:");
                System.out.println(BookableRoom.getremovedRoom(usersRoom)); //that was deleted);
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the bookable room to be removed.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (Valid = false) {
                System.out.println(ERROR);
                System.out.println("This room is not an empty room that can be removed from the system, please try again");
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the bookable room to be removed.");
                System.out.println(BACK);
                System.out.println(QUIT);


            }
        }
        else if (userOption == 4) {
            //collection.clear(); //clear interface
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            //System.out.println(assistant on shifts List);
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();
        }
        else if (userOption == 5) {
            //collection.clear(); //clear interface
            Boolean valid = true;
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            System.out.println("Adding assistant on shift");
            System.out.println();
            //System.out.println(assistants);
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID of an assistant, and date (dd/mm/yyyy), separated by a white space.");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();

            //Adding assistant on shift
            if (valid = true) {
                //add the asssistant to the list of assistants
                System.out.println("Assistant on Shift added successfully:");
                //System.out.println(Assistant on Shift);
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID listed of an assistant, a date (dd/mm/yyyy), separated by a white space.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (valid = false) {
                System.out.println(ERROR);

                //System.out.println(message explaining the error)

                System.out.println("There is no availability for this room at this particular time, please try again rooom isn't available");
                System.out.println("This room does not exist, please try again");
                System.out.println("This time isn't available, you can only book for 07:00, 08:00 and 09:00");
                /*If the entry is NOT valid, the system remains unchanged.In this way, you should append to the screen the following
message explaining the problem:
Error!
<message explaining the error>*/

                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
        }
        else if (userOption == 6){
            //collection.clear(); //clear interface
            Boolean Valid = true;
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            System.out.println(AssistantOnShift.getFREEassistantsOnShiftlist());
            System.out.println("Removing assistant on shift");
            System.out.println();
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID to select the assistant on shift to be removed.");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();

            //removing an assistants
            if (Valid = true) {
                //remove the assistant from the list of assistant on shifts status:FREE)
                System.out.println("Assistant on Shift removed successfully:");
                //System.out.println(Assistant on Shift); //that was deleted);
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the assistant on shift to be removed");

                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (Valid = false) {
                /*If the entry is NOT valid, the system remains unchanged. In this way, you should append to the screen the following
                message explaining the problem:
                Error!
                <message explaining the error>*/
                System.out.println(ERROR);
                System.out.println("This is not an assistant on shift that is free to be removed from the system, please try again");

                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the bookable room to be removed.");

                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }

        }
        else if (userOption == 7){
            //collection.clear(); //clear interface
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            System.out.println("Select which booking to list:");
            System.out.println("1. All");
            System.out.println("2. Only bookings status:SCHEDULED");
            System.out.println("3. Only bookings status:COMPLETED");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();
            if (userOption == 1 || userOption == 2 || userOption == 3) {
                append:
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else {
                /*If the entry is NOT valid, show by default ALL bookings. Append the screen with the following to explain the problem:
                <list bookings>
                0. Back to main menu.
                -1. Quit application.
                <new line>*/
                //System.out.println(list bookings);
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
        }
        else if (userOption == 8) {
            //collection.clear(); //clear interface
            Boolean valid = true;
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            System.out.println("Adding booking (appointment for a COVID test) to the system");
            System.out.println();
            System.out.println("List of available time-slots:");
            //system.out.println(List of available slots + 11, 12,...)
           // 11. dd/mm/yyyy HH:MM
            //12. dd/mm/yyyy HH:MM
            //13. dd/mm/yyyy HH:MM
            //...
            System.out.println();
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();

            if (valid = true){
                //create a booking in the System
                //If in the selected time-slot there are more than one combination of bookable rooms and assistants on shift, you can implement any strategy to choose the resources for the booking. T
                //just sequentially pick the first ones in the list
                System.out.println("Booking added successfully:");
                //System.out.println(print booking);
                System.out.println();
                System.out.println("List of available time-slots:");
                //system.out.println(List of available slots + 11, 12,...)
                //11. dd/mm/yyyy HH:MM;
                //12. dd/mm/yyyy HH:MM;
                //13. dd/mm/yyyy HH:MM;
               // ...;
                System.out.println();
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (valid = false) {
                System.out.println(ERROR);

                //add in some potential errors
                //System.out.println(message explaining the error);

                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
        }
        else if (userOption == 9) {
            //collection.clear(); //clear interface
            Boolean valid = true;
            System.out.println("University of Knowledge - COVID test");
            System.out.println();
            //System.out.println(list booking status:SCHEDULED); //list of bookings with the status scheduled
            System.out.println("Removing booking from the system");
            System.out.println();
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();
            if (valid = true) {
                //remove the booking from the system
                System.out.println("Booking removed successfully:");
                //System.out.println(print booking); //print the booking that was just removed
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (valid = false) {
                System.out.println(ERROR);

                //add in some potential errors
                //System.out.println(message explaining the error);



                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
        }
        else if (userOption == 10) {
            //collection.clear(); //clear interface
            Boolean valid = true;
            //Conclude Booking: If a user selects 10 from the Manage Booking menu, they can conclude (finish) a booking.
            //That is, the testing was performed as planned and the record can no longer be deleted from the system.
            //The screen shows:
            System.out.println("University of Knowledge - COVID test");
            System.out.println();

            //System.out.println(list booking status:SCHEDULED) //print the list of bookings with the status: SHEDULED

            System.out.println("Conclude booking");
            System.out.println();
            System.out.println("Please, enter one of the following:");
            System.out.println();
            System.out.println("The sequential ID to select the booking to be completed.");
            System.out.println(BACK);
            System.out.println(QUIT);
            System.out.println();


            //If the sequential ID is valid, complete the respective booking in the system, and append the screen with the following:
            //complete booking, add to scheduled bookings

            if (valid = true) {
                System.out.println("Booking completed successfully:");
                System.out.println(print Booking.getBooking()); //print the successful booking
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the booking to be completed.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }
            else if (valid = false) {

                //If the entry is NOT valid, the system remains unchanged. Append the screen with the following to explain the problem:
                System.out.println(ERROR);
                System.out.println("Your booking id is invalid, please try again");
                System.out.println("Please, enter one of the following:");
                System.out.println();
                System.out.println("The sequential ID to select the booking to be completed.");
                System.out.println(BACK);
                System.out.println(QUIT);
                System.out.println();
            }

            //public static final String BACK = "0. Back to main menu.";
            else if (userOption == -1){ //"-1. Quit application."
              System.exit(1);
            }
            else if (userOption == 0){ //"0. Back to main menu."
              someMethod();
            }
        }

    }

}
