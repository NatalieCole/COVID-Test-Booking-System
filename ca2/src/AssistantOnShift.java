//import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
//import java.util.function.Function;
/**This class defines an asssistant on shift (object) who is has shifts and is present during the booked covid tests*/
public class AssistantOnShift {
    public LocalDateTime dateAndTime;
    public String AssistantOnShiftstatus;
    boolean available;
    public Boolean removable;

    public String FREE;
    public String BUSY;
    //constructor:
    public AssistantOnShift(LocalDateTime dateAndTime, String AssistantOnShiftstatus) {
        /**Constructs the asssistant on shift class*/
        this.dateAndTime = dateAndTime;
        this.AssistantOnShiftstatus = AssistantOnShiftstatus;
    }

    //public string assistantEmail
    public String getAssistantStatus(){
        /** Calculates the status of the assistant of shift (based on its availability) and returns said status
         * @return the status of the assistant on shift
         */
        if (available == true) {
            this.AssistantOnShiftstatus = FREE;
        }
        else if (available == false){
            this.AssistantOnShiftstatus = BUSY;
        }
        return this.AssistantOnShiftstatus;
    }
    public boolean isRemovable(){
        /** Returns whether or not the  assistant on shift is removable based on its status
         * @return the boolean value of removeable
         */
        if (this.AssistantOnShiftstatus == FREE){
            removable = true;
        }
        else {
            removable = false;
        }
        return removable;
    }

  //  list assistant on shifts status:FREE
    public ArrayList FREEassistantsOnShiftlist;
    public ArrayList getFREEassistantsOnShiftlist(){
      /** This function loops through all of the asssitants on shift in the list, and selects the ones with a FREE status and puts them in a list specific for that type of assitants on shift
      *@return the list of assistants on shift with a FREE status*/

      for(int i = 0; i < FREEassistantsOnShiftlist.size(); i++) {
        if (this.AssistantOnShiftstatus == FREE){
          this.dateAndTime = dateAndTime;
          this.AssistantOnShiftstatus = AssistantOnShiftstatus;
          FREEassistantsOnShiftlist.add(new AssistantOnShift(dateAndTime, AssistantOnShiftstatus));
        }
      }
      return FREEassistantsOnShiftlist;
    }

//assistant is registered to shifts for the entire day (7 AM to 10 AM). Given the current 60-minute duration of a
//time-slot, when selecting a date, the system will be creating three assistant on shifts.
//6. Print template: | <dd/mm/yyyy HH:MM> | <status> | <assistantEmail> |
}
