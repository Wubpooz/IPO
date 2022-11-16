public class Serie extends Media{
    private Media[] ep;

    Serie(String title, String name,Media[] medias){
        super(title,name);
        this.ep = medias;
    }

    public void addMedia(Media media){ep[ep.length]=media;}
    public void addMedias(Media[] medias){for(Media m : medias){addMedia(m);}}

    public float moyenneAgregee() {
        if (notes.length == 0) {
            return 0.F;
        }
        float s = moyenneNotes();
        for (Media m : ep) {
            s += m.moyenneNotes();
        }
        return s/ep.length;
    }
}
