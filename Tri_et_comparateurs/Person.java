public class Person {
    private String nom;
    private int age;

    public Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return nom + " (" + age + " ans)";
    }
}