package com.onenow.util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.Map;

public class RuntimeEnvironment {
	
	public RuntimeEnvironment() {
		
	}

	public static void execute(final String messageToExecute) {
		new Thread () {
			@Override public void run () {

			try {
				Watchr.log("Will execute: " + messageToExecute);
				Runtime.getRuntime().exec(messageToExecute);
			} catch (Exception e) {
				Watchr.log(Level.SEVERE, e.toString());
			}
			}
		}.start();
	}

	/** 
	 * Gets the value corresponding to an environment variable
	 * @param envVariable
	 * @return
	 */
	public static String getEnv(String envVariable) {
		String value = System.getenv(envVariable);
        if (value != null) {
            System.out.format("%s=%s%n", envVariable, value);
        } else {
            System.out.format("%s is"
                + " not assigned.%n", envVariable);
        }
		return value;
	}
	/**
	 * Gets whole envrionment
	 * @return
	 */
	public static String getEnv() {
		String s = "";
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        return s;
	}
}