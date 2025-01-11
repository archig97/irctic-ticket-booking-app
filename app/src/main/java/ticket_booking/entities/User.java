package ticket_booking.entities;

import java.util.List;

public class User {
	
	private String name;
	
	private String password;
	
	private String hashedPassword;
	
	private String userId;
	
	private List<Ticket> ticketsBooked;
	
	public User(String name, String password, String hashedPassword, String userId, List<Ticket> ticketsBooked) {
		this.name = name;
		this.password = password;
		this.hashedPassword = hashedPassword;
		this.userId = userId;
		this.ticketsBooked = ticketsBooked;
	}
	
	public User() {} //default constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Ticket> getTicketsBooked() {
		return ticketsBooked;
	}

	public void setTicketsBooked(List<Ticket> ticketsBooked) {
		this.ticketsBooked = ticketsBooked;
	}
	
	public void printTickets() {
		for(int i=0;i<ticketsBooked.size();i++){
			System.out.println(ticketsBooked.get(i).getTicketInfo());
		}
	}

}
