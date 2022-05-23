package zadatak1;

import java.util.ArrayList;

public class NezdravObrok extends Obrok {

    public NezdravObrok() {
    }

    public NezdravObrok(ArrayList<Sastojci> sastojci) {
        super(sastojci);
    }

    @Override
    public void racunajKalorije(){
        int sumaKalorija = 0;
        for (int i = 0; i < getSastojci().size(); i++){
            sumaKalorija += getSastojci().get(i).getBrojKalorija();
        }
        System.out.println("Ne hranite se zdravo, uneli ste " + sumaKalorija + " kalorija");
    }
}
