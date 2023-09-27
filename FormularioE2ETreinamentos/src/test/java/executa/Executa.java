package executa;

import org.openqa.selenium.chrome.ChromeDriver;
import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers {

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jhona/meusite/formulario.html");

	}
	
	public static void fecharNavegador() {		
		driver.quit();
	}

}
