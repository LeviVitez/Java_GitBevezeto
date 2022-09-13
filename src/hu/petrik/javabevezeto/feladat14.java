package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy szöveget: ");
        String szoveg = sc.nextLine();
        String menupont = " ";
        while (menupont.equals("f")) {
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - Nagybetűssé alakítani");
            System.out.println("\tb - kisbetűssé alakítani");
            System.out.println("\tc - lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani egy másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiiratni");
            System.out.println("\tf - kilépni");
            System.out.println("Adja meg a menüpontot: ");
            menupont = sc.nextLine().toLowerCase();
            switch (menupont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter\n", szoveg.length());
                    break;
                case "d":
                    System.out.print("Kérem adja meg a másik szöveget: ");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = szoveg.compareTo(szoveg2);
                    if (osszehasonlitas < 0) {
                        System.out.println("Az első szöveg van előrébb az ABC-ben");
                    } else if (osszehasonlitas > 0) {
                        System.out.println("A második szöveg van előrébb az ABC-ben");
                    }
                    break;
                case "e":
                    System.out.print("Kérem adja meg a kezdő karaktert sorszámát amit ki szeretne írni: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Kérem adja meg az utlosó karakter sor számát amit ki szeretne írni");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a - 1, b - 1));
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg kérem a menüpontok közül válasszon!");
                    break;
            }
        }
    }
}
