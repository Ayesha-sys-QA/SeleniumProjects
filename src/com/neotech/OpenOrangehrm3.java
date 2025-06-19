package com.neotech;
import com.neotech.utils.BrowserSetup;



	
		public class OpenOrangehrm3 extends BrowserSetup {

			public static void main(String[] args) throws InterruptedException {
				// setup the testing environment
				setUp();

				// write your test
				String title = driver.getTitle();
				System.out.println(title);
				Thread.sleep(2000);

				// close the browser
				tearDown();
			}

		
	}


