package domaci2005;

public class Vlasnik {

    private String ime;
    private String prezime;
    private String brojLK;

    public Vlasnik() {
    }

    public Vlasnik(String ime, String prezime, String brojLK) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojLK = brojLK;
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

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + brojLK;
    }
}
