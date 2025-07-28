package july28;
class MovieTicketBooking{
	int availableTickets=5;
	
	synchronized void bookTicket(String userName,int numberOfTickets) {
		System.out.println(userName +" is trying to book "+numberOfTickets+ " tickets.");
		if(numberOfTickets <= availableTickets) {
			System.out.println("Tickets available for booking");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Booking interrupted");
			}
			availableTickets-=numberOfTickets;
			System.out.println(userName+" successfully booked "+numberOfTickets+" tickets");
			System.out.println("Tickets left: "+availableTickets);
		}
		else {
			System.out.println("sorry "+userName + ", not enough tickets available");
		}
	}
}
class BookingThread extends Thread {
    MovieTicketBooking bookingSystem;
    String userName;
    int ticketsToBook;

    BookingThread(MovieTicketBooking bookingSystem, String userName, int ticketsToBook) {
        this.bookingSystem = bookingSystem;
        this.userName = userName;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        bookingSystem.bookTicket(userName, ticketsToBook);
    }
}

public class TicketBookingMain {
      public static void main(String[] args) {
    	  MovieTicketBooking booking=new  MovieTicketBooking();
    	  
    	  BookingThread user1=new BookingThread(booking,"Anand",4);
    	  BookingThread user2=new BookingThread(booking,"Mounika",5);
    	  user1.start();
    	  user2.start();
	}
}
