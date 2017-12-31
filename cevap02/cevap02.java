// Klavyeden "0" yazılmadığı sürece girilen sayıları toplayan program
package cevap02;
import java.util.Scanner;
public class cevap02 {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int girilen = -1, toplam=0, sayac=0;
        while (girilen != 0) {
            sayac++;
            System.out.println("Bir sayı giriniz: (İşlemi sonlandırmak için 0'a yazın) ");
            girilen = scan.nextInt();
            toplam += girilen;
            if (girilen == 0) {
                System.out.println("Girdiğiniz sayıların toplamı : "+toplam);
            }
        }
    }
}