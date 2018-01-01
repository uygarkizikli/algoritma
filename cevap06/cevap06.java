// 1'den 1000'e kadar olan sayılar içerisinde 5'e tam bölünebilen ve 7’ye tam bölünemeyen sayıları sayan, toplamlarını hesaplayan ve bu sayıları listeleyen program
package cevap06;
import java.util.Scanner;
public class cevap06 {
    public static void main (String[] args) {
        int adet = 0, toplam = 0;
        for (int i=1;i<1000;i++){
            if (i%5==0 && i%7!=0){
                System.out.print(i + "-");
                toplam+=i;
                adet++;
            }
        }
        System.out.print("\nSayıların toplamı = " + toplam + " adedi: " + adet);
    }
}