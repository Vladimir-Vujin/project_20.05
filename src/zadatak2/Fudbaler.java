package zadatak2;

public class Fudbaler extends Sportista {

    private PozicijaUTimu pozicija;
    private int trzisnaVrednost;

    public Fudbaler() {
    }

    public Fudbaler(String ime, String prezime, String jmbg, Nivo nivo, PozicijaUTimu pozicija, int trzisnaVrednost) {
        super(ime, prezime, jmbg, nivo);
        this.pozicija = pozicija;
        if (trzisnaVrednost >= 0)
            this.trzisnaVrednost = trzisnaVrednost;
        else
            System.out.println("Tržišna vrednost mora biti pozitivan broj!");
    }

    public PozicijaUTimu getPozicija() {
        return pozicija;
    }

    public void setPozicija(PozicijaUTimu pozicija) {
        this.pozicija = pozicija;
    }

    public int getTrzisnaVrednost() {
        return trzisnaVrednost;
    }

    public void setTrzisnaVrednost(int trzisnaVrednost) {
        if (trzisnaVrednost >= 0)
            this.trzisnaVrednost = trzisnaVrednost;
        else
            System.out.println("Tržišna vrednost mora biti pozitivan broj!");
    }

    @Override
    public String toString() {
        return pozicija + " " + trzisnaVrednost;
    }
}
