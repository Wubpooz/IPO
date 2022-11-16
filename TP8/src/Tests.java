public class Tests {
    public static void main (String[] args){
        Media l = new Livre ("Les furtifs" , "Alain Damasio" , 704);
        Media a1 = new Audio (" Petit frère " , " IAM " , " single " , 4);
        Media a2 = new Audio (" Origin of Symmetry " , " Muse " , 51);
        Media v = new Video (" The Train Job " , " Joss Whedon " , new String []{ " en " , " de " , " fr "}, 45);

        System.out.println(l.toString()+"\n"+a1.toString()+"\n"+a2.toString()+"\n"+v.toString()+"\n");
    }
}
