package model.rss;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="channel")
public class Channel {
	
	private Item [] item = new Item[25];

	public Channel() {
	}
	
	public Channel(Item []item) {
		this.item = item;
	}
	@XmlElement
	public  Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}
	
	
}
