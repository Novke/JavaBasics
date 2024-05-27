/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Novica
 */
public class TestKlasa {
    public static void main(String[] args) {
        //ne vidi je jer je private
//        Cas4.primerPrivatnaMetoda();

//vidi je jer je pack-priv a u istom su paketu
Cas4.primerPackagePrvateMetoda();

        //vidi promenljiivu jer je public
//      Cas4.prom4;

        System.out.println("Rezultat je:" + rekurzija(5));

    }
    
    
    static int rekurzija(int broj){
        if (broj > 30){
            System.out.println("HAHA");
            return 10;
        }
        if (broj % 3 == 2){
            System.out.println("WOW");
            return 3+rekurzija(broj*2);
        }
        System.out.println("Denver");
        return 2*(rekurzija(broj+4));
    }
    
}
