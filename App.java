import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Movie Recomendation Engine UI Entry Point
 * Use Java Swing Framework
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 */
public class App {
	public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() { // anonymous method
		public void run() {
			JFrame frame = new Frame("Movie Recommendation Engine");
			frame.setSize(1000,2000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
	});
	}
}
