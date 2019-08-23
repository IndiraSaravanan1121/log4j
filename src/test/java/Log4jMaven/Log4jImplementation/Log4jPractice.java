package Log4jMaven.Log4jImplementation;

import org.apache.log4j.Logger;

public class Log4jPractice {
	
	private static final Logger log = Logger.getLogger(Log4jPractice.class);
	
	public static void main(String[] args) {
		log.info("error message");
	}

}
