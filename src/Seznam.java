import java.util.ArrayList;
import java.util.Scanner;

public class Seznam {

    public Scanner scanner  = new Scanner(System.in);
    public ArrayList<Osoba> seznam = new ArrayList<>();
    Osoba osoba = new Osoba();


    public void  pridatDoSeznamu (Osoba osoba) {

     for(int f=0;f<seznam.size();f++){
            if (seznam.get(f).getJmeno().equals(osoba.getJmeno()) && seznam.get(f).getPrijmeni().equals(osoba.getPrijmeni()) && seznam.get(f).getRodneCislo().equals(osoba.getRodneCislo()))
     {
                System.out.println("duplikat "+seznam.get(f));
                return;
            }

        }
        seznam.add(osoba);

    }

    public void tiskSeznamu (){
        System.out.println("Mame "+seznam.size()+" zaznamu");
        for (int i=0; i<seznam.size();i++){

           System.out.println((i+1)+". zaznam ***********************");
           System.out.println(seznam.get(i));

        }
    }

    public void odstrnitZeSeznamu(){

            System.out.println("Jake cislo zaznamu chcete odstranit");

                int vymaz = scanner.nextInt();
                for (int e = 0; e < seznam.size(); e++) {

                    if (vymaz==(e+1)) {
                        seznam.remove(e);
                        System.out.println("odstraneno");
                    }

                }

    }


    public void  nalezenaOsoba () {
        System.out.println("Zadejte hledany vyraz: ");
        String hledanyVyraz = scanner.next();

        for (int a = 0; a < seznam.size(); a++) {
            if ( seznam.get(a).getJmeno().equals(hledanyVyraz) || seznam.get(a).getPrijmeni().equals(hledanyVyraz) || seznam.get(a).getRodneCislo().equals(hledanyVyraz) ){

                System.out.println("Hledany zaznam cislo: "+(a+1)+" "+ seznam.get(a));

            }



        }


    }

}

