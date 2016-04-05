package model.rss;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="item")
public class Item {
	private String title;
	private String link;
	private String description;

	public Item() {
	}

	public Item(String title, String link, String description) {
		super();
		this.title = title;
		this.link = link;
		this.description = description;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return title + " | " + link + " | " + description;
	}
	
}
