package br.ucsal.cst20172.testequalidade.lista2;

import java.util.Scanner;

public class QuestoesHelper {

	// Questão 2
	public void obterNumeros(int[] vet) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Digite os números:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = tc.nextInt();
		}
	}

	public void inverterOrdemNumeros(int[] vet, int[] vetInvertida) {
		for (int i = 0; i < vet.length; i++) {
			vetInvertida[i] = vet[vet.length - i - 1];
		}

	}

	public void exibirVetores(int[] vet, int[] vetInvertida) {
		System.out.println("Ordem normal:");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i] + " ");
		}

		System.out.println("Ordem invertida:");
		for (int i = 0; i < vetInvertida.length; i++) {
			System.out.println(vetInvertida[i] + " ");
		}
	}

	// Questão 3

	public int obterNumero() {
		Scanner tc = new Scanner(System.in);
		System.out.println("Informe um número maior ou igual à zero:");
		int n = tc.nextInt();
		return n;
	}

	public boolean verificarNumeroPrimo(int n) {
		boolean situacaoPrimo = true;
		for (int i = 2; i <= n; i++) {
			if (((n % i) == 0) && (i != n)) {
				situacaoPrimo = false;
				break;
			}
		}
	return situacaoPrimo;
	}

	public void exibirResulado(int n, boolean situacaoPrimo) {
		if (situacaoPrimo) {
			System.out.println("O número " + n + " é primo.");
		} else {
			System.out.println("O número " + n + " não é primo.");
		}
	}
}