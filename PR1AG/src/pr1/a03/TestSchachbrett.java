package pr1.a03;

import java.io.PrintWriter;

import pr1.a02.Schachbrett;
import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileWriter;

public class TestSchachbrett {
	public static void main (String[] args ) {
		printSchachbrett("./data/schachbrett.txt", false);
	}
	
	public static void printSchachbrett (String filename,  boolean isReverse) {
		PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter(filename));
		if (isReverse) {
			fout.println(Schachbrett.schachbrettReverse());
		} else {
			fout.println(Schachbrett.schachbrett());
		}	
		fout.close();
	}
}
