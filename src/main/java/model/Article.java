package model;

public class Article {
	private String image;
	private String header;
	private String body;

	public Article() {
	}

	public Article(String image, String header, String body) {
		super();
		this.image = image;
		this.header = header;
		this.body = body;
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
}
