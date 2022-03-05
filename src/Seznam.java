import java.util.ArrayList;
import java.util.Scanner;

public class Seznam {

    public Scanner scanner  = new Scanner(System.in);
    public ArrayList<Osoba> seznam = new ArrayList<>();
    //Osoba osoba = new Osoba();

    public void pridatDoSeznamu (Osoba osoba) {
       seznam.add(osoba);

    }

    public void tiskSeznamu (){
        System.out.println("Mame "+seznam.size()+" zaznamu");
        for (int i=0; i<seznam.size();i++){
            System.out.println(seznam.get(i));
        }

    }
}

