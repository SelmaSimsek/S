package SSG05_IfStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

         /*
       Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
        String haftaSonu="cumartesi pazar";
        String haftaIci="pazartesi sali carsamba persembe cuma";

        if (!haftaSonu.contains(gunIsmi)&&!haftaIci.contains(gunIsmi)){
            System.out.println("lutfen duzgun bir gun ismi giriniz");

        }
        if (haftaSonu.contains(gunIsmi)){
            System.out.println("hafta sonu");
        }
        if (haftaIci.contains(gunIsmi)){
            System.out.println("hafta ici");
        }

    }
}
