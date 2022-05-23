package zadatak2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Sportista> listaSportista = new ArrayList<>();
        listaSportista.add(new Fudbaler("Lionel", "Messi", "1506980875488", Nivo.profesionalac,
                PozicijaUTimu.napadac, 15000000));
        listaSportista.add(new Fudbaler("Nemanja", "Vidić", "1105987850045", Nivo.profesionalac,
                PozicijaUTimu.napadac, 800000));
        listaSportista.add(new Teniser("Novak", "Đoković", "1004984785015", Nivo.profesionalac, 1));
        listaSportista.add(new Teniser("Rafael", "Nadal", "0507989847523", Nivo.profesionalac, 17));
        listaSportista.add(new Teniser("Rodžer", "Federer", "2309979852145", Nivo.profesionalac, 2));
        listaSportista.add(new Teniser("Dmitri", "Medvedev", "2309979852145", Nivo.profesionalac, 150));

        Agencija agencija = new Agencija("Agencija1", "Beograd, Kneza Miloša 1", listaSportista);

        System.out.println("Najbolji teniser na ATP listi je: " + agencija.najboljeRangiraniTeniser());
    }
}
