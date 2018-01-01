// Klavyeden okunan en fazla 4 basamaklı bir pozitif tam sayının çarpanlarına ayıran program
package cevap07;
import java.util.Scanner;
public class cevap07 {
    public static void main (String[] args) {
        System.out.println("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        if (sayi>10000) {
            System.out.println("Girilen sayı 4 basamaktan fazla");
        } else {
            System.out.println("Girilen sayının pozitif tam bölenleri: ");
            for (int i=2;i<=sayi/2;i++) {
                if (sayi%i==0) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}