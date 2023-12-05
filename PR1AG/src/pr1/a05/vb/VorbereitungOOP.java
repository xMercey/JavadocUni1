package pr1.a05.vb;
import java.io.PrintWriter;
import java.util.Locale;

import pr1.a05.AdressPlay;
import schimkat.berlin.lernhilfe2023ws.objectPlay.AdressList;
import schimkat.berlin.lernhilfe2023ws.objectPlay.Adresse;
import schimkat.berlin.lernhilfe2023ws.objectPlay.Person;
import schimkat.berlin.lernhilfe2023ws.objectPlay.PersonList;

public class VorbereitungOOP {
	public static void main (String[] args) {
		PrintWriter out = new PrintWriter (System.out);
		Locale.setDefault(Locale.US);
		test(out);
		out.flush();
	}

	public static void test (PrintWriter out) {
		Person person1 = new Person ("Lisa", "Müller", 2004);
		Person person2 = new Person ("Tom", "Heinz", 1995);
		Person person3 = new Person ("Anna", "Maier", 1999);
		Person person4 = new Person ("David", "Schmidt", 2001);
		Person person5 = new Person ("Julia", "Wagner", 2006);
		
		PersonList pList = new PersonList();
		
		pList.add(person1);
		pList.add(person2);
		pList.add(person3);
		pList.add(person4);
		pList.add(person5);
		
		Adresse adresse1 = new Adresse (12345, "Musterstadt", "Königsstraße", 1);
		Adresse adresse2 = new Adresse (56789, "Musterdorf", "Beispielstraße", 42);	
		Adresse adresse3 = new Adresse (98765, "Erfindungsdorf", "Musterweg", 6);
		Adresse adresse4 = new Adresse (47426, "Neuenstadt", "Ideenallee", 23);
		Adresse adresse5 = new Adresse (86745, "Wusterhausen", "Kleinstraße", 10);
		
		AdressList aList = new AdressList();
		aList.add(adresse1);
		aList.add(adresse2);
		aList.add(adresse3);
		aList.add(adresse4);
		aList.add(adresse5);
		
		for (int i=0; i<pList.size(); i++) {
			out.println(pList.get(i));
			out.println(aList.get(i));		
		}
		out.println();
		AdressList aListnew = new AdressList ();
		aListnew = AdressPlay.createTestAdresses();
		for (int i = 0; i < aListnew.size(); i++) {
		    out.println(aListnew.get(i));
		}
	}
}
