package zadatak2;

public class Teniser extends Sportista {

    private int rangNaATP;

    public Teniser() {
    }

    public Teniser(String ime, String prezime, String jmbg, Nivo nivo, int rangNaATP) {
        super(ime, prezime, jmbg, nivo);
        if (rangNaATP >= 0)
            this.rangNaATP = rangNaATP;
        else
            System.out.println("Rang na ATP listi mora biti pozitivan broj!");
    }

    public int getRangNaATP() {
        return rangNaATP;
    }

    public void setRangNaATP(int rangNaATP) {
        if (rangNaATP >= 0)
            this.rangNaATP = rangNaATP;
        else
            System.out.println("Rang na ATP listi mora biti pozitivan broj!");
    }

    @Override
    public String toString() {
        return rangNaATP + " ";
    }
}
