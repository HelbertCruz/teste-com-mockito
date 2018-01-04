package br.ucsal.cst20172.testequalidade.lista2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.Savepoint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Questao3IntegradoTest {

	private static final String QUEBRA_LINHA = System.getProperty("line.separator");

	public Questao3 questao3;

	@Before
	public void setup() {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		questao3 = new Questao3(questoesHelper);
	}

	@Test
	public void obterNumeroExibirSePrimo() {

		String numInformado = "5";
		String saidaEsperada = "Informe um número maior ou igual à zero:" + QUEBRA_LINHA + "O número " + numInformado + " é primo."+ QUEBRA_LINHA;
	
		InputStream inFake = new ByteArrayInputStream(numInformado.getBytes());
		System.setIn(inFake);

		OutputStream outFake = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outFake));

		questao3.obterNumeroExibirSePrimo();
		String saidaAtual = outFake.toString();

		Assert.assertEquals(saidaEsperada, saidaAtual);
	}
}
