package zadatakzavezbu2305;

import java.util.ArrayList;

/*Kreirati glavnu klasu I u njoj:
instancirati jednu planinu
napraviti niz ili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planin
ispisati kolika je zbir svih clanarina planinara iz niza/liste
* */
public class Main {

    public static void main(String[] args) {

        Planina planina = new Planina("Kopaonik", "Srbija", 1500);

        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(new RekreativniPlaninar(123, "Vladimir", "Vujin",
                15, "Zrenjanin", 2800));
        planinari.add(new RekreativniPlaninar(124, "Petar", "Petrovic",
                20, "Novi Sad", 2450));
        planinari.add(new RekreativniPlaninar(125, "Milan", "Milosevic",
                18, "Beograd", 3150));

        planinari.add(new Alpinista(126, "Jovan", "Jovanovic",
                35));
        planinari.add(new Alpinista(127, "Dejan", "Dejanovic",
                42));
        planinari.add(new Alpinista(128, "Ivan", "Ivanovic",
                17));

        int ukupnaClanarina = 0;
        for (Planinar planinar : planinari) {
            planinar.stampaj();
            System.out.println(planinar.uspesanUspon(planina));
            ukupnaClanarina += planinar.clanarina();
        }

        System.out.println(ukupnaClanarina);
    }
}
