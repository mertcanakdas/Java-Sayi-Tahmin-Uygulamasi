/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tahmin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Tahmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rnumber = new Random();
        int tahmin,sayı,hamle=0;
        sayı = Rnumber.nextInt(20)+1;
        do {
            System.out.print("sayıyı tahmin etmek için 1 ile 20 arasında bir sayı giriniz:");
            tahmin = input.nextInt();
            if(sayı==tahmin){
                System.out.println(hamle+".tahmininizde doğru bildiniz");
            }
            else if(sayı-tahmin==1 || tahmin-sayı==1){
                System.out.println("sayı 1 adım uzağınızda!!!");
            }
            else if(sayı-tahmin==2 || tahmin-sayı==2){
                System.out.println("sıcak YANIYOR!!!");
            }
            else if(sayı-tahmin==3 || tahmin-sayı==3){
                System.out.println("ılık");
            }
            else if(sayı-tahmin>3 || tahmin-sayı>3){
                System.out.println("soğuk,sayıdan uzaksınız");
            }
            else if(hamle>10){
                System.out.println("bahtsız bedevi seni");
            }
            else{
                System.out.println("yanlış tahmin tekrar deneyin");
            }
            hamle++;
            System.out.println();
        } while (sayı!=tahmin);
           
    }
    
}
