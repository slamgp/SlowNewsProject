package model.rss;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rss")
public class CNN {
	private Channel channel;

	public CNN() {
	}
	
	public CNN(Channel channel) {
		this.channel = channel;
	}
	@XmlElement
	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
}
