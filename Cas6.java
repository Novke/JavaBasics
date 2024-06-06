/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Arrays;
import test.klase.Osoba;

/**
 *
 * @author Novica
 */
public class Cas6 {
    
    //imas domaci u svom programu Knjiga i domaci5
    //tu ima i pojasnjeni getteri, setteri i this
    
    //obicna promenljiva
    static int prosek;
    
    //niz intidzera
    static int[] oceneInt;
    
    //niz intidzera, ok
    static Integer[] ocene;
    
    public static void main(String[] args) {
        prosek = 8;
        //10 znaci da ce biti 10 clanova
        //clanovi idu od 0 do 9
        oceneInt = new int[10];
        //koristis ovo
        //jedina situacija kada je bolje da koristis int umesto integer
        //je kad ti iz nekog razloga bas odgovara da je default vrednost 
        ocene = new Integer[10];
        
        //pristupanje clanovima niza
        ocene[0] = 6;
        ocene[1] = 10;
        
//        ovo je greska jer je poslednji clan ocene[9] jer idu od 0 do 9
//        ocene[10] = 15;

//      primer citanja clanova niza
//          ovo ne valja zbog uslova, jer sta ako menjamo duzinu niza
        for (int i = 0; i < 10; i++){
            System.out.print(ocene[i]  + " ");
        }
        System.out.println("");
        
        //ovo je ok jer se uzima u obzir duzina niza
        for (int i = 0; i < ocene.length; i++){
            System.out.print(ocene[i]  + " ");
        }
        
        System.out.println("");
        
        //primer menjanja clanova niza
        for (int i = 0; i < ocene.length; i++){
            ocene[i] = i*10;
        }
        System.out.println("");
        
        //ovako mozes da inicijalizujes odma
        int[] nizIntegera = {1, 2, 3, 4, 5};
        System.out.println(nizIntegera[2]); //procitace 3 jer je to 0 1 2
        String[] nizStringova = {"tekst1", "b", "g", abc(1)};

        //ne moze se pozvati funckija koja ocekuje int sa nizom, vec elementom niza
        abc(nizIntegera[0]);
        
        //niz stringova
        String[] imeNizaString = new String[10];
        //niz osoba
        Osoba[] imeNizaOsoba = new Osoba[10];
        
        //JENDOM KAD POSTAVIS DUZINU NIZA TO NE MOZE DA SE MENJA
        //Mogu da se promene vrednosti clanova, ali ce ih uvek biti isto
        
        Osoba osoba1 = new Osoba("ime","Prezime");
        Osoba[] nizOsoba = {
            osoba1,
            new Osoba(),
            null //mozes da dodas null svuda, osim int double itd
                                    //dok moze da Integer i Double
        };
        
        
        System.out.println(nizOsoba[0].ime);
//        System.out.println(nizOsoba[2].ime); baca gresku jer je osoba null
                
//      LOSE KOPIRANJE NIZA! samo ce imati dva imena za isti niz
//      tehnicki gledano - dva pokazivaca na isti niz
        String[] kopijaNizaStringova = nizStringova;
        kopijaNizaStringova[1] = "HAHA";
        System.out.println(nizStringova[1]);
        
        //PRAVILNO KOPIRANJE NIZA
        //inicijalizujemo niz koji je iste duzine
        kopijaNizaStringova = new String[nizStringova.length];
        for (int i = 0; i < kopijaNizaStringova.length; i++){
            //kopiramo svaki element
            kopijaNizaStringova[i] = nizStringova[i];
        }
        
        //ispisuje ceo niz
        String output = Arrays.toString(kopijaNizaStringova);
        System.out.println(output);
        
        int[] nizNeki = {1,3,7,9,5};
        Arrays.sort(nizNeki);
        System.out.println(Arrays.toString(nizNeki));
        
        //dodeljuje svim elementima niza istu vrednost
//        Arrays.fill(niz, vrednost);

        String a = "XYZ";
        String b = "XY";
        b+="Z";
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println(a == b); //LOS NACIN ZA POREDJENJE STRINGOVA
                                    //POREDI NJIHOVE ADRESE, A NE SADRZAJ
        System.out.println(a.equals(b)); //za sva poredjenja objekata 
                    //koji nisu int, double, long, itd.... se koristi .equals()
    }
    
    static String abc(int x){
        System.out.println("abc");
        return "abc";    }
    
    public static boolean jelNizIsti(int[] prvi, int[] drugi){
        
        if (prvi.length!=drugi.length) return false;
        
        for (int i = 0; i < prvi.length; i++){
            if (prvi[i]!=drugi[i]) return false;
        }
        return true;
    }
    
    
}
