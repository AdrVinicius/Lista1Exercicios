import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {


        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota");
        nota3 = teclado.nextDouble();
        System.out.println("Digite a quarta nota");
        nota4 = teclado.nextDouble();
        teclado.close();

        resultado = (nota1 + nota2 + nota3 + nota4)/4;
       

        System.out.println("A media das notas e ");
        System.out.println(resultado);
        
    }    
}
