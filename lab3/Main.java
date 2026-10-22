class Fisier {
    private static int contor = 0;

    private int id;
    private String nume;
    private String continut;
    private Fisier versiuneAnterioara;
    private int numarConcatenari;

    public Fisier(String nume, String continut) {
        this.id = ++contor;
        this.nume = nume;
        this.continut = continut;
        this.versiuneAnterioara = null;
        this.numarConcatenari = 0;
    }

    public void salveazaVersiune() {
        Fisier copie = new Fisier(this.nume + "bak", this.continut);
        copie.versiuneAnterioara = this.versiuneAnterioara;
        this.versiuneAnterioara = copie;
    }

    public void concateneaza(Fisier altFisier) {
        salveazaVersiune();
        this.continut = this.continut + altFisier.continut;
        this.numarConcatenari++;
    }

    @Override
    public String toString() {
        String rez = this.id + " " + this.nume + " [" + this.continut + "]";
        if (this.versiuneAnterioara != null) {
            rez += " " + this.versiuneAnterioara.toString();
        }
        return rez;
    }

    public int numarConcatenari() {
        return this.numarConcatenari;
    }
}

public class Main {
    public static void main(String[] args) {
        Fisier f1 = new Fisier("fisier1", "Salut");
        Fisier f2 = new Fisier("fisier2", " Lume!");
        Fisier f3 = new Fisier("fisier3", " Ce faci?");

        System.out.println("--- Stare initiala ---");
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);

        System.out.println("\nDupa prima concatenare (f1.concateneaza(f2)) ");
        f1.concateneaza(f2);
        System.out.println("f1: " + f1);
        System.out.println("Numar concatenari f1: " + f1.numarConcatenari());

        System.out.println("\n Dupa a doua concatenare (f1.concateneaza(f3)) ");
        f1.concateneaza(f3);
        System.out.println("f1: " + f1);
        System.out.println("Numar concatenari f1: " + f1.numarConcatenari());

        System.out.println("\n Salvare manuala a unei versiuni pentru f2 ");
        f2.salveazaVersiune();
        System.out.println("f2: " + f2);
    }
}