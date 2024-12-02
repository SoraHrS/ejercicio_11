import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1, numero2, numero3, mayor;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduzca el primer numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        numero2 = sc.nextDouble();
        System.out.println("Introduzca el tercer numero: ");
        numero3 = sc.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
        }else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;
        }else{
            mayor = numero3;
        }
        System.out.println("El mayor numero entre: " + numero1 + " , " + numero2 + " y " + numero3 + " es " + mayor);
    }
}