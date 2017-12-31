// 45 ile 225 arasındaki çift ve 7'ye bölünebilen sayıların toplamını bulan program
package cevap03;
public class cevap03 {
    public static void main (String[] args) {
        int toplam=0;
        for (int i=45;i<=225;i++) {
            if (i%2==0 && i%7==0)
                toplam+=i;
        }
        System.out.print("45 ile 225 arasındaki çift ve 7'ye bölünebilen sayıların toplamı: "+toplam);
    }
}