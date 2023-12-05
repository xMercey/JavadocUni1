package pr1.a06;

import java.io.PrintWriter;
import java.util.ArrayList;

public class PersonTest {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Person> persons = PersonFactory.createTestPersons();
		printPersons(out, persons);
	}

	public static void printPersons(PrintWriter out, ArrayList <Person> persons) {
		for (Person person : persons) {
			out.println(person);
		}
		out.flush();
	}
}
