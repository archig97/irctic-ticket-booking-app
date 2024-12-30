package ticket_booking.services;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import ticket_booking.entities.User;

public class UserBookingService {
	
	private User user;
	
	private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	private static final String USERS_PATH = "../ticket_booking.localdb/users.json";
	
	public UserBookingService(User user) {
		
		this.user = user;
		File users = new File(USERS_PATH);
	}

}
