/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.klase;

import test.klase.enumeracije.Mesec;
import test.klase.enumeracije.Semestar;

/**
 *
 * @author Novica
 */

//extends kljucna rec
public class Student extends Osoba {
//    String ime;
//    String prezime;
//    int godiste;
    public String brojIndeksa;
    
//    public int semestar;
    public Semestar trenutniSemestar;
    
    
    public Mesec mesecUpisa;
    
    public Student(){
        krvnaGrupa = "asdf"; //moze da mu pristupi jer je protected
    }
    
    
   
}
