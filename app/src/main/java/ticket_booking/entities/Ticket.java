package ticket_booking.entities;

import java.util.Date;

public class Ticket {
	
	private String ticketId;
	
	private String userId;
	
	private String source;
	
	private String destination;
	
	private Date dateOfTravel;
	
	public Ticket(String ticketId, String userId, String source, String destination, Date dateOfTravel, Train train) {
		super();
		this.ticketId = ticketId;
		this.userId = userId;
		this.source = source;
		this.destination = destination;
		this.dateOfTravel = dateOfTravel;
		this.train = train;
	}
	
	public String getTicketInfo() {
		
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	private Train train;

}
