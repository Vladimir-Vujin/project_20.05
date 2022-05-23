package zadatak1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Sastojci> sastojci1 = new ArrayList<>();
        sastojci1.add(new Sastojci(152, "Hleb"));
        sastojci1.add(new Sastojci(220, "Maslac"));
        sastojci1.add(new Sastojci(148, "Stišnjena šunka"));
        NezdravObrok obrok1 = new NezdravObrok(sastojci1);

        ArrayList<Sastojci> sastojci2 = new ArrayList<>();
        sastojci2.add(new Sastojci(240, "Ovsene pahuljice"));
        sastojci2.add(new Sastojci(110, "Sojino mleko"));
        ZdravObrok obrok2 = new ZdravObrok(sastojci2);

        ArrayList<Sastojci> sastojci3 = new ArrayList<>();
        sastojci3.add(new Sastojci(247, "Jaja"));
        sastojci3.add(new Sastojci(450, "Pavlaka"));
        sastojci3.add(new Sastojci(98, "Uje"));
        sastojci3.add(new Sastojci(152, "Hleb"));
        Obrok obrok3 = new NezdravObrok(sastojci3);

        ArrayList<Sastojci> sastojci4 = new ArrayList<>();
        sastojci4.add(new Sastojci(178, "Pirinač"));
        sastojci4.add(new Sastojci(25, "Kurkuma"));
        sastojci4.add(new Sastojci(145, "Belo meso"));
        Obrok obrok4 = new ZdravObrok(sastojci4);

        System.out.print("OBROK 1: ");
        obrok1.racunajKalorije();
        System.out.print("OBROK 2: ");
        obrok2.racunajKalorije();
        System.out.print("OBROK 3: ");
        obrok3.racunajKalorije();
        System.out.print("OBROK 4: ");
        obrok4.racunajKalorije();

    }
}
