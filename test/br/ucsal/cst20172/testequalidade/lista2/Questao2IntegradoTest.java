package br.ucsal.cst20172.testequalidade.lista2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Questao2IntegradoTest {

	private static final String QUEBRA_LINHA = System.getProperty("line.separator");

	public Questao2 questao2;

	@Before
	public void setup() {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		questao2 = new Questao2(questoesHelper);
	}

	@Test
	public void obterNumerosExibirInformadoEInvertidoTest() {

		String numerosInformados = " 7\n9\n12\n5\n2";
		String saidaEsperada = "Digite os números:" + QUEBRA_LINHA + "Ordem normal:" + QUEBRA_LINHA + "7 "
				+ QUEBRA_LINHA + "9 " + QUEBRA_LINHA + "12 " + QUEBRA_LINHA + "5 " + QUEBRA_LINHA + "2 " + QUEBRA_LINHA
				+ "Ordem invertida:" + QUEBRA_LINHA + "2 " + QUEBRA_LINHA + "5 " + QUEBRA_LINHA + "12 " + QUEBRA_LINHA
				+ "9 " + QUEBRA_LINHA + "7 " + QUEBRA_LINHA;

		InputStream inFake = new ByteArrayInputStream(numerosInformados.getBytes());
		System.setIn(inFake);

		OutputStream outFake = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outFake));

		questao2.obterNumerosExibirInformadoEInvertido();
		String saidaAtual = outFake.toString();

		Assert.assertEquals(saidaEsperada, saidaAtual);
	}
}
