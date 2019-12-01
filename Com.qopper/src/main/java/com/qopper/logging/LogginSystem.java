package com.qopper.logging;

import org.apache.log4j.Logger;

public class LogginSystem {
	
	public static void debuglogs(String msg) {
		Logger log = Logger.getLogger("devpinoyLogger");
	log.debug(msg);
	}
}