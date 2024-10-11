public class ArrayList{
    public static void main(String[] args){

        // Création d'une liste de noms
        ArrayList<String> noms = new ArrayList<>();

        noms.add("Alice");
        noms.add("Bob");
        noms.add("Charlie");
        noms.add("Diane");
        noms.add("Eve");

        // Afficher la liste
        System.out.println("Liste des noms :");
        for (String nom : noms){
            System.out.println(nom);
        }

        // Trier la liste par ordre alphabétique
        Collections.sort(noms);
        System.out.println("Liste des noms :");
        for (String nom : noms){
            System.out.println(nom);
        }

        // Trier la liste par ordre alphabétique
        System.out.println("Nom recherchée est : Charlie");
        String nomRecherche = "Charlie";
        if (noms.contains(nomRecherche)) {
            System.out.println(nomRecherche + " est dans la liste.");
        } else {
            System.out.println(nomRecherche + " n'est pas dans la liste.");
        }

        noms.remove("Bob");
        System.out.println("Liste après suppression de Bob : ");
        for (String nom : noms) {
            System.out.println(nom);
        }


    }
}