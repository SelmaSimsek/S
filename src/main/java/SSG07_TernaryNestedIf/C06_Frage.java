package SSG07_TernaryNestedIf;

import java.util.Scanner;

public class C06_Frage {
    public static void main(String[] args) {

        /*
        bir lunaparka gelen musteriye once annesinden izin alıp alamadigini sorun aldiysa yasini sorun yasi (15e esit)15'ten buyukse
        kilosunu sorun kilosu (100e esit degil)100'den kucuk  binebilmesine izin verin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen annenizden izin alip almadiginiz bilgisini giriniz. Izin almissaniz 'Evet', almamissaniz 'Hayir' yaziniz");
        String lunaParkIzni = input.next();

        if (lunaParkIzni.equalsIgnoreCase("Evet")){
            System.out.println("Lütfen yasinizi giriniz");
            int age = input.nextInt();
            if (age >=15){
                System.out.println("lütfen kilonuzu giriniz");
                double weight = input.nextDouble();
                String result = weight<100? "Lunapark'a girebilirsiniz": "lunapark'a girmek icin fazla kilolusunuz";
                System.out.println(result);

            }else if (age>0 && age<=15){
                System.out.println("15 yas altindakiler Lunapark'a giremez");
            }else {
                System.out.println("Lütfen gecerli bir yas giriniz");
            }
        }else if(lunaParkIzni.equalsIgnoreCase("Hayir")){
            System.out.println("Annenizden izin almalisiniz");

        }else{
            System.out.println("Evet ya da Hayir yazmalisiniz");
        }

    }
}
