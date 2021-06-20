/*Constructs an object that is an advance ticket but for students.
This qualifies students for a discount on the prices
 */
package CampusTickets;

public class StudentAdvanceTicket extends AdvanceTicket{
    //The object will inherit all fields from its parent class

    //Constructor uses the serial number and days to event
    public StudentAdvanceTicket(String serialNumber, int numOfDaysToEvent){
        //calls the parent constructor
        super(serialNumber, numOfDaysToEvent);
    }

    //We override the getPrice method of the parent class
    public double getPrice(){
         /*Calls the parent method to compute price of ticket by number
         of days and halves it  (50% discount)
          */
        return (super.getPrice()/2.0);
    }

    //Override the toString() method so that it also asks for a Student ID
    public String toString(){

        //The method concatenates (ID IS REQUIRED) to the result of the parent toString() method
        return  (super.toString() + " (ID IS REQUIRED).");
    }
}
