import java.util.Scanner;

public class Hjms{

    public static void conv(int sec){
        int j = sec/(24*3600);
        sec -= j*24*3600;
        int h = sec/3600;
        sec -= h*3600;
        int m = sec/60;
        sec -= m*60;

        System.out.println("Cela donne "+j+ " jours "+ h +" heures "+ m + " minutes "+ sec + " secondes.");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez une durée en secondes : ");

        conv(sc.nextInt());

        sc.close();
    }


}