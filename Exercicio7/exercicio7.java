import java.util.Scanner;

public class exercicio7 {
    public static void main(String [] args) {
        
        Scanner leitor = new Scanner(System.in);
        double lado, dobro;
        
        System.out.println("Digite o valor do lado do quadrado");
        lado = leitor.nextDouble();
        dobro = lado * lado;

       
        
        leitor.close();

        System.out.println("O valor do dobro da area e " + dobro * 2);


}
}
