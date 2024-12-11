package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DivisaoInvalidaException;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double primeiroNumero;
		Double segundoNumero;
		String operacao;
		String simOuNao;
	
		do {
			try {
				
				System.out.print("Digite um número: ");
				primeiroNumero = sc.nextDouble();

				operacao = validacaoDaOperacao(sc);

				System.out.print("Digite outro número: ");
				segundoNumero = sc.nextDouble();

				Calculos calculos = new Calculos(primeiroNumero, segundoNumero, operacao);
				System.out.println("Total = " + calculos.getResposta());
				System.out.println();

			} catch (InputMismatchException e) {
				System.out.println("Você digitou um valor inválido. Tente novamente.");
				sc.nextLine();
			}catch (DivisaoInvalidaException e) {
				System.out.println(e.getMessage());
			}

			System.out.print("Deseja fazer outro calculo (s/n)? ");
			simOuNao = sc.next();
			System.out.println();

		} while (simOuNao.equalsIgnoreCase("s")); 

		System.out.println();
		System.out.println("Programa finalizado. Obrigado por usar a calculadora!");

		sc.close();

	}

	public static String validacaoDaOperacao(Scanner sc) {
		
		String operacao;

		System.out.print("Qual operação você gostaria de realizar(+ - * /)? ");
		operacao = sc.next();

		do {
			if (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
				System.out.println();
				System.out.print("Essa operação não é válida. Digite (+ - * /): ");
				operacao = sc.next();
				System.out.println();
			} else {
				return operacao;
			}
		} while (true);

	}

}
