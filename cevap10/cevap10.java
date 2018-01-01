// Klavyeden girilen üç basamaklı sayının rakamları çarpımının, rakamları toplamına bölümünden kalanı bulan program
package cevap10;
import java.util.Scanner;
public class cevap10 {
    public static void main (String[] args) {
        System.out.println("Üç basamaklı bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int yuzler,onlar,birler;
        yuzler = sayi / 100;
        sayi = sayi % 100;
        onlar =sayi / 10;
        birler  = sayi % 10;
        int rakamlarcarpimi = birler * onlar * yuzler;
        int rakamlartoplami = birler + onlar + yuzler;
        System.out.println("Rakamlar çarpımının toplamına bölümünden kalan: "+ rakamlarcarpimi % rakamlartoplami);
    }
}