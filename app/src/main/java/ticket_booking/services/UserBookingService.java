package ticket_booking.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket_booking.entities.User;

public class UserBookingService {
	
	private User user;
	
	private List<User> userList;
	
	private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	private static final String USERS_PATH = "app/src/main/java/ticket_booking.localdb/users.json";
	
	//try to take the path from app itself
	
	public UserBookingService(User user1)throws IOException {
		
		this.user = user1;
		File users = new File(USERS_PATH);
		userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<User>>() {});
	}
	
	public Boolean loginUser(){//function to check if user exists in system and validate credentials
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }
	
	//stream - converts the list userList into a stream to perform functional style operations
	//filter - filters out users from the stream who name, password and hashed password match the one given
	//findFirst is an Optional class method

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

}
