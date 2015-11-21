package com.macys.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

	WebDriver driver;
	
	
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	//To verify 60 items are displayed in a page
	public int getItemsLinkCount()
	{
		List<WebElement> itemsLinkList = driver.findElements(By.className("productThumbnailLink"));
		
		int count = itemsLinkList.size();// returns 60 items..
		
		for(int i=0;i<count;i++)
		{
			System.out.println(itemsLinkList.get(i).getText());
		}
		
		return count;
	}
	//To verify the 'Jeans' String is available in every item and returns the count..
	public int displayItemsDescription(String itemName)
	{
		
		int count = 0 ;
		
		List<WebElement> itemsDescList = driver.findElements(By.cssSelector(".productThumbnail.borderless"));
		
		for(int i=0;i<itemsDescList.size();i++)
		{
			System.out.println(itemsDescList.get(i).getText());
			
			if(itemsDescList.get(i).getText().contains(itemName))
			{
				count = count+1;
			}
		}
		return count;
	}
	
	public void gotoNextPage()
	{
		driver.findElement(By.xpath(".//*[@id='paginateBottom']/a[7]")).click();
	}


	
	
	
	
	
}
