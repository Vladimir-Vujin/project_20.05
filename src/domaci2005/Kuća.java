package domaci2005;

public class Kuća extends Nekretnina {

    boolean daLiImaDvorište;

    public Kuća() {
    }

    public Kuća(String adresa, int kvadratura, Vlasnik vlasnik, boolean daLiImaDvorište) {
        super(adresa, kvadratura, vlasnik);
        this.daLiImaDvorište = daLiImaDvorište;
    }

    public boolean isDaLiImaDvorište() {
        return daLiImaDvorište;
    }

    public void setDaLiImaDvorište(boolean daLiImaDvorište) {
        this.daLiImaDvorište = daLiImaDvorište;
    }

    @Override
    public String toString() {
        return super.toString() + " " + daLiImaDvorište;
    }

    @Override
    public int racunajCenu() {
        return 1300 * getKvadratura();
    }
}
