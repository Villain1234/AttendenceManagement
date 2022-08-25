package com.ams.genericutility;
import java.util.Date;
import java.util.Random;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebElement;

public class JavaUtility {

		/**
		 * its used to generate the random number with in the range of 1000 
		 * @return
		 */
	    public static int getRanDomNum(int index) {
			Random randNum= new Random();
			int ranDomNum = randNum.nextInt(index);
			System.out.println(ranDomNum);
			return ranDomNum;
			
			
		}
	    /**
	     * it is used to get the current system date based on YYY-MM-DD
	     * @return
	     */
	    public String getSystemDate () {
	    	Date date =new Date ();
	    		String currentDate = date.toString () ;
	    		String[] arr = currentDate.split("");
	    		String yyyy = arr[5];
	    		String dd = arr[2];
	    		int mm = date.getMonth()+1;
	    		
	    		String formate = yyyy+"-"+mm+"-"+dd;
	    		return formate;
	    
	    	
	    }
	    public String getSystemDateInIst() {
	    	Date date = new Date ();
	    	String currentDate= date.toString();
	    	String[] arr= currentDate.split("");
	    	String yyyy = arr[5];
	    	String dd= arr[2];
	    	int mm = date.getMonth()+1;
	    	String formate = dd+"-"+mm+"-"+yyyy;
	    	
	    	return formate;
	    }
	    /**
		* used to Compare The Actual Data With Expected Data
		* @param driver
		*/
	 
		public void CompareExpectedResulttWithActual(WebElement element , String expectedCode)
		{
		
		if(element.getText().trim().contains(expectedCode.trim())) {
		System.out.println("Class Is Created With Given Code");
		}else
    {
		System.out.println("Class Is Not Created With Given Code Code");
		
		}
		}
		public void waitingCondition() throws InterruptedException {
			Thread.sleep(1000);
		}
		/*	public boolean compareExpectedResulttWithActual(List elements , String expectedCode)
		{
		
		boolean flag;
		String Text;
		for (WebElement element:elements) {
			Text = element.getText();
		}
		while( Text.next()) {
			if(Text.equals(expectedCode)) {
			 flag=true;
			break;
			}
			}
			if(flag) {
			System.out.println(expectedCode+"==>Data is verified in the data base table");
			return flag;
			}else {
			System.out.println(expectedCode+"==>data is not verified in the database");
			return flag;
			}
		
	    	*/
		
		


}
