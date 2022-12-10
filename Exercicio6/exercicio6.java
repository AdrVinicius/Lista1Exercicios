import java.util.Scanner;

public class exercicio6 {
    public static void main(String [] args) {

        Scanner leitor = new Scanner(System.in);
        double area, raio;

        System.out.println("Insira o valor do raio");
        raio = leitor.nextDouble();
        area = 2 * Math.PI * raio;

        leitor.close();

        System.out.println(" O valor da area e  " + area);
        
        
    }
}
