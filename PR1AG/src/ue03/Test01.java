package ue03;
import java.io.PrintWriter;

import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileWriter;

public class Test01 {
	public static void main (String[] args ) {
		PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter("./data/test01.txt"));
		int i = 0;
		while (i < 10) {
            int randomInt = (int) (1 + Math.random() * 5);
            fout.print(randomInt);
            i++;
            fout.print(" ");
		}
		fout.close();
	}
}


