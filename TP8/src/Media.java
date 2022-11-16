public class Media {
    protected String title;
    protected String author;
    protected int[] notes;

    Media(String nom, String author){
        this.title = nom;
        this.author = author;
    }

    public void vote(int note){notes[notes.length] = note;}

    public float moyenneNotes(){
        if(notes.length==0){return 0.F;}
        float s=0;
        for(int i : notes){
            s+=i;
        }
        return s/notes.length;
    }

    public String toString(){return "\""+title+"\" by "+author;}
}
