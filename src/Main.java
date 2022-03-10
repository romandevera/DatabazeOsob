import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Seznam seznam = new Seznam();


        boolean smycka = false;

        while (!smycka) {

            tiskMoznosti();
            System.out.println("Zadejte svoji volbu: ");
            int volba = scanner.nextInt();
            switch (volba) {
                case 0:
                    smycka = true;
                    break;

                case 1:
                    seznam.tiskSeznamu();
                    break;

                case 2:
                   System.out.println("Napiste jmeno, prijmeni,  rodne cislo");
                   seznam.pridatDoSeznamu(Osoba.pridatOsobu(scanner.next().toString(),scanner.next().toString(),scanner.next().toString()));
                    break;

                case 3:
                   seznam.odstrnitZeSeznamu();
                   break;

                case 4:
                    seznam.nalezenaOsoba();
                    break;
            }
        }
    }
        public static void tiskMoznosti () {
            System.out.println("\nPress ");
            System.out.println("\t 0 - Konec programu.");
            System.out.println("\t 1 - Tisk seznamu.");
            System.out.println("\t 2 - Pridani zaznamu.");
            System.out.println("\t 3 - Vymaz zaznamu.");
            System.out.println("\t 4 - Najit hledany zaznam.");
        }
    }

