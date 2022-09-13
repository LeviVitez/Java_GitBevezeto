package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat8 {
    public static void main(String[] args) {
        /*
        Írjon programot, amivel fej vagy írás játékot lehet játszani.
Először egy a képernyőre kiírt menü segítségével kérje be a felhasználó tippjét, ami legyen egy egész szám. A 0 fejet,
az 1 írást jelentsen.
Ezután generáljon egy véletlen egész számot a [0,1] azaz [0,2[ intervallumból, ez lesz a pénzfeldobás eredménye.
Ezt írja is ki a képernyőre, majd írja ki, hogy a felhasználó jól tippelt-e. Ha igen, gratuláljon neki, ha nem, bíztassa,
hogy játsszon újra
         */
        System.out.println("Kérem adja meg a tippjét (0 - fej || 1 - irás): ");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        // Véletlen egész szám a és b között: (int)Math.random()*(b - a + 1)) + a
        int feldobas = (int) (Math.random() * 2);
        String feldobasszoveges = (feldobas == 0) ? "fej" : "írás";
        System.out.printf("A dobás eredménye %s. ",feldobasszoveges);
        if (tipp==feldobas){
            System.out.println("Gratulálok nyert!");
        }else{
            System.out.println("Sajnos most nem nyert, próbálkozz újra");
        }

       /* System.out.printf("A dobás eredménye %s", (feldobas == 0 ? "fej" : "írás")); 3 lábú operátor */

    }
}
