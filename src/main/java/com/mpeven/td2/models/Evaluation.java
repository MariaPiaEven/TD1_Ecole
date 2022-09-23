package com.mpeven.td2.models;

public class Evaluation {

    protected String matiere;
    protected float note;

    public Evaluation(String matiere, float note) {
        this.matiere = matiere;
        this.note = note;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
