package testBase;

import pages.ConcoleMenuMetTeamElements;
import pages.EditWorkOrderElements;
import pages.FindScreenWindowElements;
import pages.FindTypeWindowElements;
import pages.LoginPageElements;
import pages.MaintenanceSubMenuElements;
import stepDefinitions.AddAssetWindowElements;


public class PageInitializer extends BaseClass {

	protected static LoginPageElements loginPageElements;
	protected static ConcoleMenuMetTeamElements concoleMenuMetTeamElements;
	protected static MaintenanceSubMenuElements maintenanceSubMenuElements;
	protected static FindScreenWindowElements findScreenWindowElements;
	protected static AddAssetWindowElements addAssetWindowElements;
	protected static FindTypeWindowElements findTypeWindowElements;
	protected static EditWorkOrderElements editWorkOrderElements;
	public static void initializePageObjects() {
		findScreenWindowElements = new FindScreenWindowElements();
		loginPageElements	= new LoginPageElements();	
		concoleMenuMetTeamElements = new ConcoleMenuMetTeamElements();
		maintenanceSubMenuElements = new MaintenanceSubMenuElements();
		addAssetWindowElements = new AddAssetWindowElements();
		findTypeWindowElements = new FindTypeWindowElements();
		editWorkOrderElements = new EditWorkOrderElements();
			
	}
}
