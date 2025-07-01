package Ticket_Booking_System;

public class TicketBookingThread extends Thread {

	private TicketCounter counter;
	private String user;
	private int numsOfTickets;

	public TicketBookingThread(TicketCounter counter, String user, int numOfTickets) {
		this.counter = counter;
		this.user = user;
		this.numsOfTickets = numOfTickets;
	}

	@Override
	public void run() {
		counter.bookTicket(user, numsOfTickets);
	}

}
