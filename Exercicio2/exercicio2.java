import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args)  {
        double numero1;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero1 = teclado.nextDouble();
        teclado.close();

        resultado = numero1;

        System.out.println("O numero informado foi ");
        System.out.println(resultado);

    }
}
