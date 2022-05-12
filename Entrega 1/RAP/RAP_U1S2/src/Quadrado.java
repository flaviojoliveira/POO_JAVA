// IMPORTA AS BIBLIOTECAS NECESSÁRIAS
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        // VARIAVEIS
        float base;
        float altura;
        float area;

        // OBJETO DO TIPO SCANNER
        Scanner input = new Scanner(System.in);

        // ENTRADA DOS DADOS
        System.out.print("Informe a base do quadrado: ");
            base = input.nextFloat();

        System.out.print("Informe a altura do quadrado: ");
            altura = input.nextFloat();
            area = base * altura;

        // SAÍDA DO DADO
        System.out.printf("A área do quadrado é %.1f ", area);

        // FECHA O SCANNER
        input.close();
    }
}
