import com.mpeven.td2.Ecole;
import com.mpeven.td2.Etudiant;
import com.mpeven.td2.Evaluation;

public class Programme {

    public static void main(String[] args) {

        Ecole ecole = new Ecole("4 rue de Mouzon");

        Etudiant toto = new Etudiant("toto");
        Etudiant titi = new Etudiant("titi");

        toto.getListeEvaluations().add(new Evaluation(4, "Java"));
        toto.getListeEvaluations().add(new Evaluation(14, "anglais"));
        titi.getListeEvaluations().add(new Evaluation(17, "PHP"));
        titi.getListeEvaluations().add(new Evaluation(17, "anglais"));

        ecole.getListeEtudiants().add(toto);
        ecole.getListeEtudiants().add(titi);


        System.out.println(ecole.moyenne());

    }

}
