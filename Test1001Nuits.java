public class Test1001Nuits {

    public static void main(String[] args) {

        Histoire sousHistoire = new Histoire("ce jour-là", "à jamais");
        sousHistoire.ajouterPartie(new Texte("..."));

        Histoire h = new Histoire("Il était une fois", "fin");
        h.ajouterPartie(new Texte("..."));
        h.ajouterPartie(sousHistoire);

        h.print();
    }
}