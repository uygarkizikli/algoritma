// Klavyeden girilen bir ifadeyi istenen sayı kadar ekrana yazan programı
package cevap05;
import java.util.Scanner;
public class cevap05 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yazılmasını istediğiniz ifade: ");
        String ifade = input.next();
        System.out.print("Kaç kez yazdırılsın?: ");
        int miktar = input.nextInt();
        for (int i=1;i<=miktar;i++) {
            System.out.println(ifade);
        }
    }
}