package practiceProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StatesCensus {

	public List<List<String>> statesCensus() throws FileNotFoundException {
		List<List<String>> input = new ArrayList<List<String>>();
		Scanner userInput = new Scanner(new File("StateNames.csv"));
		while (userInput.hasNextLine()) {
			Scanner lineSc = new Scanner(userInput.nextLine()).useDelimiter("\t");
			List<String> line = new ArrayList<String>();
			while (lineSc.hasNext()) {
				line.add(lineSc.next());
			}
			input.add(line);
		}
		return input;

	}

	public static void main(String[] args) throws FileNotFoundException {
	}
}