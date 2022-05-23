package zadatak1b;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Sastojci> sastojci1 = new ArrayList<>();
        sastojci1.add(new Sastojci(152, "Hleb"));
        sastojci1.add(new Sastojci(220, "Maslac"));
        sastojci1.add(new Sastojci(148, "Stišnjena šunka"));
        Obrok obrok1 = new Obrok(sastojci1, VrstaObroka.nezdrav);

        ArrayList<Sastojci> sastojci2 = new ArrayList<>();
        sastojci2.add(new Sastojci(240, "Ovsene pahuljice"));
        sastojci2.add(new Sastojci(110, "Sojino mleko"));
        Obrok obrok2 = new Obrok(sastojci2, VrstaObroka.zdrav);

        ArrayList<Sastojci> sastojci3 = new ArrayList<>();
        sastojci3.add(new Sastojci(247, "Jaja"));
        sastojci3.add(new Sastojci(450, "Pavlaka"));
        sastojci3.add(new Sastojci(98, "Uje"));
        sastojci3.add(new Sastojci(152, "Hleb"));
        Obrok obrok3 = new Obrok(sastojci3, VrstaObroka.nezdrav);

        ArrayList<Sastojci> sastojci4 = new ArrayList<>();
        sastojci4.add(new Sastojci(178, "Pirinač"));
        sastojci4.add(new Sastojci(25, "Kurkuma"));
        sastojci4.add(new Sastojci(145, "Belo meso"));
        Obrok obrok4 = new Obrok(sastojci4, VrstaObroka.zdrav);

        System.out.println("ZADATAK 1 DRUGI NAČIN:");
        System.out.print("OBROK 1: ");
        obrok1.obrokInfo(obrok1);

        System.out.print("OBROK 2: ");
        obrok2.obrokInfo(obrok2);

        System.out.print("OBROK 3: ");
        obrok3.obrokInfo(obrok3);

        System.out.print("OBROK 4: ");
        obrok4.obrokInfo(obrok4);
    }


}
