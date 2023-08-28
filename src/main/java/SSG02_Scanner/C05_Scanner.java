package SSG02_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanicidan tek bir karakter alip yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tek bir karakter giriniz");
        char chr=scan.next().charAt(0);
        System.out.println(chr);

    }
}
