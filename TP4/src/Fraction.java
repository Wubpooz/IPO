public class Fraction {
    private int num;
    private int denom;

    public Fraction(int n,int d){
        if(d==0){System.out.println("\u001B[31m"+"Divide by zero not allowed !"+"\u001B[0m");}//throw new ArithmeticException();}
        else {
            this.num = n;
            this.denom = Math.abs(d);
        }
    }

    public int getNum(){return num;}
    public int getDenom(){return denom;}

    private int pgcd(int a, int b){
        if (b==0){return a;}
        else{ return pgcd(a, a%b);}
    }

    private void simplify(){
        int p = pgcd(num,denom);
        num/=p;
        denom/=p;
    }

    public String toString(){return num+"/"+denom;}

    public Fraction add(Fraction f) {
        Fraction F = new Fraction(num * f.getDenom() + f.getNum() * denom, denom * f.getDenom());
        F.simplify();
        return F;
    }

    public Fraction mul(Fraction f){
        Fraction F = new Fraction(num*f.getNum(),denom*f.getDenom());
        F.simplify();
        return F;
    }

    public boolean egale(Fraction f){
        f.simplify();
        simplify();
        if(num==f.getNum() && denom==f.getDenom()){return true;}
        return false;
    }

    public int compareTo(Fraction f){
        if(egale(f)){return 0;}
        if(num * f.getDenom() > f.getNum() * denom){return 1;}
        else{return -1;}
    }

    public static void main(String[] args){
        Fraction zero = new Fraction(1,0);
        //PAS LE TEMPS DE TESTER NSM
    }
}
