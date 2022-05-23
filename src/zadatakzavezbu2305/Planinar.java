package zadatakzavezbu2305;

/*
* Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
Pored toga, klasa ima:
- apstraktnu metodu štampaj
- apstraktnu metodu koja vraca clanarinu planinara
- apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina.
* */
public abstract class Planinar {
    private int id;
    private String imePlaninara;
    private String prezimePlaninara;

    public Planinar(int ID, String imePlaninara, String prezimePlaninara) {
        this.id = ID;
        this.imePlaninara = imePlaninara;
        this.prezimePlaninara = prezimePlaninara;
    }

    public int getId() {
        return id;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public String getPrezimePlaninara() {
        return prezimePlaninara;
    }

    public abstract void stampaj();
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina planina);
}
