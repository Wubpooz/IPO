public class Livre extends Media{
    private int nbpages;

    Livre(String title, String author, int nb){
        super(title,author);
        this.nbpages = nb;
    }

    @Override
    public String toString(){return "\""+title+"\" by "+author+", nb pages :"+nbpages;}
}
