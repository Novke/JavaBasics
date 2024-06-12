/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.klase;

/**
 *
 * @author Novica
 */
public class Profesor extends Osoba {
    
    public String zvanje;
    public String prezime;

    public Profesor() {
        super();
    }

    public Profesor(String ime, String prezime, String zvanje) {
        super(ime, prezime);
        this.zvanje = zvanje;
        this.prezime = prezime;
    }

    
    
    
    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    
    //ovde se pristupa prezime iz klase profesor, dok u funkcijij 
    //kazicao se pristupa prezimenu iz klase osoba
    @Override
    public void kaziCao(){
        System.out.println("Pozvana je kazi cao iz klase profesor");
        System.out.println("Cao, ja sam " + ime + " " + prezime);
        super.kaziCao();
    }
    
    public static void main(String[] args) {
        Profesor p = new Profesor("A", "B", "dr.");
        p.ime = "Ime";
        p.prezime = "Prezime";
        
        //ovom preimenu
        p.getPrezime();
        
        p.kaziCao();
        
        
    }

    @Override
    public String vratiImePrezime() {
        String text = zvanje + " " + super.vratiImePrezime();
        return text; 
    }
    
    
}
