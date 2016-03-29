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
	
}
