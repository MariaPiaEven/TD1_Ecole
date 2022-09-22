package com.mpeven.td2;

import java.util.ArrayList;

public class Etudiant extends Personne {

    protected ArrayList<Evaluation> listeEvaluations = new ArrayList<>();

    public Etudiant(String nom) {
        super(nom);
    }

    public ArrayList<Evaluation> getListeEvaluations() {
        return listeEvaluations;
    }

    public void setListeEvaluations(ArrayList<Evaluation> listeEvaluations) {
        this.listeEvaluations = listeEvaluations;
    }
}
