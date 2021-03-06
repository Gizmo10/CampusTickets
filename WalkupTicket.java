/*This is a subclass of Tickets and has a field for price that holds
the price of an event. This type of ticket can only be bought on the day of event at R50,00
 */
package CampusTickets;

public class WalkupTicket extends Tickets{
    //field to store the ticket price
    private double price;

    //constructor for WalkUpTicket
    public WalkupTicket(String serialNumber){
        super(serialNumber);//calls the constructor of the superclass Tickets
        this.price = 50.00;
    }

    //implements the abstract method getPrice
    public double getPrice(){

        return price;
    }

}
