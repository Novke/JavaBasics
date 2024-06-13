/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Novica
 */
public class Cas9 {
    
    
    ////////////////////////// LISTE ///////////////////////
    ////////////////////////// LISTE ///////////////////////
    ////////////////////////// LISTE ///////////////////////
    ////////////////////////// LISTE ///////////////////////
    ////////////////////////// LISTE ///////////////////////
    ////////////////////////// LISTE ///////////////////////
    
    
    
        static Boolean[] igraci = new Boolean[10];
        static int brojIgraca = 0;
        
    //staticka vs nestaticka metoda
    
    //Osoba o = new Osoba();
    
//    Osoba.metoda() //POZIV PREKO KLASE - SAMO STATICKE
//    o.metoda() //POZIV PREKO OBJEKTA - Mogu sve
    
    static void didajIgraca(){
        igraci[brojIgraca++]=true;
    }
    
    static void kopiranjeNiza(){
        Integer[] prvi = new Integer[5];
        prvi[0] = 1;
        prvi[1] = 3;
        //shvatimo da ocemo vecu duzinu niza
        int novaDuzina = 15;
        Integer[] drugi = Arrays.copyOf(prvi, novaDuzina);
        System.out.println(drugi[0] == 1);
        System.out.println(drugi[1] == 3);
        System.out.println("Prvi niz je dug: " + prvi.length); //5
        System.out.println("Drugi niz je dug: " + drugi.length); //15
    }
    
    ////////// NIZ VS LISTA    ////////
    
    //////////////   DISCLAIMER   ///////////////////////////
    /// IMPORTUJES java.util.LISt, a NE jawa.awt.List ///////
    /////////////////////////////////////////////////////////
    
    static void deklaracija(){
        //DEKLARISANJE
        //niz integera
        Integer[] niz;
        //lista
        List lista; //skoro nikad neces koristiti
        //lista integera
        List<Integer> listaIntegera;
    }
    
    static void inicijalizaicja(){
        //niz
        Integer[] niz = new Integer[10];
        //lista
        List<Integer> lista1 = new LinkedList();
        List<Integer> lista2 = new ArrayList(); //isti djavo
        List<Integer> lista50 = new ArrayList(50); //inicijalni kapacitet je 50 
        List<Integer> lista3 = new ArrayList<>(); //isti djavo
        List<Integer> lista4 = new ArrayList<Integer>(); //isti djavo
        
        //arrylist je generalno brzi ako samo ubacujes elemente na kraj
        
        //linked list je bolji ako ocekujes ubacivanje elemenata usred liste, 
        //izbacivanje usred liste itd.
        
        //Ne moras da razmisljas o ovome uvek asad koristi ArrayList();
    }
    
    static void radSaElementima(){
        
        ///////DODAVANJE///////////
        //niz
        Integer[] niz = new Integer[10];
        //vec postoji 10 praznih elemenata
        //stavis da je prvi nesto
        niz[0] = 5;
        //lista
        List<Integer> lista = new ArrayList();
        System.out.println(lista.isEmpty());
        lista.add(5);
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        lista.add(15);
        System.out.println(lista.size());
        
        ////////PRISTUP///////////
        //niz
        System.out.println(niz[0]);
        //lista
        System.out.println(lista.get(0));
        
        ////////BRISANJE/////////
        //niz
        niz[1] = null;
        //sve ostale elemente da pomeris jedno mesto ulevo
        lista.remove(1); //automatski izbacuje drugog
        
        List<String> listaStringova = new ArrayList();
        listaStringova.add("abc");
        listaStringova.add("def");
        //na dva nacina mozes da izbacis drugi element:
        //preko indeksa
        listaStringova.remove(0);
        //preko objekta
        listaStringova.remove("def"); //ako bi bilo vise istih stringova on izbacuje samo prvi
        
//        Osoba o = new Osoba();
//        o.setJmbt(13);
//        listaOsoba.remove(o);
//      izbacuje koristeci equals() metodu
//      izbacice osobu sa JMBG-om 13 iako ovaj obekat o nikad zapravo nije ni dodat u listu
        
    }
    
    static void duzinaKolekcije(){
        Integer[] niz = new Integer[5];
        List<Integer> lista = new ArrayList<>();
        
        System.out.println(niz.length); //length je polje objekta niz
        System.out.println(lista.size()); //size je metoda
    }
    
