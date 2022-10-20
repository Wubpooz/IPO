import java.util.Scanner;

public class Couronne {

    public static void Dans_Couronne(int re, int ri, int x,int y){
        double r = Math.sqrt(x*x + y*y);
        if (r <=re && r >=ri)
            System.out.println("Ce point est dans la couronne.");
        else
            System.out.println("Ce point n'est pas dans la couronne.");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rayon extérieur : ");
        int re = sc.nextInt();
        System.out.print("Rayon intérieur : ");
        int ri = sc.nextInt();
        System.out.print("Donnez un point x :");
        int x = sc.nextInt();
        System.out.print("y : ");
        int y = sc.nextInt();

        Dans_Couronne(re,ri,x,y);

        sc.close();
    }
}
