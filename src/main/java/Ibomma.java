import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibomma {

	public static void main(String[] args) throws Exception {
		WebDriver tagore = new ChromeDriver();
		tagore.manage().window().maximize();
		tagore.manage().deleteAllCookies();
		tagore.get("https://instagram.com");
		Thread.sleep(3000);
		tagore.close();
	}

}
