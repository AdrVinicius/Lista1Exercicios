import java.util.Scanner;

public class exercicio9 {
    public static void main ( String [] args) {

        Scanner teclado = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("Temperatura em grau Fahrenheit ");
        fahrenheit = teclado.nextDouble();

        celsius = 5 * (fahrenheit - 32) /9;


        System.out.println(" A temperatura em celsius e " + celsius);

        teclado.close();
        
    }
}
