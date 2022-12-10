import java.util.Scanner;

public class exercicio8 {
    public static void main(String [] args) {

        Scanner leitor = new Scanner(System.in);
        // salario por hora 10,25;
        //horas trabalhadas;

        double salario;
        double horastrabalhado;

        System.out.println("Qual e seu salario por hora");
        salario = leitor.nextDouble();

        System.out.println("Quantas horas no mes voce trabalhou? ");
        horastrabalhado = leitor.nextDouble();

        System.out.printf(" O seu salario e %.2f ", + salario * horastrabalhado );





        leitor.close();


        
    }
}
