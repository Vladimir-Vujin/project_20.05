 package zadatak1;

 import java.util.ArrayList;
 import java.util.RandomAccess;

 /* Napraviti klasu Obrok koja ima kao atribut listu sastojaka od kojih se obrok sastoji i metodu
    racunajKalorije(). Svaki sastojak ima broj kalorija i naziv sastojka. Obrok može
    biti zdrav ili nezdrav. Metoda racunajKalorije() treba da se izvršava tako da u
    zdravom obroku sabere sve kalorije obroka i prikaže ih korisniku sa porukom
    „Hranite se zdravo, uneli ste X kalorija“, a ako je u pitanju nezdrav obrok da
    prikaže poruku „Ne hranite se zdravo, uneli ste X kalorija“ */
public abstract class Obrok {

    private ArrayList<Sastojci> sastojci;

     public Obrok() {
     }

     public Obrok(ArrayList<Sastojci> sastojci) {
         this.sastojci = sastojci;
     }

     public ArrayList<Sastojci> getSastojci() {
         return sastojci;
     }

     public void setSastojci(ArrayList<Sastojci> sastojci) {
         this.sastojci = sastojci;
     }

     @Override
     public String toString() {
         return sastojci.toString();
     }

     public abstract void racunajKalorije();
 }
