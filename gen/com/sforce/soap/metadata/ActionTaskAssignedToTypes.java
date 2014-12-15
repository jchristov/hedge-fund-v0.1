package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum ActionTaskAssignedToTypes {


  
	/**
	 * Enumeration  : user
	 */
	user("user"),

  
	/**
	 * Enumeration  : role
	 */
	role("role"),

  
	/**
	 * Enumeration  : opportunityTeam
	 */
	opportunityTeam("opportunityTeam"),

  
	/**
	 * Enumeration  : accountTeam
	 */
	accountTeam("accountTeam"),

  
	/**
	 * Enumeration  : owner
	 */
	owner("owner"),

  
	/**
	 * Enumeration  : accountOwner
	 */
	accountOwner("accountOwner"),

  
	/**
	 * Enumeration  : creator
	 */
	creator("creator"),

  
	/**
	 * Enumeration  : accountCreator
	 */
	accountCreator("accountCreator"),

  
	/**
	 * Enumeration  : partnerUser
	 */
	partnerUser("partnerUser"),

  
	/**
	 * Enumeration  : portalRole
	 */
	portalRole("portalRole"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ActionTaskAssignedToTypes e : EnumSet.allOf(ActionTaskAssignedToTypes.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ActionTaskAssignedToTypes(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}