/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.klase;

/**
 *
 * @author Novica
 */
public class Osoba {
    
    //1.
    //atributi / POLJA
    //definisu se na pocetku (nije bitno) Van svih metoda (bitno)
    public String ime = "nepostojeci"; //default vrednost
    public String prezime;
    //ISTO KAO DA SI NAPISEAO
    //public String prezime = null;
    public int godiste;
//    public static String vrsta;
    
    //ovome moze da se pristupi iz ove klase
    //i iz svih klasa koje nasledjuju ovu klasu
    protected String krvnaGrupa;

       
    //2. Konstruktori
    //svaka klasa mora da ima konstruktor
    //ako ga ne definisemo sami, automatski se generise prazan kostruktor
    //tj ovo:
    public Osoba() {
    }
    
    //BITNO:
    //Konsturktor se podrazumeva da je void i ne mora i ne treba da se pise
    //ime konstuktora je ImeKLase + zagrade
    
    //parametrizovani konstruktor
    //obicno se koristi da se odmah postave vrednosti na atribute
    public Osoba(String imeOsobe, String prezimeOsobe, int godisteOsobe) {
//        System.out.println("POZVAN KONSTRUKTOR"); //Mozemo da dodamo bilo sta
        ime = imeOsobe;
        prezime = prezimeOsobe;
        godiste = godisteOsobe;
    }

    public Osoba(String ime, String prezime) {
        //this se koristi da se naglasi na koji atribut se misli
        //this.ime je ime osobe
        //ime je ulazni parametar
        this.ime = ime;
        this.prezime = prezime;
    }
    
    //3.
    //metode / ponasanje
    public void pozdrav(){
        System.out.println("Cao, ja sam " + ime);
    }
    
    public void predstaviSe(){
        System.out.println("Cao, ja sam " + ime + " " + prezime  + " i " + godiste + ". sam godiste");
    }
    
    public static void smejSe(){
        //ovde ce doci do greske jer ne moze da pristupi imenu jer je staticka metoda
//        System.out.println("HAHAHAHHAA" +  ime);
        System.out.println("HAHAHAHHAA");
    }

    //ALT + INSERT + Generate toString
    @Override
    public String toString() {
        return "Osoba{" + "ime=" + ime + ", prezime=" + prezime + ", godiste=" + godiste + '}';
    }
 
    
    
    
    
    
}
