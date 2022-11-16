public class Audio extends Media{
    private String type;
    private int dt;

    Audio(String title, String author, String type, int duree){
        super(title,author);
        this.type = type;
        this.dt = duree;
    }

    Audio(String title,String author, int duree){ this(title,author,"album",duree); }

    @Override
    public String toString(){return "\""+title+"\" by "+author+", "+type+" de "+dt+"min";}
}
