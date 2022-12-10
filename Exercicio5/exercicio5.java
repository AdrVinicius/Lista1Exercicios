import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        double metros;
        double centimetros;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos metros para converter em centimetro");
        metros = teclado.nextDouble();
        teclado.close();

        centimetros = metros * 100;

        System.out.println("A quantidade em centimetros é");
        System.out.println(centimetros);        
    }
}
