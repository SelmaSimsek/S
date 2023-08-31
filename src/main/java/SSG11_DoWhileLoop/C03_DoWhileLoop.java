package SSG11_DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

//Bir tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.
        int sayi=40;
        int toplam=0;
        int bolen=1;
        do {
            if (sayi%bolen==0){
                System.out.println(sayi+" sayisi "+bolen+" sayisina tam bolunebiliyo");
                toplam+=bolen;

            }
            bolen++;
        }while (bolen<=sayi);
        System.out.println("bolenlerin toplami : "+toplam);



    }
}