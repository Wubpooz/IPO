public class Tab {
    private int start;
    private int end;
    private String[] t;


    public Tab(int deb,int fin){
        this.start = deb;
        this.end = fin;
        this.t = new String[Math.abs(deb)+Math.abs(fin)];
    }

    public int length(){
        return Math.abs(start)+Math.abs(end);
    }

    public String get(int i){
        try{return t[i-start];}
        catch(IndexOutOfBoundsException e){return e.getLocalizedMessage();}
    }

    public void set(int i,String s){
        try{t[i-start]=s;}
        catch(IndexOutOfBoundsException e){System.out.println(e.getLocalizedMessage());}
    }


    public static void main(String[] args) {
        Tab A = new Tab(-2,2);
        A.set(1,"3");
        A.set(-2,"0");
        A.set(-1,"1");
        System.out.println("taille : "+A.length() +"\nA[-2] : "+ A.get(-2)+"\nA[-1]: "+A.get(-1)+"\nA[2] : "+A.get(1)+"\nA[2] (erreur oob) : "+A.get(2));
    }
}