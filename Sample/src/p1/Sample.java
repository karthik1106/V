package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="F:\\QP_Latest\\testfiles\\largePic.jpg";
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sample/src/input.html");
		driver.findElement(By.id("prodcert_upload")).sendKeys(path);
		System.out.println("hello this is second sample git comment");
System.out.println(System.getProperty("os.name"));
System.out.println("hello this is second sample");
System.out.println("hello this is second sample  ");
	}

}
