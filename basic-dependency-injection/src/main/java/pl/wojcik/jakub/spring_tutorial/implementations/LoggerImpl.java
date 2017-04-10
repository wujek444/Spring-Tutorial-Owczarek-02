package pl.wojcik.jakub.spring_tutorial.implementations;

import java.util.Date;

import pl.wojcik.jakub.spring_tutorial.api.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);

	}

}
