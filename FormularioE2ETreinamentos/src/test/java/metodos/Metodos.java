package metodos;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void validarTexto(By elemento, String textoEsperado) {

		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println(textoCapturado);

		assertEquals(textoEsperado, textoCapturado);

	}

	public void validarAlert(String textoEsperado) {

		String msgAlert = driver.switchTo().alert().getText();
		assertEquals(msgAlert, textoEsperado);
	}
	

}
