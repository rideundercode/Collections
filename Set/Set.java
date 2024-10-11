import java.util.HashSet;

public class SetKata {
    public static void main(String[] args) {
        // Creation d'un ensemble d'entier.
        HashSet<Integer> nombres = new HashSet<>();

        // Ajouter des nombres dans le set
        nombres.add(5);
        nombres.add(10);
        nombres.add(15);
        nombres.add(10);  // Essayons d'ajouter un doublon qui ne s'affichera pas.

        System.out.println("Ensemble de nombres : " + nombres);

        System.out.println("Le nombre recherche est : 10");
        if (nombres.contains(10)) {
            System.out.println("Le nombre 10 est dans l'ensemble.");
        } else {
            System.out.println("Le nombre 10 n'est pas dans l'ensemble.");
        }

        // Suppression d'un element
        nombres.remove(5);
        System.out.println("Ensemble apres suppression du nombre 5 : " + nombres);

    }
}
