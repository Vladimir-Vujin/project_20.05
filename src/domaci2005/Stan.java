package domaci2005;

public class Stan extends Nekretnina {

    private int sprat;
    private boolean imaLiTerasu;

    public Stan() {
    }

    public Stan(String adresa, int kvadratura, Vlasnik vlasnik, int sprat, boolean imaLiTerasu) {
        super(adresa, kvadratura, vlasnik);
        this.sprat = sprat;
        this.imaLiTerasu = imaLiTerasu;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public boolean isImaLiTerasu() {
        return imaLiTerasu;
    }

    public void setImaLiTerasu(boolean imaLiTerasu) {
        this.imaLiTerasu = imaLiTerasu;
    }

    @Override
    public String toString() {
        return super.toString() + sprat + " " + imaLiTerasu;
    }

    @Override
    public int racunajCenu() {
        return 2000 * getKvadratura();
    }
}
