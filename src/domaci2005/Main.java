package domaci2005;

public class Main {

    public static void main(String[] args) {

        Vlasnik vlasnik1 = new Vlasnik("Vladimir", "Vujin", "00254873");
        Stan stan1 = new Stan("Zrenjanin, Istarska 18", 50, vlasnik1, 2, true );
        System.out.println("Cena stana vlasnika " + vlasnik1.getIme() + " " + vlasnik1.getPrezime()
                + " na adresi " + stan1.getAdresa() + " je: " + stan1.racunajCenu() + " eur");

        Vlasnik vlasnik2 = new Vlasnik("Nataša", "Vujin", "00558796");
        Kuća kuća1 = new Kuća("Zrenjanin, Istarska bb", 130, vlasnik2, true );
        System.out.println("Cena kuće vlasnika " + vlasnik2.getIme() + " " + vlasnik2.getPrezime()
                + " na adresi " + kuća1.getAdresa() + " je: " + kuća1.racunajCenu() + " eur");

        Vlasnik vlasnik3 = new Vlasnik("Petar", "Petrović", "00211871");
        Stan stan2 = new Stan("Beograd, Kneza Miloša 5", 80, vlasnik3, 4, false );
        System.out.println("Cena stana vlasnika " + vlasnik3.getIme() + " " + vlasnik3.getPrezime()
                + " na adresi " + stan2.getAdresa() + " je: " + stan2.racunajCenu() + " eur");

        Vlasnik vlasnik4 = new Vlasnik("Jovan", "Jovanović", "11158196");
        Kuća kuća2 = new Kuća("Novi Sad, Kralja Petra 123", 180, vlasnik4, true );
        System.out.println("Cena kuće vlasnika " + vlasnik4.getIme() + " " + vlasnik4.getPrezime()
                + " na adresi " + kuća2.getAdresa() + " je: " + kuća2.racunajCenu() + " eur");
    }
}
