package cl.hcarrasco.MenuStackUser;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

import cl.hcarrasco.MenuStackUser.dataManager.TimerUpdater;

public class SetupApp {
	
	ActionsManager actions = new ActionsManager();
	static public PopupMenu popup = new PopupMenu();
	static public boolean firstSetup = true; 
	static public TrayIcon trayIcon = null;
	
	public boolean initSystemTray() {
		
		// launch timer that updates data
		TimerUpdater timer = new TimerUpdater();
		timer.updateDataRobot();
		
        // get the SystemTray instance
        SystemTray tray = SystemTray.getSystemTray();
        // load an image
        Image image = Toolkit.getDefaultToolkit().getImage(SetupApp.class.getResource("/chile-flag.png"));

		MenuItem getUserDataItem = new MenuItem("Get user data");
		getUserDataItem.addActionListener(actions.getUserDataListener);
		popup.add(getUserDataItem);
		
		popup.addSeparator();
		MenuItem soItem = new MenuItem("Go to StackOverFlow");
		soItem.addActionListener(actions.accountingWebsiteListener);
		popup.add(soItem);
		
		MenuItem aboutItem = new MenuItem("About this app");
		popup.add(aboutItem);
		
		popup.addSeparator();
		MenuItem quitItem = new MenuItem("Quit");
		quitItem.addActionListener(actions.quitListener);
		popup.add(quitItem);
		
		trayIcon = new TrayIcon(image.getScaledInstance(18, 12, 10), "StackOverflow Stats", popup);
		trayIcon.setToolTip("Stack Overflow Stats");
		// set the TrayIcon properties

		try {
		    tray.add(trayIcon);
		} catch (AWTException e) {
		    System.err.println(e);
		}

		return true;
	}

}
