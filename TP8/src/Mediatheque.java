import java.util.ArrayList;

public class Mediatheque {
    private ArrayList<Media> docs;

    Mediatheque(){ }

    public void add(Media m){docs.add(m);}

    public ArrayList<Media>  searchByTitle(String titre){
        if(docs.size()==0){throw new RuntimeException("No media to search for");}
        ArrayList<Media> filtered = new ArrayList<>();
        for(Media m : docs){
            if(m.title.equals(titre)){filtered.add(m);}
        }
        return filtered;
    }

    public ArrayList<Media>  searchByAuthor(String author){
        if(docs.size()==0){throw new RuntimeException("No media to search for");}
        ArrayList<Media> filtered = new ArrayList<>();
        for(Media m : docs){
            if(m.author.equals(author)){filtered.add(m);}
        }
        return filtered;
    }

    private ArrayList<Media>  searchByMedia(Class mediaclass){
        if(docs.size()==0){throw new RuntimeException("No media to search for");}
        ArrayList<Media> filtered = new ArrayList<>();
        for(Media m : docs){
            if(mediaclass.isInstance(m)){filtered.add(m);}
        }
        return filtered;
    }

    public ArrayList<Media> filter(String critere, String valeur){
            if(critere.equals("titre")){return searchByTitle(valeur);}
            if(critere.equals("author")){return searchByAuthor(valeur);}
            if(critere.equals("media")){return searchByMedia(valeur.getClass());}
            throw new RuntimeException("Invalid request");
    }
}
