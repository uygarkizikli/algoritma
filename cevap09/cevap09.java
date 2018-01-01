// Klavyeden girilen sayının tek mi çift mi olduğunu belirten programı
package cevap09;
import java.util.Scanner;
public class cevap09 {
    public static void main (String[] args) {
        System.out.println("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        if (sayi%2==0)
            System.out.println("Girilen sayı çifttir.");
        else
            System.out.println("Girilen sayı tektir.");
    }
}