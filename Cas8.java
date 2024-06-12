/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import test.klase.Profesor;
import test.klase.Student;
import test.klase.enumeracije.Mesec;
import test.klase.enumeracije.Semestar;

/**
 *
 * @author Novica
 */
public class Cas8 {

    
    ///////// SUPER //////////////
    
    
    //ovde smo prosli super, metode super.metoda(), sakrivanje
    //metoda i sakrivanje polja, i pozivanje konstruktora preko super()
    
    //pogledaj klasu profesor i osoba
    
    //ako se doda final na metodu ona ne moze biti override-ovana
    //ili ti redefeinisana
    //ili ti nadjacana sto bi rekli ovi
    
    
    ////////// OBJECT ////////////
    public Cas8() {
        super(); //ovo poziva konstruktor klase object
        //samo da znas, nikad neces koristiti
    }
    
    
    static void m1(){
        Object o = new Object();
        //kada stisneo o. vidimo definisane metode za klasu object
        //koje se samim tim nalaze u svim objektima
        
        Object objekat = new Profesor();
//        Profesor profesor = new Object(); //NE MOZE

        Profesor profesor1 = new Profesor();
        Profesor profesor2 = profesor1;
        
        //ako izmenis profesora 1 menja se i profesor 2 jer oni pokazuju na istu stvar
        //ako bas zelis da kopiras onda se to radi preko clone()
        
//        Profesor profesorCopy = (Profesor) profesor1.clone();

//        equals() metoda
//        vraca true ako su dva objekta ista
//        radi tako sto poredi da li se objekti nalaze na istoj lokaciji u memoriji
        //zbog toga se uvek redefinise equals metoda
        
        //osoba ima jmbg pa smo stavili da equals proverava samo jmbg
        
        //isto vazi i za studenta i za profesora
        
        //mogli smo i da @Override equals za stdeunta dodavajuci da
        //uzima u obzir samo broj indeksa a ne jmbg
        
        boolean jesuLiIsti = profesor1.equals(profesor2);
        
        
        //////// ENUM /////////////
        
        
        Student s = new Student();
        s.brojIndeksa = "NEBITNO";
//        s.semestar = 15; //ovde mogu gluposti da se ubacuju, sto ne zelimo

//kada pravimo enum, prvi put mora New file -> other -> java -> enum
//svaki sledeci put bi trebalo enum da bude ponudjen
//
//alternativa je da napravis klasu i da zamenis rec class sa recju enum
        
    //pogledaj polje semestar u klasi student
        s.trenutniSemestar = Semestar.PRVI;
        s.mesecUpisa = Mesec.JAN;
        
        if (s.mesecUpisa == Mesec.FEB){ //ovako se poredi
            System.out.println("Student je iz februara");
        }
        
        Semestar sem = Semestar.valueOf("SESTI");//ovo vraca sesti semestar
        System.out.println(sem == Semestar.SESTI); //ovo vraca true
        
        System.out.println(Mesec.JAN.name()); //ispisuje JAN
        System.out.println(Mesec.JAN.ordinal()); //ispisuje 0
        
        //poenta ordinala:
        
        //svaki enum ima svoje ime i ordinal sto mu dodje redni broj
    }
    
    public static void main(String[] args) {
        m1();
    }
    
}
