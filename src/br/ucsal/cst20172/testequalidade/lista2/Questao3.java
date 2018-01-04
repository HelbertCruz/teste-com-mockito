package br.ucsal.cst20172.testequalidade.lista2;

public class Questao3 {

	public QuestoesHelper questoesHelper;

	public Questao3(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}

	public void  obterNumeroExibirSePrimo() {
		int n = 0;
		n = questoesHelper.obterNumero();
		boolean situacaoPrimo = questoesHelper.verificarNumeroPrimo(n);
		questoesHelper.exibirResulado(n, situacaoPrimo);
	}
}
