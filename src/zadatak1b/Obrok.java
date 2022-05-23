package zadatak1b;

import java.util.ArrayList;

public class Obrok {

    private ArrayList<Sastojci> sastojci;
    private VrstaObroka vrstaObroka;

    public Obrok(ArrayList<Sastojci> sastojci, VrstaObroka vrstaObroka) {
        this.sastojci = sastojci;
        this.vrstaObroka = vrstaObroka;
    }

    public ArrayList<Sastojci> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojci> sastojci) {

        this.sastojci = sastojci;
    }

    public VrstaObroka getVrstaObroka() {
        return vrstaObroka;
    }

    public void setVrstaObroka(VrstaObroka vrstaObroka) {
        this.vrstaObroka = vrstaObroka;
    }

    @Override
    public String toString() {
        return vrstaObroka + " " + sastojci;
    }

    public int racunajKalorije(){
        int sumaKalorija = 0;
        for (int i = 0; i < sastojci.size(); i++){
            sumaKalorija += sastojci.get(i).getBrojKalorija();
        }
        return sumaKalorija;
    }

    public void obrokInfo(Obrok obrok){
        if (vrstaObroka == VrstaObroka.zdrav)
            System.out.println("Hranite se zdravo, uneli ste " + obrok.racunajKalorije()  + " kalorija");
        else
            System.out.println("Ne hranite se zdravo, uneli ste " + obrok.racunajKalorije() + " kalorija");
    }
}

