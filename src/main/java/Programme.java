public class Programme {

    public static void main(String[] args) {

        Ecole ecole = new Ecole("4 rue de Mouzon");

        ecole.getListeEtudiants().add(new Etudiant("toto", 12));
        ecole.getListeEtudiants().add(new Etudiant("titi", 17));
        ecole.getListeEtudiants().add(new Etudiant("tata", 5));

        System.out.println(ecole.moyenne());


    }

}
