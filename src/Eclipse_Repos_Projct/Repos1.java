package Eclipse_Repos_Projct;



public class Repos1 {
	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String Value="./Drivers/geckodriver.exe";
		System.setProperty(key,Value);
		WebDriver driver = new ChromeDriver();
	}
}


