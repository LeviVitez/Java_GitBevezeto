package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class feladat14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Kérek egy szöveget: ");
        String szoveg=sc.nextLine();
        String menupont="";
        while (menupont.equals("f")){
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - Nagybetűssé alakítani");
            System.out.println("\tb - kisbetűssé alakítani");
            System.out.println("\tc - lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani egy másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiiratni");
            System.out.println("\tf - kilépni");
            System.out.println("Adja meg a menüpontot: ");
            menupont=sc.nextLine().toLowerCase();
        }
    }
}
