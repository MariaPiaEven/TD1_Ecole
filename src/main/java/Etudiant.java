public class Etudiant extends Personne {

    protected int noteGlobale;

    public Etudiant(String nom, int noteGlobale) {
        super(nom);
        this.noteGlobale = noteGlobale;
    }


    public int getNoteGlobale() {
        return noteGlobale;
    }

    public void setNoteGlobale(int noteGlobale) {
        this.noteGlobale = noteGlobale;
    }
}
