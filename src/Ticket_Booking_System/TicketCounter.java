package Ticket_Booking_System;

public class TicketCounter {

	private int availableTickets = 10;

	public synchronized void bookTicket(String user, int numTicktes) {
		if (availableTickets >= numTicktes) {

			System.out.println(user + " is booking " + numTicktes + " tickets");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			availableTickets -= numTicktes;
			System.out.println(user + " successfully booked " + numTicktes + " tickets");
			System.out.println("Remaining ticktes :" + availableTickets);

		} else {
			System.out.println(user + " failed to book. Not enough tickets available.");
			System.out.println("available tickets :" + availableTickets);
		}

	}

}
