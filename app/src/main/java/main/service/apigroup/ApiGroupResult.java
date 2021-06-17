package main.service.apigroup;

import main.service.common.NameDto;

public class ApiGroupResult extends NameDto{
	
	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
