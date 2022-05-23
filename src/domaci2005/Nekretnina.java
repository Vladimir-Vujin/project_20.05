package domaci2005;

/*
* Napraviti klasu Nekretnina koja od atributa ima adresu, kvadraturu i podatke
o vlasniku. Vlasnik ima ime, prezime i broj lične karte. Nekretnina može biti
stan ili kuća. Za stan dodatno čuvamo informaciju koji je sprat i da li ima
terasu. Za kuću čuvamo da li ima dvorište. Napraviti metodu racunajCenu()
koja računa cenu nekretnine za stan po formuli 2000 * kvadratura, a za kuću
1300 * kvadratura.  Testirati rad klasa iz Main klase.
*
* */

public abstract class Nekretnina {

    private String adresa;
    private int kvadratura;
    private Vlasnik vlasnik;

    public Nekretnina() {
    }

    public Nekretnina(String adresa, int kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        return adresa  + " " + kvadratura + " " + vlasnik;
    }

    public abstract int racunajCenu();
}
