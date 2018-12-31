package cl.hcarrasco.MenuStackUser.dataManager;


import org.apache.log4j.Logger;

import com.google.gson.Gson;

import cl.hcarrasco.MenuStackUser.SetupApp;
import cl.hcarrasco.MenuStackUser.httpManager.HTTPConnection;
import cl.hcarrasco.MenuStackUser.model.StackOverFlowUser;


public class StackOverFlowDataManager {
	
	final static Logger logger = Logger.getLogger(StackOverFlowDataManager.class);
	int reputation = 0;
	
	public StackOverFlowUser getUserData() {
		
		StackOverFlowUser user = null;
		HTTPConnection connectionManager = new HTTPConnection();
		String host = "http://api.stackexchange.com/2.2/users?inname=HCarrasko&site=stackoverflow";
		try {
			String jsonData = connectionManager.doHTTPRequest(host);
			logger.info("jsonData:   "+jsonData);
			user = createStackOverFlowUser(jsonData);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("NO CONNECTION");
		}
		return user;
	}
	
	public void getData() {
		StackOverFlowUser user = getUserData();

		if (SetupApp.firstSetup) {
			SetupApp.popup.getItem(0).setLabel("Update "+user.getItems().get(0).getDisplay_name()+" account data");
			SetupApp.popup.insertSeparator(1);
			SetupApp.popup.insert("Reputation: " + user.getItems().get(0).getReputation(), 2);
			SetupApp.popup.insert("Gold Badge: "    + user.getItems().get(0).getBadge_counts().getGold(), 3);
			SetupApp.popup.insert("Silver Badge: "  + user.getItems().get(0).getBadge_counts().getSilver(), 4);
			SetupApp.popup.insert("Bronze Badge: "  + user.getItems().get(0).getBadge_counts().getBronze(), 5);
			SetupApp.popup.insertSeparator(7);
			SetupApp.firstSetup = false;
			reputation = user.getItems().get(0).getReputation();
			logger.info("actual rep: "+reputation);
			
		} else {
			SetupApp.popup.getItem(2).setLabel("StackOverFlow Rep: " + user.getItems().get(0).getReputation());
			SetupApp.popup.getItem(3).setLabel("Gold Badges: "    + user.getItems().get(0).getBadge_counts().getGold());
			SetupApp.popup.getItem(4).setLabel("Silver Badges: "  + user.getItems().get(0).getBadge_counts().getSilver());
			SetupApp.popup.getItem(5).setLabel("Bronze Badges: "  + user.getItems().get(0).getBadge_counts().getBronze());
			
			logger.info("old rep: "+reputation);
			logger.info("old rep: "+user.getItems().get(0).getReputation());
			
		}
	}
	
	private StackOverFlowUser createStackOverFlowUser (String jsonData) {
		
		StackOverFlowUser user = new Gson().fromJson(jsonData, StackOverFlowUser.class);
		logger.info("Creating pojo of user "+user.getItems().get(0).getDisplay_name());
		logger.info("Creating pojo of user "+user.getItems().get(0).getAccount_id());
		logger.info("Creating pojo of user "+user.getItems().get(0).getUser_type());
		logger.info("Creating pojo of user "+user.getItems().get(0).getLocation());
		logger.info("Creating pojo of user "+user.getItems().get(0).getLink());
		logger.info("Creating pojo of user "+user.getItems().get(0).getProfile_image());
		logger.info("Creating pojo of user "+user.getItems().get(0).getReputation());

		return user;
	}

}
