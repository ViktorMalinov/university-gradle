package main.dataaccess.apigroup.dao;

import main.dataaccess.common.NamePersistent;


public class ApiGroup extends NamePersistent {

	
	private String displayName;
	

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	} 
	
	public ApiGroup() {
		
	};
	
	
}
