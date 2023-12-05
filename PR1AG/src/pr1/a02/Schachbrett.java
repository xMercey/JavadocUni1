package pr1.a02;

import java.io.PrintWriter;

public class Schachbrett {
	public static void main (String[] args ) {
		PrintWriter out = new PrintWriter (System.out);
		printSchachbrett(out);
		printSchachbrettReverse(out);
		out.flush();
	}
	
	public static String schachbrett() {
		StringBuilder sb = new StringBuilder();
		for(int reihe = 8; reihe>=1; reihe--) {
			for (char spalte = 'A'; spalte <='H'; spalte++) {
				sb.append(spalte).append(reihe).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void printSchachbrett(PrintWriter out) {
		String sb = schachbrett();
		out.println(sb);
	}
	
	public static String schachbrettReverse() {
		StringBuilder sb = new StringBuilder();
		for(int reihe = 1; reihe<=8; reihe++) {
			for (char spalte = 'H'; spalte >='A'; spalte--) {
				sb.append(spalte).append(reihe).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void printSchachbrettReverse(PrintWriter out) {
		String sb = schachbrettReverse();
		out.println(sb);
	}
}
