import java.util.ArrayList;

public class Histoire implements Racontable {

    private Texte debut;
    private Texte fin;
    private ArrayList<Racontable> parties;

    public Histoire(String debut, String fin) {
        this.debut = new Texte(debut);
        this.fin = new Texte(fin);
        this.parties = new ArrayList<>();
    }

    public void ajouterPartie(Racontable p) {
        this.parties.add(p);
    }

    public void print() {
        debut.print();
        System.out.println();

        for (Racontable p : parties) {
            p.print();
            System.out.println();
        }

        fin.print();
        System.out.println();
    }
}