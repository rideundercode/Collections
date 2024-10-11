import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // Étape 1 : Créer une HashMap pour stocker des étudiants et leurs notes
        HashMap<String, Integer> etudiants = new HashMap<>();

        // Étape 2 : Ajouter des paires clé-valeur (nom, note)
        etudiants.put("Alice", 85);
        etudiants.put("Bob", 92);
        etudiants.put("Charlie", 78);
        etudiants.put("Diane", 90);

        // Étape 3 : Afficher toutes les paires clé-valeur
        System.out.println("Liste des étudiants et leurs notes :");
        for (String nom : etudiants.keySet()) {
            System.out.println(nom + " : " + etudiants.get(nom));
        }

        // Étape 4 : Modifier la note d'un étudiant
        etudiants.put("Alice", 95);  // Mettre à jour la note de Alice
        System.out.println("Note de Alice mise à jour : " + etudiants.get("Alice"));

        // Étape 5 : Supprimer un étudiant de la Map
        etudiants.remove("Charlie");  // Supprimer Charlie de la map
        System.out.println("Liste des étudiants après suppression de Charlie :");
        for (String nom : etudiants.keySet()) {
            System.out.println(nom + " : " + etudiants.get(nom));
        }

        // Étape 6 : Vérifier si un étudiant particulier est dans la Map
        if (etudiants.containsKey("Bob")) {
            System.out.println("Bob est dans la liste des étudiants.");
        } else {
            System.out.println("Bob n'est pas dans la liste des étudiants.");
        }
    }
}