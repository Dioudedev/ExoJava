public class Texte implements Racontable {
    private String contenu;

    public Texte(String contenu) {
        this.contenu = contenu;
    }

    public void print() {
        System.out.print(contenu);
    }
}