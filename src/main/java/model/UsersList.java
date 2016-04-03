package model;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
	
	private static List<User> instance = new ArrayList<User>();
	
	private UsersList() {
	}
	
	public static List<User> getInstance() {
		return instance;
	}
	
	public static User getUser(String login, String password) {
		for(User user: instance){
			if(user.getLogin().equals(login) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return  null;
	}
	
}
