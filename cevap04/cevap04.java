// Klavyeden girilen üç basamaklı sayının rakamları çarpımının, rakamları toplamına bölümünden kalanı bulan programı
package cevap04;
import java.util.Scanner;
public class cevap04 {
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
        System.out.println("Rakamlar çarpımı: "+ rakamlarcarpimi + " ve rakamlar toplamı: "+ rakamlartoplami);
    }
}
