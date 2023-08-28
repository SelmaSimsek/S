package SSG07_TernaryNestedIf;

import java.util.Scanner;

public class C05_NestedIf {
    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas>=18){
            System.out.println("lutfen kilonuzu giridiniz");
            double kilo= scan.nextDouble();
            if (kilo>=50){
                System.out.println("kan verebilirsiniz assagidaki formu doldurunuz");

            }else System.out.println("kilonuz tutmadigi icin kan veremezsiniz");

        }else System.out.println("yasiniz tutmadigi icin kan veremezsiniz buyuyup gelin");

    }
}
