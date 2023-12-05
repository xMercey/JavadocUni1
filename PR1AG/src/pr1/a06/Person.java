package pr1.a06;

import java.util.Scanner;

public class Person {
	 protected String vorname;
	 protected String nachname;
	 protected int geburtsjahr;
	 
	 public Person(String vorname, String nachname, int geburtsjahr) {
	        this.vorname = vorname;
	        this.nachname = nachname;
	        this.geburtsjahr = geburtsjahr;
	 }
	 
	 public String getVorname() {
	        return vorname;
	 } 
	 
	 public String getNachname() {
	        return nachname;
	 }
	 
	 public int getGeburtsjahr() {
	        return geburtsjahr;
	 }
	 
	 public String toString() {
		 	return String.format("%-10s %-10s %4d", vorname, nachname, geburtsjahr);
	    }
	 
	 public static Person parse(String input) {
		Scanner in = new Scanner(input);
		String vorname = in.next();
		String nachname = in.next();
		int geburtsjahr = in.nextInt();
		in.close();		
		Person person = new Person (vorname, nachname, geburtsjahr);
		return person;
	 }
}
