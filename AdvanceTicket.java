/*The AdvanceTicket object has price, serial number and number of days to event.
It determines the price according to days left to event.
This class is a subclass of abstract class Tickets
 */
package CampusTickets;

public class AdvanceTicket extends Tickets {
    //private fields
    private double price;
    private int numOfDaysToEvent; //stores the number of days left before event starts

    //Constructor that takes serial number and days left to event as parameters
    public AdvanceTicket(String serialNumber, int numOfDaysToEvent){
        //calls the parent constructor
        super(serialNumber);
        this.numOfDaysToEvent = numOfDaysToEvent;
    }


    //Implements the abstract method getPrice
    public double getPrice(){

        /*If the ticket is purchased 10 days of more in advance
        set price to R30.00 else R40.00
         */
        if(numOfDaysToEvent >= 10){

            price = 30.00;
        }else{
            price = 40.00;
        }

        return price;
    }
}
