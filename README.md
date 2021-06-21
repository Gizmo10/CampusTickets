# CampusTickets
The program creates objects of event tickets sold on campus. The objects have and 
is-a relationship with superclass Tickets. A Tickets has a unique serial number
and each type has its own price.

#WalkupTicket
This type of object is purchased on the day of the actual event at a price of
R50,00. The constructor take serial number as parameter.

#AdvanceTicket
This type of object can be purchased before the day of the event.The construc-
tor takes two parameters, serial number and days before event it was purchased.
This type of ticket is R30 when purchased in 10 days before event or less days
and R40 if purchased more than 10 days before event.

#StudentAdvanceTicket
This is-a AdvanceTicket by inheritance and costs 50% less than an AdvanceTicket
using the number of days purchased like it's parent class.
