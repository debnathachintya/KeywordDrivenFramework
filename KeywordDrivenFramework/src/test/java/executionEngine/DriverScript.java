package executionEngine;

import org.testng.annotations.Test;

import config.ActionKeywords;

public class DriverScript {
	@Test
	public void ExecutionScript() throws Exception {
		String sPath = "./dataEngine/DataEngine.xlsx";
		ExcelUtils.setExcelFile(sPath, "Data");
		
		for(int iRow=1; iRow<=7; iRow++) {
			String SActionKeyword = ExcelUtils.getCellData(iRow, 3);
			if(SActionKeyword.equals("openBrowser")) {
				ActionKeywords.openBrowser();
			}
			else if(SActionKeyword.equals("navigate")) {
				ActionKeywords.navigate();
			}
			else if(SActionKeyword.equals("Input_Username")) {
				ActionKeywords.Input_Username();
			}
			else if(SActionKeyword.equals("Input_Password")) {
				ActionKeywords.Input_Password();
			}
			else if(SActionKeyword.equals("click_Login")) {
				ActionKeywords.click_Login();
			}
			else if(SActionKeyword.equals("closeBrowser")) {
				ActionKeywords.closeBrowser();
			}
		}
	}
}