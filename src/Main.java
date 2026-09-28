import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class Main {

    public static int factorial(int n) {
        //caso base
        if (n == 1) {
            return 1;
        }
        return n*factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tINGRESE UN NÚMERO ENTERO: ");
        int numero = sc.nextInt();
        System.out.println("\n⭐ El factorial de " + numero + " es igual a " + factorial(numero) + " ⭐");
    }
}
