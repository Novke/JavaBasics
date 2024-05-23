/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Novica
 */
public class Cas4 {
    
    //globalne promenljive = POLJA
    //obicno se navode na pocetku
    private int broj;
    
    
    
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    
    //dupl afor petlja
    static void funkcjia(int n){
        
        //ova for petlja ispisuje red po red
        for (int i = 1; i <= n; i++){
            //u svakom redu ispisuje sledece:
            
            
            //ova for petlja ispisuje sve elemente n-tog reda
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            
            
            System.out.println("");
        }
        
    }
    
    //*
    //* *
    //* * *
    //PIRAMIDA 
     public static void pravouglaPiramida(int n){
        
        //ova for petlja ispisuje red po red
        for (int i = 1; i <= n; i++){
            //u svakom redu ispisuje sledece:
            
            
            //ova for petlja ispisuje sve elemente n-tog reda
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            
            
            System.out.println("");
        }
        
    }
     
    //  *
    // * *
    //* * *
    //PIRAMIDA 
     public static void piramida(int n){
        
        //ova for petlja ispisuje red po red
        for (int i = 1; i <= n; i++){
            //u svakom redu ispisuje sledece:
            
            //ISPISUJE RAZMAKE
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            
            //ISPISUJE ZVEZDICE
            for (int j = 1; j <= i; j++){
                
                System.out.print("* ");
            }
            
            
            System.out.println("");
        }
        
    }
     //ISPISUJE A A A A A B
     static void ispis(){
         for (int i = 0; i < 5; i++) System.out.println("A ");
        System.out.println("B");
         
     }
     
     static void beskonacnaPetlja(){
         int i = 0;
         while (i < 10000){
             System.out.println("BESKONACNA PETLJA KORAK BEOJ : " + i++);
         }
         i = 10;
         while (true){
             System.out.println("BESKONACNA PETLJA KORAK BEOJ : " + i++);
             //
             if (i >= 10000) break;
         }
         i = 10;
         while (true){
             //continue zavrsava trenutni korak
             if (i++ % 2 == 0) continue;
             
             System.out.println("CONTNUE : " + i);
             //break zavrsava celu petlju
             if (i >= 100) break;
         } 
     }
     
     static void breakKaoKraj(){
         //ISPISUJE 1-10 KRAJ
         int i = 0;
         while(true){
             i++;
             System.out.println(i);
             if (i >= 10) break;
         }
         System.out.println("KRAJ");
     }
     static void returnKaoKraj(){
         //ISPISUJE 1-10 KRAJ
         int i = 0;
         while(true){
             i++;
             System.out.println(i);
             if (i >= 10) return;
         }
         //NIKAD NECE DOCI DO OVDE!!!
         //sys.out.println(kraj)
     }
     
     
     //CONITNUE ZAVRDAVA TRENUTNI KORAK
     //BREAK ZAVRSAVA PETLJU (while, for, do-while, switch...)
     //return ZAVRSAVA FUNKCIJU
     
     static void metoda1(){
            System.out.println("Metoda 1");
            metoda2();
            System.out.println("ASDF");
     }
    

    private static void metoda2() {
        //POZIVANJE DEFINISANE METODE
        metoda3(4);
        System.out.println("METODA 2");
    }
    
    //DEFINISANJE METODE
    static void metoda3(int x){
        System.out.println("METODA 3");
    }
    
    //MODIFIKATORI
    //public, private, package-private, protected
    
    //private
    //vidi se samo iz ove klase
    private static void primerPrivatnaMetoda(){
        
    }
    //PACKAGEPRIVATE
    //DEFAULT!
    static void primerPackagePrvateMetoda(){
        
    }
    //protected
    //to be continued...
    protected static void primerProtectedMetode(){
        
    }
    //public
    public static void primerPublicMetode(){
        
    }
    
    //ako stoji void znaci da nista ne mora da se vrati
    //ako stoji bilo sta drugo (neka klasa) onda mora da se vrati neka vrednost tog tipa
    
    //ocekuje da se vrati String
     static String funkcija(){
         return "ASDF";
     }
     
     static int saberi(int a, int b){
         int c = a + b;
         return c;
     }
     //OVDE DVE FUNKCIJE RADE ISTU STVAR
     static int saberiBolji(int prvi, int drugi){
         return prvi+drugi;
     }
     
     //kao sto postoje modifikatori pristupa da funkcije (privvate, public itd...) 
     //postoje i za promenljive
     int prom1;
     public int prom2;
     private int prom3;
     protected int prom4;
     
     static void karakter(){
         //pomera za 3 mesta udesno
         char karakter = 'b';
         int broj = (int)karakter;
         broj+=3;
         char noviKarakter = (char)broj;
         System.out.println(noviKarakter);
     }
     
     static void test1(int x){
         x++;
         System.out.println("POZVANA PRVA:");
     }
     
     //OVO NE MOZE JER JE ISTO IME I ISTE ULANE PROMENLJIVE
     //NEBITNO JE STO JE POVRATNA VREDNOST RAZLICITA
     //JER KAD POZIVAS METODU PROGRAM NE ZNA KOJU DA POZOVE
//     static int test1(int y){
//         
//     }
     
     //METODE MOGU DA SE ZOVU ISTO, AKO NEMAJU ISTE ARGUMENTE
     static void test1(Integer x){
         System.out.println("POZVANA DRUGA");
         x++;
     }
     
     //METODE MOGU DA SE ZOVU ISTO AKO NIJE ISTI REDOSLED PARAMTERA
     static void test2(int a, String b){
         
     }
     
     static void test2(String d, int x){
         
     }
     
     
     static void rekurzivnafunkcija(){
         //ispisuje ovo zauvek
         //dolazi do greske stack overflow
         System.out.println("Pozvana je rekurzivna funkcija");
         rekurzivnafunkcija();
     }
     
     //ispisuje sve brojeve od n do 10
     static void pravilnaRekurzija(int n){
         if (n > 10) return;
         System.out.println(n);
         pravilnaRekurzija(n+1);
     }
     
     static int faktorijal(int n){
         int akumulator = 1;
         for (int i = 1; i <= n; i++){
             akumulator*=i;
         }
         System.out.println("faktorijal je : " + akumulator);
         return akumulator;
     }
     
     static int faktorijalRekurzija(int n){
         if (n == 0) return 1;
         return n * (faktorijalRekurzija(n-1));
     }
      
    public static void main(String[] args) {
//        Scanner skener = new Scanner(System.in);
//        System.out.print("Unesi broj elemenata piramide: ");
//        int unos = skener.nextInt();
//        piramida(unos);

//funkciju on odma gleda kao tu povratnu vrednost
//        char c = funkcija().charAt(1);
//        System.out.println("char: " + c);

        int rez = faktorijalRekurzija(5);
        System.out.println(rez);

    }
    
}
