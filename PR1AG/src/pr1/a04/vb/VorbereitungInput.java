package pr1.a04.vb;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileReader;

public class VorbereitungInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintWriter out = new PrintWriter(System.out);
        scannerAusprobieren(out);
        out.flush();
    }
    
    public static void scannerAusprobieren (PrintWriter out){
    	Scanner in = new Scanner(new FunnyFirstFileReader("./data/testfiles/zahlen01.txt"));
    	String intNumbers = "46 2 63 7 84 12 69 34 55";
        String doubleNumbers = "49.35 3.87 28.05 2.76 13.65 5.4 7.88 33.9 98.56";
        String mixedNumbers = "43 5.75 45.7 72 69 3.45 87.43";
        scannerAusprobierenInt(out, intNumbers);
        scannerAusprobierenDouble(out, doubleNumbers);
        scannerAusprobierenMixed(out, mixedNumbers);
        scannerFiles(out, in);
    }
    
    public static void scannerAusprobierenInt (PrintWriter out, String intNumbers){
        Scanner in = new Scanner (intNumbers);
        while (in.hasNextInt()) {
            int number = in.nextInt();
            out.print("Zahl:" + number + " ");
        }
        in.close();
        out.println();
    }  
    
    public static void scannerAusprobierenDouble (PrintWriter out, String doubleNumbers){
        Scanner in = new Scanner (doubleNumbers);
        while (in.hasNextDouble()) {
            double number = in.nextDouble();
            out.print("Zahl:" + number + " ");
        }
        in.close();
        out.println();
    }
    
    public static void scannerAusprobierenMixed (PrintWriter out, String mixedNumbers){
        Scanner in = new Scanner (mixedNumbers);
        while (in.hasNext()) {
        	while (in.hasNextInt()) {
                 int number = in.nextInt();
                 out.print("Zahl:" + number + " ");
        	} if (in.hasNextDouble()) {
            double number = in.nextDouble();
            out.print("Zahl:" + number + " ");
        	}
        }
        in.close();
        out.println();
    }
    
    public static void scannerFiles (PrintWriter out, Scanner in){
    	out.println();
    	out.println("Aus der Textdatei lesen:");
        while (in.hasNext()) {
        	while (in.hasNextInt()) {
                 int number = in.nextInt();
                 out.print("Zahl:" + number + " ");
        	} if (in.hasNextDouble()) {
            double number = in.nextDouble();
            out.print("Zahl:" + number + " ");
        	}
        }
        in.close();
    }
    
}
