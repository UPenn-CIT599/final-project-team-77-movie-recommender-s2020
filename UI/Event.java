import java.util.EventObject;

public class Event extends EventObject {
	private String text;
	
	/*
	 * Event constructor, taking text input
	 */
	public Event(Object source, String text) {
		super(source);
		this.text = text;
	}
	/*
	 * get text input for movie recommendation
	 */
	public String getText() {
		return this.text;
	}
}
