/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Novica
 */
public class Cas2 {
    
    public static void main(String[] args) {
        brojacReci();
    }
    
     void funkcija1(){
        //mora import
        double x = sqrt(10);
        
        //ne mora import
        double y = Math.sqrt(25);
        System.out.println("x = " + x);
    }
    //void - izlazni (ne vraca nista
    //int x - ulazni parametar (tipa integer)
    static void funkcija2(int x){
        
        if (x % 3 == 0){
            System.out.println("Prosldjen je broj deljiv sa 3");
        } else {
            System.out.println("Prosldjen je nedeljivi broj");
        }
    }
    
    static double kvadriraj(int x){
        System.out.println("Prosledjen je broj " + x);
        double result = Math.pow(x,2);
        System.out.println("Kvadrat broja x je " + result);
        return result;
    }
    
    //izracunaj x -> x! + x-1! + x-2! .... 0
    static int funkcija3(int x){
        
        int rezultat = 0;
        
        for ( int i = x; i > 0 ; i--){
            rezultat = rezultat + faktorijal(i);
        }
        
        return rezultat;
    }
    
    static int faktorijal(int x){
        int result = 1;
            //prom     //uslov  //korak
        for (int i = x; i > 0; i--){
            result = result * i;
        }
        return result;
    }
    
    static void ispisiod1do(int x){
        for (int i = 1; i <= x ; i++){
            System.out.println(i);
        }
    }
    
    static void ispisiod1dowhile(int x){

        int i = 1;
        //uslov
        while (i <= x) {            
            //kod koji se izvrsava
            System.out.println(i);
            i++;
        }
        i+=5;
    }
    
    static void podeli(){

        int stanjePoklona = 15;
        //uslov
        while (stanjePoklona > 0) {            
            //kod koji se izvrsava
            System.out.println("Delim poklon!");
            stanjePoklona--;
        }
    }
    
    static int sumaod1do(int x){
        if (x < 0) throw new RuntimeException();
        int result = 0;
        for (int i = 0; i < x; i++) {
            result = result + i;
        }
        System.out.println(result);
        return result;
    }
        
    static void funkcija4(){
        String text = "Pera";
        char c = text.charAt(2);
        System.out.println(c);
        
        int duzina = text.length();
        System.out.println("Duzina: " + duzina);
        
        //ispsuje po slovo u novom redu
        for (int i = 0; i < text.length(); i++){
            char c1 = text.charAt(i);
            System.out.println(c1);
        }
        
        //toUpperCase
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
    
    static void systemInTest(){
        System.out.println("START");
        Scanner skener = new Scanner(System.in);
        //kad dodjde do ovde on ceka korisnikov unos
        String text = skener.next();
        System.out.println("Korisnik je uneo: " + text);
        System.out.println("END");
    }
    
    static void systemInTest1(){
        System.out.println("START");
        Scanner skener = new Scanner(System.in);
        //OCEKUJE INTEGER I BACA EXCEPTION AKO NE DOBIJEa
        int unos = skener.nextInt();
        System.out.println("Korisnik je uneo: " + (unos * 2));
        System.out.println("END");
    }
    
    static void systemInTest2(){
        System.out.println("START");
        Scanner skener = new Scanner(System.in);
        //OCEKUJE INTEGER I BACA EXCEPTION AKO NE DOBIJEa
        System.out.print("Unesi a: ");
        int a = skener.nextInt();
        System.out.print("Unesi b: ");
        int b = skener.nextInt();
        System.out.println("Zbir je " + (a+b));
        System.out.println("END");
    }
    
    static void brojacReci(){
        int i = 0;
        //beskonacna petlja
        while (true){
            System.out.println(i++);
        }
    }
   
}
