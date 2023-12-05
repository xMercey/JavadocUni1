package pr1.a03;

import java.io.PrintWriter;
import java.util.Locale;

public class SomeFormats {
	public static void main (String[] args ) {
		Locale.setDefault(Locale.US);
		PrintWriter out = new PrintWriter (System.out);
		out.printf(prettyInt(2+3*4, 8));
		out.printf("%n");
		out.printf(prettyNumber(40.0/3.0, 8, 3));
		out.printf("%n");
		printPretty(out, 70.0/8.0, 8, 3);
		out.flush();
	}
	
	public static String prettyInt(int n, int width) {
		String s = String.format("\"%"+width+"d\"", n);
		return (s);
	}
	
	public static String prettyNumber (double n, int width, int precision) {
		String s = String.format("\"%"+width+"."+precision+"f\"", n);
		return (s);
	}
	
	public static void printPretty (PrintWriter out, double n, int width, int precision) {
		out.printf(prettyNumber(n, width, precision));
	}
}
