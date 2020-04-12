import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;


public class Pannel extends JPanel {
	
	final Recommender recommend;
	
	private EventListenerList listenerList = new EventListenerList(); // create list of events
	
	public Pannel() {
		// instantiate a recommender object
		this.recommend = new Recommender();
		Dimension size = getPreferredSize();
		size.width = 1000;
		size.height = 300;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Your selection criteria"));
		
		JLabel genreLabel = new javax.swing.JLabel("Genre: ");
		JLabel yearLabel = new JLabel("Year 1 (1900-1929) 2(1930-1959) 3(1960-1979) 4(1980-1999) 5(2000-2019): ");
		JLabel ratingLabel = new javax.swing.JLabel("Minimal Rating (1-10): ");
		JLabel castLabel = new javax.swing.JLabel("Cast(Firstname Lastname): ");
		JLabel directorLabel = new javax.swing.JLabel("Director((Firstname Lastname): ");
		JLabel numOfMovieLabel = new javax.swing.JLabel("NumOfMoviesWanted (between 1 to 100, default 5): ");
		
		JTextField genreField = new JTextField(20);
		JTextField yearField = new JTextField(20);
		JTextField ratingField = new JTextField(20);
		JTextField castField = new JTextField(20);
		JTextField directorField = new JTextField(20);
		JTextField numOfMovieField = new JTextField(20);
		
		JButton button = new JButton("Give me movie recomendations!");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String genre = genreField.getText();
				int year = Integer.parseInt(yearField.getText());
				double rating = Double.parseDouble(ratingField.getText());
				String actors = castField.getText();
				String director = directorField.getText();
				int numberOfMovies = Integer.parseInt(numOfMovieField.getText());
				
				// passing the main function's logic to here
				StringBuilder recommended = new StringBuilder("");
//				Recommender recommend = new Recommender();
				ArrayList<Movie> movieRecommendations = recommend.CompareInput(genre, year, rating, actors, director);
				//Picking five random movies by default. Number of movie recommendations is dependent on numberOfMovies input. Can be more or less than 5.
				ArrayList<Movie>Top5movieRecommendations = recommend.RandomPull(numberOfMovies, movieRecommendations);
				//Printing out the recommendations. Output is Movie Title. Default is a list of 5 movies.
				for(int i = 0; i < Top5movieRecommendations.size(); i++) {
					String movie = String.valueOf(i+1) + ". " + movieRecommendations.get(i).getMovieTitle() + '\n';
					recommended.append(movie);
				}
				recommended.append("\n");
				
				fireEvent(new Event(this, recommended.toString()));
			}
		});
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		//// first column
//		JLabel genreLabel = new javax.swing.JLabel("Genre: ");
//		JLabel yearLabel = new JLabel("Year 1 (1900-1929) 2(1930-1959) 3(1960-1979) 4(1980-1999) 5(2000-2019): ");
//		JLabel ratingLabel = new javax.swing.JLabel("Minimal Rating (1-10): ");
//		JLabel castLabel = new javax.swing.JLabel("Cast(Firstname Lastname): ");
//		JLabel directorLabel = new javax.swing.JLabel("Director((Firstname Lastname): ");
//		JLabel numOfMovieLabel = new javax.swing.JLabel("NumOfMoviesWanted (between 1 to 100, default 5): ");
		
		gc.anchor = GridBagConstraints.LINE_END; // make label stick to right
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(genreLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(yearLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(ratingLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		add(castLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 4;
		add(directorLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 5;
		add(numOfMovieLabel,gc);
		
		// second column
//		JTextField genreField = new JTextField(20);
//		JTextField yearField = new JTextField(20);
//		JTextField ratingField = new JTextField(20);
//		JTextField castField = new JTextField(20);
//		JTextField directorField = new JTextField(20);
//		JTextField numOfMovieField = new JTextField(20);
		
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(genreField, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(yearField,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(ratingField,gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		add(castField,gc);
		
		gc.gridx = 1;
		gc.gridy = 4;
		add(directorField,gc);
		
		gc.gridx = 1;
		gc.gridy = 5;
		add(numOfMovieField,gc);
		
	
		// final row
		gc.weighty = 3;
		
		gc.fill = GridBagConstraints.BOTH;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy = 6;
		add(button,gc);	
	}
	
	public void fireEvent(Event event) {
		Object[] listeners = listenerList.getListenerList();
		
		for (int i = 0; i < listeners.length; i += 2) {
			if (listeners[i] == Listener.class) {
				((Listener) listeners[i+1]).eventOccurred(event);
			}
		}
	}
	
	public void addListener(Listener listener) {
		listenerList.add(Listener.class,listener);
		
	}
	
	public void removeListener(Listener listener) {
		listenerList.remove(Listener.class,listener);
	}
	

}

