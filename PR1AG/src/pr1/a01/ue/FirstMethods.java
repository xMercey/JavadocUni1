package pr1.a01.ue;
import java.io.PrintWriter;
import java.util.Locale;

public class FirstMethods {
	public static void main (String[] args ) {
		Locale.setDefault(Locale.US);
		PrintWriter out = new PrintWriter (System.out);
		printDecorated(out, "20.10.: Aufgabe 1");
		printValue(out, 5);
		printValue(out, 8);
		printFlaecheSiebeneck (out, 2.2);
		printFlaecheSiebeneck (out, 4.0);
		out.flush();
	}
	
	public static void printDecorated (PrintWriter out, String text) {
	out.println("**************");
	out.println(text);
	out.println("**************");
	}
	
	public static int value (int a) {
		return (a + 1 + 5 + 7)*9 - a;
	}
	
	public static void printValue (PrintWriter out, int a) {
		out.print("Ergebnis von Value für a = "+ a + ": ");
		out.println(value(a));
	}
	
	public static double flaecheSiebeneck (double a) {
		// https://www.mathematische-basteleien.de/siebeneck.htm
		return (7.0 * a*a) / (4.0 * Math.tan(Math.PI / 7.0));
	}
	
	public static void printFlaecheSiebeneck (PrintWriter out, double a) {
		out.print("Fläche des regelmäßigen Siebenecks für a = " + a + ": ");
		out.println(flaecheSiebeneck(a));
	}
}

