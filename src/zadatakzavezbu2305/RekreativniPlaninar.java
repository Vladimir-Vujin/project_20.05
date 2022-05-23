package zadatakzavezbu2305;

/*
Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
 - težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
 - naziv okruga odakle je rekreativni planinar
 - maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)

metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
    Rekreativac, id: id
    ime: ime prezime Okrug: okrug

da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.

rekeativci placaju clanarinu u iznosu od 1000 rsd

metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
    Rekreativac, id: id
    ime: ime prezime Okrug: okrug
*/

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;
    static final int clanarina = 1000;

    public RekreativniPlaninar(int ID, String imePlaninara, String prezimePlaninara, int tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
        super(ID, imePlaninara, prezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }

    public void setMaksimalniUspon(int maksimalniUspon) {
        this.maksimalniUspon = maksimalniUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() + "\n" +
                "ime: " + getImePlaninara() + " " + getPrezimePlaninara() + "\nOkrug: " + nazivOkruga);
    }

    @Override
    public double clanarina() {
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() == 0)
            return false;
        if (tezinaOpreme * 50 >= maksimalniUspon)
            return false;
        else
            return ((maksimalniUspon - (tezinaOpreme * 50)) > planina.getVisinaPlanine());
    }
}
