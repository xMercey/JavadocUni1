package pr1.a06;

import java.io.PrintWriter;
import java.util.ArrayList;

import pr1.a06.PersonFactory;
import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileWriter;

public class PersonTest {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(System.out)) {
            ArrayList<Person> persons = PersonFactory.createTestPersons();
            printPersons(out, persons);
            test(out);
            printFactoryPersons(out);
            out.flush();
        }
    }

    public static void printPersons(PrintWriter out, ArrayList<Person> persons) {
        for (Person person : persons) {
            out.println(person);
        }
    }

    public static void test(PrintWriter out) {
        Person person1 = new Person("Mia", "Müller", 2002);
        Person person2 = new Person("Tim", "Heinz", 1998);
        Person person3 = new Person("Anna", "Luft", 1991);
        Person person4 = new Person("David", "Stegmann", 2000);
        Person person5 = new Person("Julia", "Loft", 2008);
        Person person6 = new Person("Susi", "Niel", 1999);
        Person person7 = new Person("Kevin", "Steitz", 1989);
        out.println();
        out.println("Ausgabe mit toString():");
        out.println(person1.toString());
        out.println(person2.toString());
        out.println(person3.toString());
        out.println(person4.toString());
        out.println(person5.toString());
        out.println(person6.toString());
        out.println(person7.toString());
        out.println();
        out.println("Ausgabe ohne toString():");
        out.println(person1);
        out.println(person2);
        out.println(person3);
        out.println(person4);
        out.println(person5);
        out.println(person6);
        out.println(person7);          
        ArrayList<Person> pList = new ArrayList<>();
        pList.add(person1);
		pList.add(person2);
		pList.add(person3);
		pList.add(person4);
		pList.add(person5);
		pList.add(person6);
		pList.add(person7);
		
		PersonTest.printPersons(out, pList);	
		PrintWriter fout = new PrintWriter(new FunnyFirstFileWriter("./data/factory_persons.txt"));
		for (Person i : pList) {
			fout.println(i);
		}
		fout.close();
	}  
    
    public static void printFactoryPersons(PrintWriter out) {
    	out.println();
    	for (Person e : PersonFactory.createTestPersons()) {
    		out.println(e);
    	}
    }
}
