package zadatak2;

public abstract  class Sportista {
    private String ime;
    private String prezime;
    private String jmbg;
    private Nivo nivo;

    public Sportista() {
    }

    public Sportista(String ime, String prezime, String jmbg, Nivo nivo) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.nivo = nivo;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public Nivo getNivo() {
        return nivo;
    }

    public void setNivo(Nivo nivo) {
        this.nivo = nivo;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + jmbg + " " + nivo;
    }
}