    static void forPetlja(){
        Integer[] niz = new Integer[5];
        List<Integer> lista = new ArrayList<>();
        
        //niz
        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }
        //lista
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    
    static void forEachPetlja(){
        Integer[] niz = new Integer[5];
        List<Integer> lista = new ArrayList<>();
        
        //niz
        for (Integer broj : niz){
            System.out.println(broj);
        }
        //lista
        for (Integer broj : lista){
            System.out.println(broj);
        }
        
        //IDENTICNI SU!!!!!!!!!!!!!!!11
}
    
   static void brzaInicijalizacija(){
       Integer[] niz = {1,3,7};
       
       List<Integer> lista1 = new ArrayList(3);
       lista1.add(1);
       lista1.add(3);
       lista1.add(7);
       
       //u jednom redu
       List<Integer> lista2 = List.of(1,3,7); //automatski pravi listu od ovih elemenata
       
       //prazna lista
       List<Integer> praznaLista = List.of();
   }
   
   static void setZaListe(){
       //set menja element na datom intexu
        List<Integer> lista2 = new ArrayList();
//        lista2.add(1);
//        lista2.add(3);
//        lista2.add(7);
        lista2.set(1, 99);
        
       for (Integer broj : lista2){
           System.out.println(broj);
       }
   }
   
   static void listOfWarning(){
       
       //Kada napravis listu preko List.of ona ne moze da se menja SRANJE
//       List<Integer> lista2 = List.of(1,3,7); //automatski pravi listu od ovih elemenata
       //iskocila je greska i resio se problem tako sto smo batalili ovaj List.of
       
       
        List<Integer> lista2 = new ArrayList();
        lista2.addAll(List.of(1,3,7)); //ovako moze ako List.of ne radi
   }
   
   static void indexOf(){
       List<String> listaStringova = List.of("a", "b","b" ,"c", "b",  "c");
       System.out.println(listaStringova.indexOf("b")); //vraca index elementa b
       System.out.println(listaStringova.lastIndexOf("b"));
   }
   
   static void prazinListu(){
       List<String> listaStringova = List.of("a", "b","b" ,"c", "b",  "c");
       
       //NACIN BROJ 1:
       listaStringova = new ArrayList();
       //NACIN BROJ 2
       listaStringova.clear();
   }
    
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   ///////////// ULAZ / IZLAZ /////////////////////
   
   
   static void klase(){
       InputStream is;
       OutputStream os;
       Reader r;
       Writer w;
       PrintWriter p;
   }
   
   static void printWriter(){
       
       PrintWriter out = new PrintWriter(System.out);
       out.println("text");
//       out.printf(); //slicne metode kao u syso
   }
   
   static void skener(){
       Scanner tastatura = new Scanner(System.in);
       int broj = tastatura.nextInt();//ucitaj sledeci integer
       String text = tastatura.next(); //bilo sta
       
       tastatura.next(); //ucitava do sledeceg razamaka
       tastatura.next(); //ucitava ceo red
       
       tastatura.hasNext(); //proverava da li jos ima texta
       tastatura.hasNextInt(); //proverava da li je sledeca stvar int
   }
   
   static void radSaDatotekama(){
       //TEKSUTELNI FORMAt
       FileReader reader;
       FileWriter writer;
       //BINARNI FORMAT
       FileInputStream fis;
       FileOutputStream fos;
   }
   
   static void ucitajFajl(){
            try {
                //FileReader reader = new FileReader("imeFajla");
                //Scanner ulaz = new Scanner(reader);
                
                Scanner ulaz = new Scanner(new FileReader("imeFajla")); //ovo radis ako ti ne treba reader
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cas9.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
   
   static void napraviFajl(){
            try {
                PrintWriter writer = new PrintWriter(new FileWriter("fajl.txt"));
                
                writer.append("neki text");
                writer.write("abc");
                //Ovo dvoje ajedno pravi fajl.txt i u njemu upise "neki textabc"
                
                writer.flush(); //upisuje u datoteku, do ovog momenta je cuvano u RAM-u
                writer.close(); //jako bitno
            } catch (IOException ex) {
                Logger.getLogger(Cas9.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
   
    public static void main(String[] args) {
        napraviFajl();
    }
    
}
