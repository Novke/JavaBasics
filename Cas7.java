/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import test.klase.Osoba;
import test.klase.Profesor;
import test.klase.Student;

/**
 *
 * @author Novica
 */
public class Cas7 {
    
    public static void main(String[] args) {
        String[] niz = {"a", "abc", "Basket"};
        ispisiNizForEach(niz);
        
        Osoba osoba1 = new Osoba("ime","Prezime");
        Osoba osoba2 = new Osoba("ime22","Prezime3333");
        Osoba osoba3 = new Osoba("ime333","Prezime2323");
        
        
        Osoba[] nizOsoba = new Osoba[3];
        nizOsoba[0]= osoba1;
        nizOsoba[1]= osoba2;
        nizOsoba[2]= osoba3;
                
        ispisiImenaSvihOsoba(nizOsoba);
        
        
        Integer[] niz1 = {1,3,5,7};
        Integer[] niz2 = {4,5,6,7};
        Integer[] niz3 = {0,1,9,9};
        Integer[][] matrica = {niz1, niz2, niz3};
        
        //ovo je sve moglo odjednom preko
//        matrica = {{1,3,5,7},{4,5,6,7},{0,1,9,9}};

        ispisiMatricu(matrica);
        
        testStudent();
        
        System.out.println("AAAAAAAAAAAAaa");
        testObject(null);
    }

    
    static void ispisiNiz(String[] niz){
        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }
    }
    
    //for each petlja je dosta laksa ako hoces da prodjes kroz sve elemente niza ili liste
    static void ispisiNizForEach(String[] niz){
        //on prolazi kroz svaki element (String) niza "niz"
        //i kad prodje kroz njega naziva ga element
        for (String element : niz){
            System.out.println(element);
        }
    }
    
    //for each petlja je jednostavnija ali nekad je for petlja bolja, npr kad oces da napises ovo    
    static void ispisiNizSaIndeksima(String[] niz){
        for (int i = 0; i < niz.length; i++){
            System.out.println((i+1) + ": " + niz[i]);
        }
    }
    
    static void ispisiImenaSvihOsoba(Osoba[] osobe){
            
        for(Osoba o : osobe){
            System.out.println(o.ime);
        }
    }
    
    static void ispisiNeparneBrojeve(Integer[] brojevi){
        for (Integer broj : brojevi){
            if (broj % 2 == 0) continue; //parne brojeve preskoci
            System.out.println(broj);
        }
    }
    
    static void dvodimenzionalniNizPrimer(){
        
        Integer[] nizIntegera; // imam niz koji je tipa integer
        Integer[][] matricaIntegera; //niz koji je tipa Integer[]
        
        //a b c  ----> niz
//        niz[0] = a
//        niz[2] = c
        
        //1 2 3  ----> matrica
        //4 5 6
        //7 8 9 
        
//        matrica[0] = 1 2 3
//        matrica[0][2] = 3
//        matrica[1][1] = 5

        Integer[][] matrica = new Integer[2][3]; //2 reda i 3 kolone
        
        
    }
    
    //dupla for petlja se koristi za ispisivanje matrica
    static void ispisiMatricu(Integer[][] matrica){
        
        //obrati paznju na uslov ovde i ispod
        //matrica.length je broj nizova u matrici
        //matrica[0].length je duzina svakog tog niza u matrici
        for (int i = 0; i < matrica.length; i++){
        //ovo radi za svaki red
            
            for (int j = 0; j < matrica[0].length; j++){
                //ovo radi za svaki element u redu
                System.out.print(matrica[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
    
     static void glavnaDijagonala(Integer[][] matrica){
        //postavlja broj 1 na svaki element
        for (int i = 0; i < matrica.length; i++){
        //ovo radi za svaki red
            for (int j = 0; j < matrica[0].length; j++){
                //ovo radi za svaki element u redu
                if (i == j) matrica[i][j]=1;
                else matrica[i][j]=0;
            }
        }
         ispisiMatricu(matrica);
    }
     
     //kada pravimo studenta on nasledjuje (extends) sve atribute i metode
     //iz svoje nadklase, osim ako nisu private (protected moze, itd.)
     static void testStudent(){
         Student student = new Student();
         Profesor profesor = new Profesor();
         
         //nema problem da napravi int u double
         int broj = 5;
         double decimalni = broj;
         
         double drugiDec = 5.1;
//         int drugiBroj = drugiDec; //ovde ne moze jer dolazi do gubitka


        Osoba novaOsoba = new Student();
        novaOsoba.ime = "Mirko";
//       Student noviStudent = new Osoba(); //ovo ne moze
        Osoba novaOsoba2 = new Profesor();
        novaOsoba2.ime = "Vesna";
        Osoba novaOsoba3 = new Osoba();
        novaOsoba3.ime = "Pera";
        
        Student stud = new Student();
        
        Osoba[] nizOsoba = {novaOsoba, novaOsoba2, novaOsoba3};
        
        ispisiImenaSvihOsoba(nizOsoba);
         ispisiOsobePremium(nizOsoba);
//        Profesor profesor = new Student();

         testObject(novaOsoba2);
         
     }

     static void ispisiOsobePremium(Osoba[] osobe){
         for (Osoba o : osobe){
             
             //INSTANCEOF - rezervisana rec
             if (o instanceof Profesor){ //to znaci da je osoba profesor
                 
                 //cast-ovanje - prebacivanje jednog tipa podatka u drugi
                 Profesor p = (Profesor) o;
                 System.out.println("Profesor: " + p.ime);
             } else {
                 if (o instanceof Student){
                     
                     //cast-ovanje
                     Student s = (Student) o;
                     System.out.println("Student: " + s.ime + " br. ind. + " + s.brojIndeksa);
                 } else {
                     System.out.println(o.ime);
                 }
             }
         }
     }
     
     static void testObject(Object object){
         
         Object o = new Student();
         Student s = new Student();
         Profesor p = new Profesor();
         
         System.out.println(s instanceof Student); //true
         System.out.println(s instanceof Osoba); //true 
         System.out.println(s instanceof Object); //true
     }
     
}
