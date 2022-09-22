import java.util.ArrayList;

public class Ecole {

    protected String adresse;

    protected ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    public Ecole(String adresse) {
        this.adresse = adresse;
    }

    public float moyenne() {

        float cumul = 0;

        for (Etudiant etudiant : listeEtudiants) {
            cumul += etudiant.getNoteGlobale();
        }

        return cumul / listeEtudiants.size();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }
}
