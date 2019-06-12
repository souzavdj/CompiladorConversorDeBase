package model;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		int entrada = input.nextInt();
		input.close();
		String respostaBinario = Conversor.ConverteParaBinario(entrada);
		String respostaOctal = Conversor.ConverteParaOctal(entrada);
		String respostaHexa = Conversor.ConverteParaHexa(entrada);
		System.out.println("Numero convertido em Binário: "+respostaBinario);
		System.out.println("Numero convertido em Octal: "+respostaOctal);
		System.out.println("Numero convertido em Hexa: "+respostaHexa);
	}

}