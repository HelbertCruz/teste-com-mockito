package br.ucsal.cst20172.testequalidade.lista2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Questao2UnitarioComMOCKITOTest {

	private Questao2 questao2;
	private QuestoesHelper questoesHelperMock;

	@Before
	public void setup() {
		questoesHelperMock = Mockito.mock(QuestoesHelper.class);
		questao2 = new Questao2(questoesHelperMock);
	}

	@Test
	public void obterNumerosExibirInformadoEInvertido() {

		int[] vet = { 5, 2, 12, 7, 9 };

		Mockito.doReturn(vet).when(questoesHelperMock).inverterOrdemNumeros(Mockito.any(), Mockito.any());

		questao2.obterNumerosExibirInformadoEInvertido();

		Mockito.verify(questoesHelperMock).obterNumeros(Mockito.any());
		Mockito.verify(questoesHelperMock).inverterOrdemNumeros(Mockito.any(), Mockito.any());
		Mockito.verify(questoesHelperMock).exibirVetores(Mockito.any(), Mockito.any());
	}
}
