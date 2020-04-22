import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Frame class for the UI box
 * Use Java Swing Framework
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 */
public class Frame extends JFrame {
	private Pannel pannel;
	/*
	 * Frame constructor
	 * @param frame title
	 */
	public Frame(String title) {
		super(title);
		
		// set layout
		setLayout(new BorderLayout());
		
		// crate swing component
		final JTextArea textArea = new JTextArea();
		
		pannel = new Pannel();
		
		pannel.addListener(new Listener() {
			public void eventOccurred(Event event) {
				String text = event.getText();
				textArea.append(text);
			}
		});
		
		Container c = getContentPane();
		
		c.add(textArea,BorderLayout.CENTER);
		c.add(pannel,BorderLayout.WEST);
	}

}
