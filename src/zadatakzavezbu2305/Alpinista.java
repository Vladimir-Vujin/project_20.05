package zadatakzavezbu2305;

/*
Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost) i
poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara,
placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
a informacije o alpinisti se ispisuju u formatu:
    Alpinista, id: id
    ime: ime i prezime
    Broj poena: poeni
*/

public class Alpinista extends Planinar {

    private int brojPoena;
    private static final int clanarina = 1500;

    public Alpinista(int ID, String imePlaninara, String prezimePlaninara, int brojPoena) {
        super(ID, imePlaninara, prezimePlaninara);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() + "\n" +
                "ime: " + getImePlaninara() + " " + getPrezimePlaninara() + "\nBroj poena: " + brojPoena);
    }

    @Override
    public double clanarina() {
        if (brojPoena <= 30)
            //
            return clanarina - (brojPoena * 50);
        else
            return 0;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() == 0)
            return false;
        if (planina.getVisinaPlanine() <= 4000)
            return true;
        else
            return false;
    }
}
