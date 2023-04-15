import java.util.Scanner;
 /**This class defines an assistant (object) who works at the university, and can be used as an assitant on shift */
public class Assistant {
   
    public String email;
    public String name;
    public String assistantsOnShifts;
    
    public String getEmail(){
        /** @return a unique emai for each assistant */
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
      
        if (assistantsOnShifts.contains(this.email)) {
            System.out.print("This email already exists for an assistant, please try again");
            String newEmail= sc.nextLine(); //reads string.
            return newEmail;
        } 
        else {
            return this.email;
        }
    }
    public String setName() {
        /** Sets the name of the assistant if it is not a blank 
         * @return a string that is either the name, or a message saying that the name cannot be blank
        */
        if (this.name != null){
            return this.name;
        }
        else{return "Name cannot be blank";}
    }

    //System.out.print(getName + getEmail);

    //connstructor
    public Assistant(String email, String name) {
        /**Constructs the asssistant */
        this.email = email;
        this.name = name;
    }
}

//Print template: | <name> | <email> |