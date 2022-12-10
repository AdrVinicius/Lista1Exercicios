import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args)  {
        double numero1;
        double numero2;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero1 = teclado.nextDouble();
        System.out.println("Digite mais outro numero");
        numero2 = teclado.nextDouble();
        teclado.close();

        resultado = numero1 + numero2;
       

        System.out.println("A soma é ");
        System.out.println(resultado);

    }
}

