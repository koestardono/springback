package train.perpusbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// this not use!
public class LoggingController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	public void helpMethod() {
		logger.debug("this is a debug message");
		logger.info("this is an info message");
		logger.warn("this is a warn message");
		logger.error("this is an error message");
	}
}
