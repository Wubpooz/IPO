import java.util.Arrays;

public class Video extends Media{
    private String[] sub;
    private int dt;

    Video(String title, String author, String[] type, int duree){
        super(title,author);
        this.sub = sub;
        this.dt = duree;
    }

    @Override
    public String toString(){return "\""+title+"\" by "+author+", subs : "+ Arrays.toString(sub)+" de "+dt+"min";}
}