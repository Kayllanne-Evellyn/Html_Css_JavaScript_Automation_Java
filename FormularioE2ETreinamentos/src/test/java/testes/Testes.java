package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import executa.Executa;
import page.PrimeiraPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testes {

	PrimeiraPage page = new PrimeiraPage();

	@Before
	public void antesDoTester() {

		Executa.abrirNavegador();
	}

	@After
	public void depoisDoTeste() {

		Executa.fecharNavegador();
	}

	@Test
	public void testeRealizarCadastro() {

		String msg = "Cadastro realizado com sucesso!!!\n" + "Nome: Larissa Ribeiro\n" + "E-mail: larissa@teste.com\n"
				+ "Data de nascimento: 1899-08-22\n" + "CPF: 230.524.470-33\n" + "RG: 12.345.678-33\n"
				+ "Telefone: (11)91100-1100\n" + "Gênero: Feminino\n" + "Senha:5731916017";

		page.cadastrarUsuario("Larissa Ribeiro", "larissa@teste.com", "22/08/1899", "230.524.470-33", "12.345.678-33",
				"(11)91100-1100", "feminino", "5731916017", msg);
	}

	@Test
	public void testeDadosEmBranco() {

		page.dadosEmBranco();
	}

	@Test
	public void testeSenhaIncompleta() {

		page.senhaIncompleta("Murilo Alves", "murilotestes@gmail.com", "22/07/1899", "230.524.470-33", "33.656.104-0",
				"(11)91100-1100", "masculino", "3434");
	}

	@Test
	public void testeEmailInvalido() {

		page.emailInvalido("Italo Albuquerque", "albuquerqueteste.com", "22/08/1899", "810.382.210-80", "33.656.104-0",
				"(11)96600-0066", "Masculino", "12345678");
	}

}
