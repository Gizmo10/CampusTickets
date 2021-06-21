# CampusTickets
The program creates objects of event tickets sold on campus. The objects have an 
is-a relationship with superclass Tickets. Tickets have a unique serial number
and each type has its own price.

#WalkupTicket
This type of object is purchased on the day of the actual event at a price of
R50,00. The constructor takes a serial number as parameter.

#AdvanceTicket
This type of object can be purchased before the day of the event.The construc
tor takes two parameters,a serial number and days before event it was purchased.
This type of ticket is R30 when purchased 10 days before event or less
and R40 if purchased more than 10 days before event.

#StudentAdvanceTicket
This is-a AdvanceTicket by inheritance and costs 50% less than an AdvanceTicket
using the number of days purchased like it's parent class.

#TicketsMain
This is the main class with client code to test all objects for bugs.The tests
came out with all bugs fixed.
