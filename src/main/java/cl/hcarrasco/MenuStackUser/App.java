package cl.hcarrasco.MenuStackUser;

import java.awt.SystemTray;

public class App {
    public static void main( String[] args ){
    	
    	System.setProperty("apple.awt.UIElement", "true");
    		
        if (SystemTray.isSupported()) {
        		SetupApp initApp = new SetupApp();
        		initApp.initSystemTray();
        }
    
    }
}
