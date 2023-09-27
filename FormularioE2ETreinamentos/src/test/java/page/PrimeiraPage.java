package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PrimeiraPage {

	By nome = By.id("nome");
	By email = By.id("e-mail");
	By data = By.id("dataNascimento");
	By cpf = By.id("cpf");
	By rg = By.id("rg");
	By telefone = By.id("telefone");
	By genero = By.id("gênero");
	By senha = By.id("senha");
	By cadastrar = By.name("cadastrar");

	Metodos metodos = new Metodos();

	public void cadastrarUsuario(String nome, String email, String data, String cpf, String rg, String telefone,
			String genero, String senha, String textoParaValidar) {

		metodos.escrever(this.nome, nome);
		metodos.escrever(this.email, email);
		metodos.escrever(this.data, data);
		metodos.escrever(this.cpf, cpf);
		metodos.escrever(this.rg, rg);
		metodos.escrever(this.telefone, telefone);
		metodos.escrever(this.genero, genero);
		metodos.escrever(this.senha, senha);
		metodos.clicar(this.cadastrar);
		metodos.validarAlert(textoParaValidar);
	}

	public void dadosEmBranco() {
		metodos.clicar(this.cadastrar);

	}

	public void senhaIncompleta(String nome, String email, String data, String cpf, String rg, String telefone,
			String genero, String senha) {
		metodos.escrever(this.nome, nome);
		metodos.escrever(this.email, email);
		metodos.escrever(this.data, data);
		metodos.escrever(this.cpf, cpf);
		metodos.escrever(this.rg, rg);
		metodos.escrever(this.telefone, telefone);
		metodos.escrever(this.genero, genero);
		metodos.escrever(this.senha, senha);
		metodos.clicar(this.cadastrar);
	}

	public void emailInvalido(String nome, String email, String data, String cpf, String rg, String telefone,
			String genero, String senha) {

		metodos.escrever(this.nome, nome);
		metodos.escrever(this.email, email);
		metodos.escrever(this.data, data);
		metodos.escrever(this.cpf, cpf);
		metodos.escrever(this.rg, rg);
		metodos.escrever(this.telefone, telefone);
		metodos.escrever(this.genero, genero);
		metodos.escrever(this.senha, senha);
		metodos.clicar(this.cadastrar);

	}

}