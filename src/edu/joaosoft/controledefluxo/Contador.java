package edu.joaosoft.controledefluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro parametro: ");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parametro: ");
		int parametroDois = sc.nextInt();
		sc.close();
		try {

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o numero " + i);
			}
		} else
			throw new ParametrosInvalidosException();
	}
}