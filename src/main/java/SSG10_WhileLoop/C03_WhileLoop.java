package SSG10_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        while(toplam<=500){
            System.out.println("lutfen toplamak istediginiz pozitif sayilari giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                toplam+=sayi;
            }else System.out.println("lutfen pozitif olsun!!!!!");

        }
        System.out.println("artik yeter cok sayi girdin, toplam : "+toplam+" oldu");
    }
}
