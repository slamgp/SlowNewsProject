package model;

public class Article {
	private int id;
	private String image;
	private String header;
	private String body;
	
    public final static String TABLE_NAME = "article";
    public static interface KEY_FILEDS {
    	final static String ID = "id";
    	final static String IMAGE = "image";
    	final static String HEADER = "header";
    	final static String BODY = "body";
    };

	public Article() {
	}

	public Article(String image, String header, String body) {
		this.image = image;
		this.header = header;
		this.body = body;
	}

	public Article(String image, String header, String body, int id) {
		this.image = image;
		this.header = header;
		this.body = body;
		this.id = id;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
