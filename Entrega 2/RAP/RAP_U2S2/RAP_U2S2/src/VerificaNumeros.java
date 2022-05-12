import java.util.Scanner;

public class VerificaNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = 0;
        int i = 0, maior = 0, menor = 10;
            for (i = 1;i <= 10;i++) {
                System.out.printf("\n Digite o %d valor: ",i);
                valor = input.nextInt();
            if(valor > maior) {
                maior = valor;
            }else if(valor < menor) {
                menor = valor;
            }
        }
        System.out.printf("Maior valor digitado = %d \n Menor valor digitado = %d",maior, menor);
        input.close();  
        }
    }