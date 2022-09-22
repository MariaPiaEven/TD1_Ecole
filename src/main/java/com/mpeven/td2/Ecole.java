package com.mpeven.td2;

import java.util.ArrayList;

public class Ecole {

    protected String adresse;

    public Ecole(String adresse) {
        this.adresse = adresse;
    }
    protected ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public float moyenne() {

        float cumul = 0;
        float count = 0;

        for (Etudiant etudiant : listeEtudiants) {

            for (Evaluation evaluation : etudiant.getListeEvaluations()) {
               cumul += evaluation.getNote();
               //count ++;
            }

            count += etudiant.getListeEvaluations().size();
        }

        return cumul / count;
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


}
