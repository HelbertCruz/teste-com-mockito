package br.ucsal.cst20172.testequalidade.lista2;

public class Questao2 {

	private static final int QTD_NUM = 5;

	public QuestoesHelper questoesHelper;

	public Questao2(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}

	public void obterNumerosExibirInformadoEInvertido() {
		int[] vet = new int[QTD_NUM];
		int[] vetInvertida = new int[QTD_NUM];
		questoesHelper.obterNumeros(vet);
		questoesHelper.inverterOrdemNumeros(vet, vetInvertida);
		questoesHelper.exibirVetores(vet, vetInvertida);
	}
	}
