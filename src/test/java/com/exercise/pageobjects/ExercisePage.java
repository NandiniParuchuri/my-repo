package com.exercise.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ExercisePage {
	WebDriver driver;
	
	public ExercisePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="txt_value_1")
		WebElement value1;
		@FindBy(id="txt_value_2")
		WebElement value2;
		@FindBy(id="txt_value_3")
		WebElement value3;
		@FindBy(id="txt_value_4")
		WebElement value4;
		@FindBy(id="txt_value_5")
		WebElement value5;
		@FindBy(id="txt_ttl_val")
		WebElement tot_value;
		
		public int enterValue1()
		{
			String va11=value1.getText();
			int va1=Integer.parseInt(va11);
			return va1;
		}
		public int enterValue2()
		{
			String val2=value2.getText();
			int va2=Integer.parseInt(val2);
			return va2;
		}
		public int enterValue3()
		{
			String val3=value3.getText();
			int va3=Integer.parseInt(val3);
			return va3;
		}
		public int enterValue4()
		{
			String val4=value4.getText();
			int va4=Integer.parseInt(val4);
			return va4;
		}
		public int enterValue5()
		{
			String val5=value5.getText();
			int va5=Integer.parseInt(val5);
			return va5;
		}
		
		
}
