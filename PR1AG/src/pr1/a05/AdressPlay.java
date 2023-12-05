package pr1.a05;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2023ws.io.FunnyFirstFileReader;
import schimkat.berlin.lernhilfe2023ws.objectPlay.AdressList;
import schimkat.berlin.lernhilfe2023ws.objectPlay.Adresse;
import schimkat.berlin.lernhilfe2023ws.objectPlay.Einwohner;
import schimkat.berlin.lernhilfe2023ws.objectPlay.EinwohnerList;
import schimkat.berlin.lernhilfe2023ws.objectPlay.Factory;
import schimkat.berlin.lernhilfe2023ws.objectPlay.PersonList;


public class AdressPlay {
	public static void main (String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		Locale.setDefault(Locale.US);
        createTestAdresses();
        someInhabitants();
        out.println();
        Scanner in = new Scanner("2222 	Entenhausen 	Teichweg 	4");
        out.println(createAdresse(in));
        out.println();
        String filename = "34753 Stadt1 Straße1 43 86325 Stadt2 Straße2 5 65275 Stadt3 Straße3 7";
        out.println("Adressliste:");
        out.println(createAdressen(filename));       
        in.close();
        out.flush();
	}
	
	public static AdressList createTestAdresses() {
		Adresse adresse1 = new Adresse (34753, "Stadt1","Straße1", 43);
		Adresse adresse2 = new Adresse (86325,"Stadt2","Straße2", 5);
		Adresse adresse3 = new Adresse (65275,"Stadt3","Straße3", 7);
		Adresse adresse4 = new Adresse (97353,"Stadt4","Straße4", 37);
		Adresse adresse5 = new Adresse (52474,"Stadt5","Straße5", 42);
		Adresse adresse6 = new Adresse (23435,"Stadt6","Straße6", 11);
		Adresse adresse7 = new Adresse (75379,"Stadt7","Straße7", 46);		
		Adresse adresse8 = new Adresse (11212,"Stadt8","Straße8", 2);
		Adresse adresse9 = new Adresse (97535,"Stadt9","Straße9", 57);
		Adresse adresse10 = new Adresse (64375,"Stadt10","Straße10", 36);
		
		AdressList aList2 = new AdressList();
		aList2.add(adresse1);
		aList2.add(adresse2);
		aList2.add(adresse3);
		aList2.add(adresse4);
		aList2.add(adresse5);
		aList2.add(adresse6);
		aList2.add(adresse7);
		aList2.add(adresse8);
		aList2.add(adresse9);
		aList2.add(adresse10);		
		return aList2;	
	}
	
	public static void someInhabitants() {
        PrintWriter out = new PrintWriter(System.out);
        PersonList pList = Factory.createTestPersonliste();
        AdressList aList = new AdressList(createTestAdresses());

        Einwohner einwohner1 = new Einwohner(pList.get(0), aList.get(0));
        Einwohner einwohner2 = new Einwohner(pList.get(1), aList.get(1));
        Einwohner einwohner3 = new Einwohner(pList.get(2), aList.get(2));
        Einwohner einwohner4 = new Einwohner(pList.get(3), aList.get(3));
        Einwohner einwohner5 = new Einwohner(pList.get(4), aList.get(4));
        Einwohner einwohner6 = new Einwohner(pList.get(5), aList.get(5));

        Adresse newAddress1 = new Adresse(12345, "NewCity1", "NewStreet1", 10);
        Adresse newAddress2 = new Adresse(67890, "NewCity2", "NewStreet2", 20);
        Adresse newAddress3 = new Adresse(54321, "NewCity3", "NewStreet3", 30);

        EinwohnerList eList = new EinwohnerList();
        eList.add(einwohner1);
        eList.add(einwohner2);
        eList.add(einwohner3);
        eList.add(einwohner4);
        eList.add(einwohner5);
        eList.add(einwohner6);

        out.println("Bevor Umzug:");
        for (int i = 0; i < eList.size(); i++) {
            out.println(eList.get(i));
        }

        einwohner1 = einwohner1.umziehenNach(newAddress1);
        einwohner4 = einwohner4.umziehenNach(newAddress2);
        einwohner6 = einwohner6.umziehenNach(newAddress3);

        eList.set(0, einwohner1);
        eList.set(3, einwohner4);
        eList.set(5, einwohner6);

        out.println("\nNach Umzug:");
        for (int a = 0; a < eList.size(); a++) {
            out.println(eList.get(a));
        }
        out.flush();
    }
	
	public static Adresse createAdresse(Scanner in) {	
		int plz = in.nextInt();
		String ort = in.next();
		String str = in.next();
		int hausNr = in.nextInt();
		Adresse adress = new Adresse(plz, ort, str, hausNr);
		return adress;
	}
	
	public static AdressList createAdressen (Scanner in) {
		AdressList aList = new AdressList();
		while (in.hasNext()) {
			aList.add(createAdresse(in));
		}
		in.close();
		return aList;
	}
	
	public static AdressList createAdressen (String filename) {
		 Scanner in = new Scanner(new FunnyFirstFileReader(filename));
		 AdressList aList = createAdressen(in);
		 in.close();
		 return aList;
	}
}
