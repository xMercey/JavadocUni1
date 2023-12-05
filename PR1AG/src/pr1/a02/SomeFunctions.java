package pr1.a02;

import java.io.PrintWriter;
import java.util.Locale;

public class SomeFunctions {
	public static void main (String[] args ) {
		Locale.setDefault(Locale.US);
		PrintWriter out = new PrintWriter (System.out);
		printkreisUmfang(out, 3);
		printkreisUmfang(out, 6);
		printrechteckUmfang(out, 2,4);
		printrechteckUmfang(out, 4,6);
		printrechteckFlaeche(out, 2,9);
		printrechteckFlaeche(out, 3,6);
		out.flush();
	}

	
	public static double kreisUmfang (double radius) {
		double ergebnis = 2 * Math.PI * radius;
		return ergebnis;
	}

	public static void printkreisUmfang (PrintWriter out, double radius) {
		out.print("Ergebnis von Kreis Umfang für Radius = "+ radius + ": ");
		out.println(kreisUmfang(radius));
	}
	
	public static double rechteckUmfang (double a, double b) {
		double ergebnis = 2 * a + 2 * b;
		return ergebnis;
	}
	
	public static void printrechteckUmfang (PrintWriter out, double a, double b) {
		out.print("Ergebnis von Rechteck Umfang für die Länge = "+ a + " " + b + ": ");
		out.println(rechteckUmfang(a, b));
	}
	
	public static double rechteckFlaeche (double a, double b) {
		double ergebnis =a * b;
		return ergebnis;
	}
	
	public static void printrechteckFlaeche (PrintWriter out, double a, double b) {
		out.print("Ergebnis von Rechteck Fläche mit den Werten = "+ a + " " + b + ": ");
		out.println(rechteckFlaeche(a, b));
	}
}
