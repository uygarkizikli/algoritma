// Klavyeden 15 sayısı girilene kadar sayıları toplayıp sonucu ekrana yazan programı
package cevap01;
import java.util.Scanner;
public class cevap01 {
    public static void main (String[] args) {
        int toplam = 0, i = 1;
        Scanner input = new Scanner(System.in);
        while (i < 16) {
            System.out.println(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("Girilen sayıların toplamı = " + toplam);
    }
}