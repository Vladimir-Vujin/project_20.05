package zadatak1;

import java.util.ArrayList;

public class ZdravObrok extends Obrok {

    public ZdravObrok() {
    }

    public ZdravObrok(ArrayList<Sastojci> sastojci) {
        super(sastojci);
    }

    @Override
    public void racunajKalorije() {
        int sumaKalorija = 0;
        for (int i = 0; i < getSastojci().size(); i++){
            sumaKalorija += getSastojci().get(i).getBrojKalorija();
        }
        System.out.println("Hranite se zdravo, uneli ste " + sumaKalorija  + " kalorija");
    }
}
