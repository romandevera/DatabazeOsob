import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Seznam seznam = new Seznam();

        //String jmeno = scanner.nextLine();
        //String prijmeni = scanner.nextLine();
        //String rodneCislo = scanner.nextLine();


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
                   System.out.println("write the Name, Surename, birth ID");
                  // seznam.pridatDoSeznamu(Osoba.pridatOsobu(scanner.next(),scanner.next(),scanner.next() ));
                   seznam.pridatDoSeznamu(Osoba.pridatOsobu(scanner.next(),scanner.next(),scanner.next()));
                    break;

            }
        }
    }
        public static void tiskMoznosti () {
            System.out.println("\nPress ");
            System.out.println("\t 0 - Konec programu.");
            System.out.println("\t 1 - Tisk seznamu.");
            System.out.println("\t 2 - Pridani zaznamu.");
        }
    }

