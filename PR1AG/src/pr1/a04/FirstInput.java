package pr1.a04;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileReader;
import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileWriter;

public class FirstInput {
	public static void main (String[] args ) {
		Locale.setDefault(Locale.US);
		PrintWriter out = new PrintWriter(System.out);
		String input = "34 cd 67 hallo 4 65.6 3.3 2.1 8.9 7 56 1 643 75 85";
		Scanner in = new Scanner(input);
        double sum = sumOfNumbersIn(in);
        out.println("Summe der Zahlen aus der Eingabe: " + sum);
        String filename = ("./data/testfiles/zahlen01.txt");
		double ergebnis = sumOfNumbersIn(filename);
		out.printf("Summe der Zahlen aus der Textdatei: %.2f" , ergebnis);
		out.println();
		in = new Scanner(input);
        prettyPrintNumbersFrom(in, 6, 2, out);
        String destinationfilename = ("./data/testfiles/zahlen_neu.txt");
        copyNumberFile(filename, destinationfilename, 8, 3);
        out.flush();
        out.close();
    }

    public static double sumOfNumbersIn(Scanner in) {
        double sum = 0.0;
        while (in.hasNext()) {
            if (in.hasNextDouble()) {
                sum += in.nextDouble();
                continue;
            }
            in.next();
        }
        return sum;
    }
	
	public static double sumOfNumbersIn (String filename) {
		Scanner in = new Scanner(new FunnyFirstFileReader(filename));
		return sumOfNumbersIn(in);		
	}
	
	public static void prettyPrintNumbersFrom(Scanner in, int width, int precision, PrintWriter out) {
	    int numbersPerLine = 10;
	    int count = 0;
	    while (in.hasNext()) {
	        if (in.hasNextInt()) {
	            int number = in.nextInt();
	            out.printf("%" + width + "d ", number);
	            count++;
		    	if (count%numbersPerLine == 0) {
		    		out.println();
		    	}
	            continue;
	        }
	        if (in.hasNextDouble()) {
	            double number = in.nextDouble();
	            out.printf("%" + width + "." + precision + "f ", number);
	            count++;
		    	if (count%numbersPerLine == 0) {
		    		out.println();
		    	}
	            continue;
	        }
	        in.next();
	    }	    	
	}
	
    public static void copyNumberFile(String filename, String destinationfilename, int width, int precision) {
        Scanner in = new Scanner(new FunnyFirstFileReader(filename));
        PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter(destinationfilename));
        prettyPrintNumbersFrom(in, width, precision, fout);
        fout.close();
        in.close();
       }
}