package pr1.a03;

import java.io.PrintWriter;
import java.util.Locale;

import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileWriter;

public class Aufgabe0310 {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        writeIntNumberFile("./data/aufgabe0310_1.txt", 100);
        writeMixedNumberFile("./data/aufgabe0310_2.txt", 67, 10);
    }

    public static void writeIntNumberFile(String filename, int numberCount) {
        PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter(filename));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (numberCount % 2 != 0) {
            numberCount++;
        }
        while (i < numberCount) {
            int randomZahl = (int)(Math.random() * 1000);
            String numberFormatted = String.format("%6d", randomZahl);
            sb.append(numberFormatted);
            if ((i + 1) % 10 == 0) {
                sb.append('\n');
            }
            i++;
        }
        fout.print(sb.toString());
        fout.close();
    }

    public static void writeMixedNumberFile(String filename, int numberCount, int width) {
        PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter(filename));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (numberCount % 2 != 0) {
            numberCount++;
        }
        while (i < numberCount) {
        	int randomInt = (int) (Math.random() * 1000);
            double randomDouble = (double) (Math.random() * 1000);
            int randomZahl = (int) (Math.random() * 1000);
            if (randomZahl % 2 == 0) {
            	String number = String.format("%" + width + "d", randomInt);
                sb.append(number); // Ganzzahl
            } else {
                String numberFormatted = String.format("%" + width + ".2f", randomDouble);
                sb.append(numberFormatted); // Gleitkommazahl
            }
            if ((i + 1) % 10 == 0) {
                sb.append('\n');
            }
            i++;
        }
        fout.print(sb.toString());
        fout.close();
    }
}

