package cl.hcarrasco.MenuStackUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.log4j.Logger;

import cl.hcarrasco.MenuStackUser.dataManager.StackOverFlowDataManager;

public class ActionsManager {
	
	final static Logger logger = Logger.getLogger(ActionsManager.class);
	StackOverFlowDataManager dataManager = new StackOverFlowDataManager();

	// create a action listener to listen for default action executed on the tray icon
	ActionListener getUserDataListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			logger.info("UPDATING DATA FROM MENU: ...");
			dataManager.getData();
		}
	};

	ActionListener quitListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			logger.info("Kill app : true");
			quitApp();
		}
	};
	
	ActionListener accountingWebsiteListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			try {
				java.awt.Desktop.getDesktop().browse(new URI("http://www.stackoverflow.com"));
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	};

	private void quitApp() {
		System.exit(0);
	}

}
