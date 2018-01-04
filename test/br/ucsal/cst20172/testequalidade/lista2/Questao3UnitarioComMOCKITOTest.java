package br.ucsal.cst20172.testequalidade.lista2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Questao3UnitarioComMOCKITOTest {

	private Questao3 questao3;
	private QuestoesHelper questoesHelperMock;

	@Before
	public void setup() {
		questoesHelperMock = Mockito.mock(QuestoesHelper.class);
		questao3 = new Questao3(questoesHelperMock);
	}

	@Test
	public void obterNumeroExibirSePrimo() {
		
		int num = 3;

		Mockito.doReturn(num).when(questoesHelperMock).verificarNumeroPrimo(Mockito.any());

		questao3.obterNumeroExibirSePrimo();

		Mockito.verify(questoesHelperMock).obterNumero();
		Mockito.verify(questoesHelperMock).verificarNumeroPrimo(Mockito.any());
		Mockito.verify(questoesHelperMock).exibirResulado(Mockito.any(), Mockito.any());
	}
}
