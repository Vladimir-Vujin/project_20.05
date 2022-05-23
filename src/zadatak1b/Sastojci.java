package zadatak1b;

public class Sastojci {

    private int brojKalorija;
    private String nazivSastojka;

    public Sastojci() {
    }

    public Sastojci(int brojKalorija, String nazivSastojka) {
        this.brojKalorija = brojKalorija;
        this.nazivSastojka = nazivSastojka;
    }

    public int getBrojKalorija() {
        return brojKalorija;
    }

    public void setBrojKalorija(int brojKalorija) {
        this.brojKalorija = brojKalorija;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    @Override
    public String toString() {
        return nazivSastojka + " " + brojKalorija;
    }
}
