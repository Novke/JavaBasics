/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;
import test.klase.Osoba;

/**
 *
 * @author Novica
 */
public class Cas5 {
    public static void main(String[] args) {
        
        int broj = 5;
        Scanner skener = new Scanner(System.in);
        
        // PRAVLJENJE NOVE OSOBE
        Osoba osoba2 = new Osoba();
        
        //Deklaracija
        Osoba osoba1;
        //INICIJALIZACIJA
        osoba1 = new Osoba();
        
        //KONSTRUKTOR
        //objekat se ne definise vec se konstruise
        new Osoba();
        
        //Osoba - Klasa
        //osoba - objekat
        
        osoba1.ime = "Matija";
        osoba1.prezime = "Peric";
        osoba1.godiste = 2004;
        
        //kada je staticka promenljiva, svi je dele
        //ovde smo postavili osobi1 vrstu na majmun, a to ce vaziti i za osobu 2
        osoba1.vrsta = "Majmun";
        //kada je staticko polje, moze i preko klase da joj se pristupi
        Osoba.vrsta = "Majmuncina";
        
        osoba2.ime = "Marko";
        osoba2.prezime = "Nikolic";
        osoba2.godiste = 1999;
        
        System.out.println("Ime prve osobe je: " + osoba1.ime);
        System.out.println("Ime druge osobe je: " + osoba2.ime);
        
        osoba1.pozdrav();
        osoba2.predstaviSe();
        
        //POZIV PARAMETRIZOVANOG KONSTRUKTOR
        Osoba osoba3 = new Osoba("Novica", "Trifkovic", 2000);
        osoba3.predstaviSe();
        
        //ovo nije greska ali je losa praksa
        System.out.println("Osoba1 vrsta: " + osoba1.vrsta);
        System.out.println("Osoba2 vrsta: " + osoba2.vrsta);
        //ovo je dobra praksa
        System.out.println("Osoba2 vrsta: " + Osoba.vrsta);
        
        //osoba se smeje ni ne znamo koja osoba smao cujemo smeh
        Osoba.smejSe();
        
        Osoba osoba5 = new Osoba();
        //bice "nepostojeci" jer je po definiciji to default vrednost
        System.out.println("Osoba 5 ime: " + osoba5.ime);
        //bice null jer nismo definisali nista
        System.out.println("Osoba 5 prezime: " + osoba5.prezime);
        System.out.println("Osoba 5 godiste: " + osoba5.godiste);
        
        //default vrednosti:
        //klase : null
        //izmedju ostalog i Integer, Double, String, Long
        //int, double, long 0
        
        //toString() postoji za sve klase i ispisuje adresu objekta
        System.out.print("Adresa osobe 1 je: ");
        System.out.println(osoba1.toString());
        
        Osoba testOsoba;
        testOsoba = new Osoba(); //NE MOZE BEZ OVOGA DA SE POZOVE NIJEDNA FUNKCIJE JER JE OBJEKAT NULL
        //
        System.out.println(testOsoba.toString());
        
        //ovim se prakticno brise
        //to radi GarbageCollector, gleda sta se sve NE koristi i brise
        //
        //testOsoba vise ne pokazuje ni na sta
        //nekad je pokazivala na osobu u memoriji, i sad na tu osobu ne pokazuje nista pa se ona brise - GarbCOl
        testOsoba = null;
        
        //osoba4 pokazuje na istu stvar na koju pokazuje i osoba3
        //to su sve pokazivaci
        //i zato kada promenimo osobu 4 menja se i  osoba3
        Osoba osoba4 = osoba3;
        osoba4.ime = "MILUTIN";
        osoba3.predstaviSe();
        
        System.out.println("Ispisi mi osobu 3: ");
        //kada u sout ubacis nesto sto nije string, on automatski pravi string koristeci toString() metodu
        System.out.println(osoba3);
        //zato se redefnisie cesto toString metoda jer onda je malo jednostavnije za ispisivanje podataka
    }
}
