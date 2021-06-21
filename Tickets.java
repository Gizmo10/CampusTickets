package CampusTickets;
/*This is an abstract class for Ticket object. The subclasses are tickets to campus events
 */
public abstract class Tickets {
    //serial number of the Ticket which is unique
   private String serialNumber;

    //constructor of the abstract class
    public Tickets(String serialNumber){
        this.serialNumber = serialNumber;
    }

    /*The method to return the price of the Ticket,which is abstract and implemented by
    subclasses
     */
    public abstract double getPrice();

    //returns the serial number of  the ticket
    public String getSerialNumber(){
        return serialNumber;
    }

    //returns the String representation of the object
    public String toString(){

        return("Number: " + getSerialNumber() + " , Price: R" + getPrice());
    }

    //tests for equality of the objects
    public boolean equals(Object o){
        //Is o a Ticket
        if(o instanceof Tickets){
            Tickets t = (Tickets) o;

            return(this.serialNumber.equals(t.serialNumber));
        }else{
            return false;
        }
    }
}

