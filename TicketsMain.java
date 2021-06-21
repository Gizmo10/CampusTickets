/*This class is the main class for the Ticket subclasses and
it is used to test the methods of the subclasses. The client code
is used to find bugs in the subclasses.
 */

package CampusTickets;

public class TicketsMain {
    //The main method
    public static void main(String [] args){
        /*Declares an array of Ticket objects and the parent
        abstract class points to it's subclasses using polymorphic
        assignment.
         */
        Tickets [] eventTickets = {new WalkupTicket("1001"), new AdvanceTicket("1002",11),
        new AdvanceTicket("1003", 7),new StudentAdvanceTicket("1004",13),
        new StudentAdvanceTicket("1005",5)};

        /*The loop will iterate through the array of Tickets and display each
        objects String representation. getPrice and getSerialNumber are called in
        the class representation of each object, toString tests them implicitly in
        client code.
         */
        for(Tickets t: eventTickets){
            //Print a line to console
            System.out.println(t);
        }

    }
}
