package Com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.Actitime.GenericLibrary.Baseclass;
import Com.Actitime.GenericLibrary.FileLibrary;
import Com.Actitime.pom.HomePage;
import Com.Actitime.pom.TaskPage;

public class TaskTest extends Baseclass{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasklink().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		FileLibrary f=new FileLibrary();
		String name = f.readDataFromExcelFile("Sheet1", 4, 1);
		tp.getCustname().sendKeys(name);
		String description = f.readDataFromExcelFile("Sheet1", 4, 2);
		tp.getCustdesp().sendKeys(description);
		tp.getCreatecust().click();
	}
	}
