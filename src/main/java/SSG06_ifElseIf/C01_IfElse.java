package SSG06_ifElseIf;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
      /*
        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("sayimiz cifttir");
        }else System.out.println("sayimiz tektir");

        }
    }

