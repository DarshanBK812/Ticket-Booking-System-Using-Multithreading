package Ticket_Booking_System;

public class Main {
	
	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
		
		TicketBookingThread  user1 = new TicketBookingThread(ticketCounter, "Bhavana", 3);
		TicketBookingThread user2 = new TicketBookingThread(ticketCounter, "cat", 5);
		TicketBookingThread user3 = new TicketBookingThread(ticketCounter, "dog", 3);
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}
