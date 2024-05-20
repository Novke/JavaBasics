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
public class Cas3 {
    
    //klase su velikim slovom, promenljive malim
    Scanner scanner;
    
    //velikim slovima
    static final double EULER_KONST = 2.7;
    
    //PRIMITIVNI TIPOVI
    static int integer;
    double dabl;
    boolean tacno;
    
    static Integer intidzer;
    Double dabl2;
    Boolean netacno;
    String text;
    // ovo su sve GLOBALNE PROMENLJIVE
    
    public static void main(String[] args) {
        // konstante ne mogu da se menjaju
//        EULER_KONST = 10;

        System.out.println(integer);
        System.out.println(intidzer);
        
        int x = Integer.max(2, 3);
        System.out.println(x);
        
        String txt = "23";
        //metoda omotca klase Integer
        int broj = Integer.parseInt(txt);
       
        System.out.println(broj + broj);
        
        
        //ISPISUJE MMMMMMMMMMMMO
        for (int i = 1; i < 10; i++) 
            System.out.println("M");
        System.out.println("O");
        //ISPISUJE MOMOMOMOMOMOMOMO
        //ZBOG ZAGRADA
        for (int i = 1; i < 10; i++){ 
            System.out.println("M");
        System.out.println("O");
        }
        
        {
            int i = 5;
        }
//        I VAZI SAMO U OKVIRU BLOKA IZNAD, OVO JE GRESKA
//        i++;
        
        int y = 5;
        if (y == 6){
            System.out.println("Broj je jednak 6");
        } else {
            System.out.println("Broj nije 6");
        }
        //ISTI DJAVO JER JE SAMO JEDNA LINIJA KODA
        if (y == 6) System.out.println("Broj je jednak 6"); 
        else System.out.println("Broj nije 6");
        
//        primerBreaka();
//        primerSwitcha(2);
//        primerNetacnogWhilea();
//      primerDoWhilea();
//            primerNetacnogDoWhilea();
//    primerContinueVsBreak();
//    nadjiNajveciBroj(10,12,3,4);
//    primerProlaskaKrozString();
//    duplaForPetlja();
        ispisiPiramidu(3);
        
        
    }
    
    static void ispisiOcenu(double ocena){
        if (ocena >= 91){
            System.out.println("Ocena je 10");
        } else {
            if (ocena >= 81) System.out.println("Ocena je 9");
            else {
            if (ocena >= 71) System.out.println("Ocena je 8");
                //...
            }
        }
    }
    
    static void primerSwitcha(int broj){
        switch (broj) {
            case 0:
                System.out.println("NULA");
//                break;
                //AKO NE STAVIMO BREAK, AKO BROJ BUDE 0 ON CE ISPISATI
                //I NULA I JEDAN
            case 1:
                System.out.println("JEDAN");
                break;
            case 2:
                System.out.println("DVA");
                break;
                //....
                
            default: 
                System.out.println("GEESKA");
        }
    }
    
    static void jelParan(int n){
        switch (n % 2) {
            case 0:
                System.out.println("PARAN JE");
                break;
            case 1: 
                System.out.println("NEPARAN");
                break;
        }
    }
    
    static void primerBreaka(){
        for (int i = 1; i < 10; i++){
            System.out.println("i = " + i);
            if (i == 6) break;
        }
        
        int j = 1;
        while (j < 5){
            System.out.println("J = " + j);
            j++;
        }
        
        int k = 1;
        while (true){
            System.out.println("K = " + k++);
            if (k == 7) break;
        }
    }
    
    static void primerNetacnogWhilea(){
        System.out.println("USLI SMO U NETACNI WHILE");
        int x = 5;
       
        while (x < 2){
            //nikad nije ni doslo do ovoga
            System.out.println("x = " + x);
            x++;
        }
        System.out.println("KRAJ");
    }
    
    static void primerDoWhilea(){
        //OVDE NEMA RAZLIKE IZMEDJU WHILE I DO-WHILE
        int x = 0;
        System.out.println("Ulazim u do while");
        do {            
            System.out.println("x = " + x++); 
        } while (x < 5);
    }
    
    static void primerNetacnogDoWhilea(){
        int x = 5;
        System.out.println("Ulazim u do while");
        //OVO CE IZVRSITI JEDNOM IAKO USLOV NIJE ISPUNJEN
        do {            
            System.out.println("x = " + x++); 
        } while (x < 2);
        
        //DO-WHILE IMAMO GARANCIJU DA CE IZVRSITI MAKAR JEDNOM, CAK I AKO NIJE ISPUNJEN USLOV
    }
    
    static void primerContinueVsBreak(){
        System.out.println("ULAZIM U BREAK FOR PETLJU");
        for (int i = 0; i < 10; i++){
            if (i == 5) break;
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("ULAZIM U CONINUE FOR PETLJU");
        for (int i = 0; i < 10; i++){
            //CONTINUE PRESKACE TAJ KORAK
            if (i == 5) continue;
            System.out.print(i);
        }
        System.out.println("");
    }
    
    //BROJAC - i
    //AKUMULATOR - result
    //jos jedan primer
    static void nadjiNajveciBroj(int x1, int x2, int x3, int x4){
        //pretpostavljamo da je prvi broj najmanji
        int najmanji = x1;
        if (x2 < najmanji) najmanji = x2;
        if (x3 < najmanji) najmanji = x3;
        if (x4 < najmanji) najmanji = x4;
        
        System.out.println("Najmanji je : " + najmanji);
    }
    static void daLiOvdeImaTrojke(int x1, int x2, int x3, int x4){
        
        //pretpostavljamo da nema
        boolean jelIma = false;
        if (x1 == 3) jelIma = true;
        if (x2 == 3) jelIma = true;
        if (x3 == 3) jelIma = true;
        if (x4 == 3) jelIma = true;
        
        System.out.println("Ovde ima trojke: " + jelIma);
    }
    
    static void primerProlaskaKrozString(){
        String text = "asdf";
        //IDE EXCEPTION ZBOG USLOVA, JEDAN JE VISKA
        for (int i = 0; i <= text.length(); i++){
            System.out.println(i + "-ti karakter je: " + text.charAt(i));
        }
    }
    
    static void falicniFor(){
        String text = "asdf";
        //SVE OVE FOR PETLJE RADE ISTU STVAR
        for (int i = 0; i <= text.length(); i++){
            System.out.println(i + "-ti karakter je: " + text.charAt(i));
        }
        //========================== OBIRSAN KORAK
        for (int i = 0; i <= text.length();){
            System.out.println(i + "-ti karakter je: " + text.charAt(i));
            i++;
        }
        
        //OBRISAN USLOV
        for (int i = 0;;){
            System.out.println(i + "-ti karakter je: " + text.charAt(i));
            i++;
            if (i > text.length()) break;
        }
        
        //OBRISANA INICIJALIZACIJA
        int i = 0;
        for (;;){
            System.out.println(i + "-ti karakter je: " + text.charAt(i));
            i++;
            if (i > text.length()) break;
        }
    }
    
    static void duplaForPetlja(){
        System.out.println("A");
        
        for (int i = 0; i < 3 ; i++){
     
            System.out.println("B");
            
            for (int j = 0; j < 3; j++){
                System.out.println("C");
            }
            
        }
    }
    
    static void ispisiPiramidu(int n){
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n-1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
    
}
