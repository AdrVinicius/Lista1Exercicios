import java.util.Scanner;

public class exercicio12 {
    
    public static void main (String[] args) {
        double altura;
        double pesoideal;
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite a altura: ");
        altura = teclado.nextDouble();
        teclado.close();
        
        pesoideal = (72.7 * altura) - 58;
        
        System.out.println(" o seu peso ideal é " + pesoideal);
    }
}
