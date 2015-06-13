package com.onenow.data;

import java.util.UUID;

import com.onenow.util.TimeParser;

public class ObjectOrigination {

	public final String id = String.valueOf(UUID.randomUUID());
	public final Long start = TimeParser.getTimestampNow();

	public ObjectOrigination() {
		
	}
	
	public String toString() {
		String s = "";
		
		s = "id " + id + " " + "start " + start + " ";
		
		return s;
	}
}