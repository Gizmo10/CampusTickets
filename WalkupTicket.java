/*This is a subclass of Tickets and has a field for price that holds
the price of an event. This type of ticket can only be bought on the day of event at R50,00
 */
package CampusTickets;

public class WalkUpTicket extends Tickets{
    //field to store the ticket price
    double price;

    //constructor for WalkUpTicket
    public WalkUpTicket(String serialNumber){
        super(serialNumber);//calls the constructor of the superclass Tickets
        this.price = 50.00;
    }

    //implements the abstract method getPrice
    public double getPrice(){

        return price;
    }

}
