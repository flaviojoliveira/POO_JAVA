import java.util.Scanner;

public class pratica01 {
    
	private static void println(String conteudo) {
		System.out.println(conteudo);
	}
	
	private static void print(String conteudo) {
		System.out.print(conteudo);
	}

	public static void main(String[] args) {
		println("Menu de opções: ");
		println("1 - Média Aritmética");
		println("2 - Média Ponderada");
		println("3 - Sair");
		
		print("Digite a opção desejada: ");
		
		Scanner sc = new Scanner(System.in);
		
		int op = sc.nextInt();
		
		switch(op) {
			case 1:
				calcularMediaAritmetica(sc);
				break;
				
			case 2:
				calcularMediaPonderada(sc);
				break;
				
			case 3:
				println("Até logo!");
				break;
				
			default:
				println("Opção invalida!");
				break;			
		}
	}

	private static void calcularMediaPonderada(Scanner sc) {
		int n1, n2, n3;
		int p1, p2, p3;
		
		print("Número 1: ");
		n1 = sc.nextInt();
		
		print("Número 2: ");
		n2 = sc.nextInt();
		
		print("Número 3: ");
		n3 = sc.nextInt();
		
		print("Peso 1: ");
		p1 = sc.nextInt();
		
		print("Peso 2: ");
		p2 = sc.nextInt();
		
		print("Peso 3: ");
		p3 = sc.nextInt();
		
		println(
				String.format(
						"A media ponderada é: %d",
						((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3)
						));
		
		
	}

	private static void calcularMediaAritmetica(Scanner sc) {
		int n1, n2;
		
		print("Número 1: ");
		n1 = sc.nextInt();
		
		print("Número 2: ");
		n2 = sc.nextInt();
		
		println(
				String.format(
						"A media aritmetica é: %d", (n1 + n2)/2));
		
	}

}
