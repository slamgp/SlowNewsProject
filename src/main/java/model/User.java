package model;

public class User {
	
	private int id;
	private String email;
    private String login;
    private String password;
    
    public final static String TABLE_NAME = "\"user\"";
    public static interface KEY_FILEDS {
    	final static String ID = "id";
    	final static String EMAIL = "email";
    	final static String LOGIN = "login";
    	final static String PASSWORD = "password";
    };
    
	public User() {
	}
    
	public User(String email, String login, String password) {
		this.email = email;
		this.login = login;
		this.password = password;
	}
	
	public User(String email, String login, String password, int id) {
		this.email = email;
		this.login = login;
		this.password = password;
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
