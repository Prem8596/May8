package org.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\VIGNAN\\eclipse-workspace\\Selenium\\drivers\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		 		
        driver.get("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.id("username")).sendKeys("prem1996");
		
		driver.findElement(By.id("password")).sendKeys("prem@1996");
				
		driver.findElement(By.id("login")).click();
		
		String tit = driver.getTitle();
		System.out.println(tit);
		
		Thread.sleep(10000);
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.click();
		Select s= new Select(location);
		s.selectByValue("Paris");
		Thread.sleep(3000);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Hervey");
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select s2 =new Select(type);
		s2.selectByValue("Super Deluxe");
		
		
		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
 		Select s3=new Select(no);
        s3.selectByValue("1");
        
        WebElement head = driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select s4 =new Select(head);
        s4.selectByValue("1");
        
        WebElement submit = driver.findElement(By.id("Submit"));
        submit.click();
        Thread.sleep(5000);
        
        WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
        radio.click();
        
        driver.findElement(By.id("continue")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("first_name")).sendKeys("Prem");
        
        driver.findElement(By.id("last_name")).sendKeys("R");
        
        driver.findElement(By.id("address")).sendKeys("70a North Car Street");
       
        driver.findElement(By.id("cc_num")).sendKeys("6080239952057564");
        
        WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
        Select s5= new Select(card);
        s5.selectByValue("MAST");
        
        WebElement month = driver.findElement(By.id("cc_exp_month"));
        Select s6 = new Select(month);
        s6.selectByValue("3");
        
        WebElement year = driver.findElement(By.id("cc_exp_year"));
        Select s7=new Select(year);
        s7.selectByValue("2022");
       
        
        driver.findElement(By.id("cc_cvv")).sendKeys("785");
        
        driver.findElement(By.id("book_now")).click();
        
        Thread.sleep(20000);
        
        WebElement order = driver.findElement(By.xpath("//input[@name='order_no']"));
        
        String id = order.getAttribute("value");    
        System.out.println("Order id is:" +id);
        
        
		
		
		
	}
	
	
	
	
	
}
