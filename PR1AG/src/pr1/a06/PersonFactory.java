package pr1.a06;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Scanner;
import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileReader;

public class PersonFactory {
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		createTestPersons();
		out.flush();
	}
	
	public static ArrayList<Person> createTestPersons() {
		Scanner in = new Scanner(new FunnyFirstFileReader("./data/person06.txt"));
//		PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter("./data/person06b.txt"));
		ArrayList<Person> pList = new ArrayList<>();
		while (in.hasNext()) {
             Person person = Person.parse(in.nextLine());
             pList.add(person);
        }
		 
//		for (int i = 0; i < pList.size(); i++) {
//		    Person person = pList.get(i);
//		    fout.println(person.toString()); 
//		}
		
		in.close();
//		fout.close();
		return pList;
	}
}
