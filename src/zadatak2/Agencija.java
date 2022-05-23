package zadatak2;

import com.sun.jdi.InconsistentDebugInfoException;

import java.util.ArrayList;

/*
*Agenciju opisuju naziv i adresa. O svim sportistima je potrebno da pamtimo
ime, prezime i JMBG, a znamo da se sportisti dele na fudbalere i tenisere.
Sportisti se dele po nivoima na: profesionalne, poluprofesionalne i amatere
(ovo važi i za fudbalere i za tenisere). Za tenisere treba da pamtimo rang na
ATP listi (ne sme biti negativna vrednost).   Za fudbalere je potrebno znati
njihovu poziciju u timu i tržišnu vrednost (ne sme biti negativna vrednost).
Kreirati nekoliko tenisera u main-u i prikazati onog ko je najbolje rangiran.
* */
public class Agencija {
    private String naziv;
    private String adresa;
    private ArrayList<Sportista> listaSportista = new ArrayList<>();

    public Agencija() {
    }

    public Agencija(String naziv, String adresa, ArrayList<Sportista> listaSportista) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.listaSportista = listaSportista;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Sportista> getListaSportista() {
        return listaSportista;
    }

    public void setListaSportista(ArrayList<Sportista> listaSportista) {
        this.listaSportista = listaSportista;
    }

    @Override
    public String toString() {
        return naziv + " " + adresa + " " + listaSportista;
    }

    public String najboljeRangiraniTeniser() {
        int najboljiTeniser = 150;

        for (int i = 0; i < listaSportista.size(); i++) {
            if (listaSportista.get(i) instanceof Teniser) {
                if (najboljiTeniser > ((Teniser) listaSportista.get(i)).getRangNaATP()) {
                    najboljiTeniser = i;
                }
            }
        }
        return listaSportista.get(najboljiTeniser).getIme() + " " +
                listaSportista.get(najboljiTeniser).getPrezime() + " i nalazi se na mestu broj " +
                ((Teniser)listaSportista.get(najboljiTeniser)).getRangNaATP();
    }
}
