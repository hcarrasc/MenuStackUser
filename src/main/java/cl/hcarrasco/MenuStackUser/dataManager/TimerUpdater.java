package cl.hcarrasco.MenuStackUser.dataManager;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.log4j.Logger;

public class TimerUpdater {
	
	// zero seconds for delay
	private long delay = 0;
	// minutes of interval
	private long interval = 350000;
	StackOverFlowDataManager dataManager = new StackOverFlowDataManager();
	final static Logger logger = Logger.getLogger(TimerUpdater.class);

	public void updateDataRobot() {
		Timer temporizer = new Timer();
		TimerTask task = new TimerTask(){
		    @Override
		    public void run() {
		    		logger.info("UPDATING DATA FROM TIMER: ...");
		    		dataManager.getData();
		    }
		};
		temporizer.schedule (task,delay,interval);
	}

}
