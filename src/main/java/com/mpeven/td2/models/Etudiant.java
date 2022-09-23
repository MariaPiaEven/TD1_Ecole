package com.mpeven.td2.models;

import java.util.ArrayList;

public class Etudiant extends Personne {

    protected ArrayList<Evaluation> listeEvaluations = new ArrayList<>();

    public Etudiant(String nom, int age) {
        super(nom, age);
//      constructor
    }

    public void ajoutNote(String matiere, float note) {
        listeEvaluations.add(new Evaluation(matiere, note));
    }

    public float moyenne() {

        float cumul = 0;

        for (Evaluation evaluation : listeEvaluations) {
            cumul += evaluation.getNote();
        }

        return cumul / listeEvaluations.size();
    }

    public ArrayList<Evaluation> getListeEvaluations() {
        return listeEvaluations;
    }

    public void setListeEvaluations(ArrayList<Evaluation> listeEvaluations) {
        this.listeEvaluations = listeEvaluations;
    }
}
