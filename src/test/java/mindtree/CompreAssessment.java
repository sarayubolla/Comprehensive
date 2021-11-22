package mindtree;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;

	public class CompreAssessment {

		
			public static void main(String[] args) throws InterruptedException {
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//ChromeOptions options=new ChromeOptions();
				//options.addArguments("--disable-notifications");
				//WebDriver driver=new ChromeDriver(options);
				//driver.manage().window().maximize();
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.30.0-win64 (2)\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				FirefoxOptions opt = new FirefoxOptions();
				opt.addPreference("dom.webnotifications.enabled", false);
				WebDriver driver = new FirefoxDriver(opt);
				driver.get("https://www.eazydiner.com/");
				//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@id=\"city-name\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"search_city_content\"]/div[1]/ul/li[12]/div/a/div[2]/div[2]")).click();
				driver.findElement(By.id("help")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				driver.findElement(By.xpath("/html/body/section[4]/div/div/div[1]/div[4]/a/div[1]/img")).click();
				driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[2]/div/div/div/div/form/div/div/button")).click();
				driver.findElement(By.id("guest_name")).sendKeys("Sarayu");
				driver.findElement(By.xpath("//*[@id=\"guest-form\"]/div/div[2]/div/div/input")).sendKeys("9876543210");
				driver.findElement(By.xpath("//*[@id=\"guest_email\"]")).sendKeys("sarayu@gmail.com");
				driver.findElement(By.id("checkout-button")).click();
				
			}
		}




