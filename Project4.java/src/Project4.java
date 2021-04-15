/**
 * Instantiate two linked lists
 * First list having the Candles from the input file in the order they were read
 * In the second list the Candles will be in sorted order
 * Reads the data from a file and tokenizes it 
 * Displays the candles to the GUI's
 * @author melaniebeni
 *
 */

public class Project4 {
	static CandleGUI gui;
    static SortedCandleList sl=new SortedCandleList();
	public static void main(String[] args) {
		gui = new CandleGUI("Candles");
	}// main

}// Project3