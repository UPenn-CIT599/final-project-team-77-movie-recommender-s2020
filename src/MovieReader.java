  
/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MovieReader {
	private HashMap<Integer, Movie> movieData;
	int blankData = 0;
	/**
	 * Inside the MovieReader class, we have a MovieReader function that returns a HashMap.
	 * The movie reader function reads the entire csv file and store the data into a movieData hashmap.
	 */

	public HashMap<Integer, Movie> MovieReader(String movieFile) {
		File userFile = new File(movieFile);
		movieData = new HashMap<Integer, Movie>();
		int counter = 0; 
		try {
			Scanner scanner = new Scanner(userFile);
			scanner.nextLine();
			while(scanner.hasNextLine()) {
				String movieRow = scanner.nextLine();
				char[] chars = movieRow.toCharArray();
				int quotationCounter = 0;
				//Replacing commas with '}' so that they can be split into columns
				for(int i = 0; i < chars.length; i++) {
					//If quotation is odd, meaning a string is being read in the csv file, do not replace the comma
					if(chars[i] == '"') {
						quotationCounter++;
					}
					//To ensure the | is placed correctly if a column is empty
					if(chars[i] == ',' && quotationCounter % 2 == 0) {
						chars[i] = '}';
					}
				}
				movieRow = String.copyValueOf(chars);
				String[] columnData = movieRow.split("}");
				//Splitting the column data
				String movieTitle = columnData[1];
				int movieYear = Integer.parseInt(columnData[3]);
				String genre = (columnData[5].replaceAll("\"", "")).toLowerCase();
				String director = columnData[9].toLowerCase();
				String actors = (columnData[12].replaceAll("\"", "")).toLowerCase();
				double movieRating = Double.parseDouble(columnData[14]);
				Movie m = new Movie(movieTitle, movieRating, genre, movieYear,
						director, actors);
				counter++;
				movieData.put(counter, m);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return movieData;
		
	}
}
