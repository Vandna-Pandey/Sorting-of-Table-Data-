package SortTableData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SortTabDataMethod {
	WebDriver driver;
	Properties prop;
	public SortTabDataMethod(WebDriver driver1,Properties prop1) {
		driver=driver1;
		prop=prop1;
	}
	
	public void lastNameMethod() {
		List<WebElement> lastEle=driver.findElements(By.xpath(prop.getProperty("fNameValPath")));
		List<String> beforeSort=new ArrayList<String>();
		for (int i = 0; i < lastEle.size(); i++) {
			String s=lastEle.get(i).getText();
			beforeSort.add(s);
		}
		Collections.sort(beforeSort);
		System.out.println("Before Sorting "+beforeSort);
		
		WebElement ele=driver.findElement(By.xpath(prop.getProperty("fNamePath")));
		ele.click();
		
		lastEle=driver.findElements(By.xpath(prop.getProperty("fNameValPath")));
		List<String> afterSort=new ArrayList<String>();
		for (int i = 0; i < lastEle.size(); i++) {
			String s=lastEle.get(i).getText();
			afterSort.add(s);
		}
		System.out.println("After Sorting "+afterSort);
		Assert.assertTrue(beforeSort.equals(afterSort));
		System.out.println("Last name Values are same");
		
	}

	public void firstNameMethod() {
		List<WebElement> firstEle=driver.findElements(By.xpath(prop.getProperty("lNameValPath")));
		List<String> beforeSort=new ArrayList<String>();
		for (int i = 0; i < firstEle.size(); i++) {
			String s=firstEle.get(i).getText();
			beforeSort.add(s);
		}
		Collections.sort(beforeSort);
		System.out.println("Before Sorting "+beforeSort);
		
		WebElement ele=driver.findElement(By.xpath(prop.getProperty("lNamePath")));
		ele.click();
		
		firstEle=driver.findElements(By.xpath(prop.getProperty("lNameValPath")));
		List<String> afterSort=new ArrayList<String>();
		for (int i = 0; i < firstEle.size(); i++) {
			String s=firstEle.get(i).getText();
			afterSort.add(s);
		}
		System.out.println("After Sorting "+afterSort);
		Assert.assertTrue(beforeSort.equals(afterSort));
		System.out.println("First name Values are same");
	}
	public void emailMethod() {
		List<WebElement> emailEle=driver.findElements(By.xpath(prop.getProperty("emailValPath")));
		List<String> beforeSort=new ArrayList<String>();
		for (int i = 0; i < emailEle.size(); i++) {
			String s=emailEle.get(i).getText();
			beforeSort.add(s);
		}
		Collections.sort(beforeSort);
		System.out.println("Before Sorting "+beforeSort);
		
		WebElement ele=driver.findElement(By.xpath(prop.getProperty("emailPath")));
		ele.click();
		
		emailEle=driver.findElements(By.xpath(prop.getProperty("emailValPath")));
		List<String> afterSort=new ArrayList<String>();
		for (int i = 0; i < emailEle.size(); i++) {
			String s=emailEle.get(i).getText();
			afterSort.add(s);
		}
		System.out.println("After Sorting "+afterSort);
		Assert.assertTrue(beforeSort.equals(afterSort));
		System.out.println(" Email Values are same");
	}

	public void websiteMethod() {
		List<WebElement> webEle=driver.findElements(By.xpath(prop.getProperty("webValPath")));
		List<String> beforeSort=new ArrayList<String>();
		for (int i = 0; i < webEle.size(); i++) {
			String s=webEle.get(i).getText();
			beforeSort.add(s);
		}
		Collections.sort(beforeSort);
		System.out.println("Before Sorting "+beforeSort);
		
		WebElement ele=driver.findElement(By.xpath(prop.getProperty("webPath")));
		ele.click();
		
		webEle=driver.findElements(By.xpath(prop.getProperty("webValPath")));
		List<String> afterSort=new ArrayList<String>();
		for (int i = 0; i < webEle.size(); i++) {
			String s=webEle.get(i).getText();
			afterSort.add(s);
		}
		System.out.println("After Sorting "+afterSort);
		Assert.assertTrue(beforeSort.equals(afterSort));
		System.out.println(" Website Values are same");
	}

	public void priceMethod() {
		List<WebElement> priceEle=driver.findElements(By.xpath(prop.getProperty("priceValPath")));
		List<Float> beforeSort=new ArrayList<Float>();
		for (int i = 0; i < priceEle.size(); i++) {
			String s=priceEle.get(i).getText().substring(1);
			beforeSort.add(Float.parseFloat(s));
		}
		Collections.sort(beforeSort);
		System.out.println("Before Sorting "+beforeSort);
		
		WebElement ele=driver.findElement(By.xpath(prop.getProperty("pricePath")));
		ele.click();
		
		priceEle=driver.findElements(By.xpath(prop.getProperty("priceValPath")));
		List<Float> afterSort=new ArrayList<Float>();
		for (int i = 0; i < priceEle.size(); i++) {
			String s=priceEle.get(i).getText().substring(1);
			afterSort.add(Float.parseFloat(s));
		}
		System.out.println("After Sorting "+afterSort);
		Assert.assertTrue(beforeSort.equals(afterSort));
		System.out.println("Price Values are same");
		
	}
}
