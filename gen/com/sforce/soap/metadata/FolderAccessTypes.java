package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum FolderAccessTypes {


  
	/**
	 * Enumeration  : Shared
	 */
	Shared("Shared"),

  
	/**
	 * Enumeration  : Public
	 */
	Public("Public"),

  
	/**
	 * Enumeration  : Hidden
	 */
	Hidden("Hidden"),

  
	/**
	 * Enumeration  : PublicInternal
	 */
	PublicInternal("PublicInternal"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FolderAccessTypes e : EnumSet.allOf(FolderAccessTypes.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FolderAccessTypes(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}