import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        double tamanhoArquivo;
        double velocidadeLink;
        double tempoEmSegundos;
        double tempoEmMinutos;

        Scanner teclado = new Scanner(System.in);
        tamanhoArquivo = teclado.nextDouble();
        velocidadeLink = teclado.nextDouble();
        teclado.close();

        
        tamanhoArquivo = tamanhoArquivo * 8;
       
        tempoEmSegundos = tamanhoArquivo / velocidadeLink;
       
        tempoEmMinutos = tempoEmSegundos / 60;

        
        System.out.format("o tempo em minutos é %.2f", + tempoEmMinutos);
    }
}
