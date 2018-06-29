/**
 * 
 */
package com.main.test;

import org.testng.annotations.Test;

import com.admin.newhostel.AddRoom;
import com.admin.newhostel.CreateHostel;
import com.admin.newhostel.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author qc
 *
 */
public class AddHostel {
	
	@Test
	public void mainTest() throws InterruptedException {
//		ExtentReports logger = ExtentReports.get(BookingRoom.class);
//		logger.init("//home//qc//eclipse-workspace//HostelManagement//advanceReport.html", true);
//		logger.startTest("Stay Peace");
		Login browser = new Login();
		browser.launch();
		browser.signIn();
//		logger.log(LogStatus.INFO, "Browser Launched Successfully");
		CreateHostel hstl = new CreateHostel();
		hstl.newHostel();
//		logger.log(LogStatus.INFO, "Hostel added successfully");
		AddRoom add = new AddRoom();
		add.newRooms();	
//		logger.log(LogStatus.INFO, "Rooms added successfully");		
//		logger.log(LogStatus.PASS, "Test passed");
//		logger.endTest();
	}


}
