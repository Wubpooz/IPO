import java.util.Scanner;

public class Degree {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Donnez une température en Fahrenheit : ");
		float f = sc.nextFloat();
		System.out.println("Cela donne "+ Math.round(100*(f-32)*5/9)/100 + "°C" );
		sc.close();
    }
}