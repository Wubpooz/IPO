public class TabSet implements Set {
    private int size;
    private int[] tab;

    public TabSet(int len, int[] nbs){
        this.size = 0;
        this.tab = new int[len];
        boolean dedans = false;

        for (int i=0;i<len;i++){ // len ?
            for (int j=0;j<size;j++){
                if (nbs[i] == this.tab[j]){
                    dedans = true;
                }
            }
            if (!dedans){
                this.tab[this.size] = nbs[i];
                this.size++;
            }
            dedans = false;
        }
    }

    public boolean contains(int x) {
        for (int i = 0; i < this.size; i++) {
            if (this.tab[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int cardinal(){ return this.size;}

    public String toString(){
        String str ="";
        for(int i=0;i<this.size;i++){
            str = str + " ; " + Integer.toString(this.tab[i]);
        }
        return str;
    }

    public void add(int x) {
        if(!contains(x)) {
            this.size++;
            this.tab[size] = x;
        }
    }

    public void remove(int x){
        //boolean found = false;
        for(int i=0;i<this.size;i++){
            if(this.tab[i]==x){
                this.tab[i]=this.tab[this.size];
                this.size--;
                //found = true;
            }
        }
        //if (!found){System.out.println("Nothing removed, x isn't in this set.");}
    }

    public Set clone(){
        TabSet nouveau = new TabSet(this.size,this.tab);
        return nouveau;
    }


    public int get(int i){
        return this.tab[i];
    }

    public Set union(Set B){
        Set AB = clone();
        int len = B.cardinal();
        for(int i=0;i<len;i++){
            AB.add(B.get(i));
        }
        return AB;
    }

    public Set intersection(Set B) {
        Set AB = clone();
        int len = B.cardinal();
        for(int i=0;i<len;i++){
            AB.remove(B.get(i));
        }
        return AB;
    }



    public static void main(String[] args){
        int[] nbA;
        int[] nbB;
        nbA= new int[]{1,2,2,3,4,8};
        nbB = new int[]{2,3,7};
        TabSet A = new TabSet(10, nbA);
        TabSet B = new TabSet(10,nbB);
        System.out.println("7 appartient à A :" + A.contains(2));
        System.out.println("cardinal de A :"+ A.cardinal());
        System.out.println("string de B : "+ B.toString());
        System.out.println("intersection de A et B : "+(A.union(B)).toString());
    }


}

