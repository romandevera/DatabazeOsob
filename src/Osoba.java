public class Osoba {

    private String jmeno;
    private String prijmeni;
    private  String rodneCislo;

    public Osoba (){

    }


    public Osoba (String jmeno, String prijmeni, String rodneCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rodneCislo = rodneCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public static Osoba pridatOsobu (String jmeno, String prijmeni, String rodneCislo){
        return new Osoba(jmeno,prijmeni,rodneCislo);
    }
}
