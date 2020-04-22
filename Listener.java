import java.util.EventListener;

/*
 * Listener interface, define only method, no implementations
 */
public interface Listener extends EventListener {
	public void eventOccurred(Event event);
}
