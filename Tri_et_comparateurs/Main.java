import java.util.ArrayList;
import Person;

public class Main {
    public static void main(String[] args) {
        // Étape 2 : Créer une liste de Person
        ArrayList<Person> personnes = new ArrayList<>();

        personnes.add(new Person("Alice", 30));
        personnes.add(new Person("Bob", 25));
        personnes.add(new Person("Charlie", 35));
        personnes.add(new Person("Diane", 28));

        // Afficher la liste avant tri
        System.out.println("Liste originale : ");
        for (Person p : personnes) {
            System.out.println(p);
        }

        // Étape 3 : Trier par nom
        Collections.sort(personnes, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getNom().compareTo(p2.getNom());
            }
        });

        // Afficher la liste triée par nom
        System.out.println("\nListe triée par nom : ");
        for (Person p : personnes) {
            System.out.println(p);
        }

        // Étape 4 : Trier par âge
        Collections.sort(personnes, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        // Afficher la liste triée par âge
        System.out.println("\nListe triée par âge : ");
        for (Person p : personnes) {
            System.out.println(p);
        }
    }
}
