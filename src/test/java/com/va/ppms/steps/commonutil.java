package com.va.ppms.steps;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class commonutil {

		//Check if element is present or not in webpage
		public static boolean isDisplayed(WebElement element) {
	        try {
	            return element.isDisplayed();
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }

}
