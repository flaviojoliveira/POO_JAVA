// IMPORTA AS BIBLIOTECAS NECESSÁRIAS
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        // VARIAVEIS
        float base;
        float altura;
        float area;

        // OBJETO DO TIPO SCANNER
        Scanner entrada = new Scanner(System.in);

        // ENTRADA DOS DADOS
        System.out.print("Informe a base do triangulo: ");
            base = entrada.nextFloat();

        System.out.print("Informe a altura do triangulo: ");
            altura = entrada.nextFloat();
            area = (base * altura) / 2;

        // SAÍDA DO DADO
        System.out.printf("A área do triangulo é %.1f ", area);

        // FECHA O SCANNER
        entrada.close();
    }
}
