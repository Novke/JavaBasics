/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.klase;

import java.util.Objects;

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
    
    public String jmbg;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.jmbg);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Osoba other = (Osoba) obj;
        return Objects.equals(this.jmbg, other.jmbg);
    }
    
    

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    //ovome moze da se pristupi iz ove klase
    //i iz svih klasa koje nasledjuju ovu klasu
    protected String krvnaGrupa;
    
    public void kaziCao(){
        System.out.println("pozvana je kazi cao iz klase osoba");
        System.out.println("Cao, ja sam " + ime + " " + prezime);
    }
    
    public String vratiImePrezime(){
        return ime + " " + prezime;
    }

       
    //2. Konstruktori
    //svaka klasa mora da ima konstruktor
    //ako ga ne definisemo sami, automatski se generise prazan kostruktor
    //tj ovo:
    public Osoba() {
        System.out.println("Konstruisana je nova osoba");
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
        
        System.out.println("Pozvan je konstruktor parametrizovani");
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

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public String getKrvnaGrupa() {
        return krvnaGrupa;
    }

    public void setKrvnaGrupa(String krvnaGrupa) {
        this.krvnaGrupa = krvnaGrupa;
    }
 
    
    
    
    
    
}
