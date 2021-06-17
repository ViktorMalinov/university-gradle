package main.dataaccess.apigroupuser.dao;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.common.Persistent;

public class ApiGroupUser extends Persistent {

	private ApiGroup apiGroup;
	private ApiUser apiUser;

	

	public ApiGroup getApiGroup() {
		return apiGroup;
	}


	public void setApiGroup(ApiGroup apiGroup) {
		this.apiGroup = apiGroup;
	}


	public ApiUser getApiUser() {
		return apiUser;
	}


	public void setApiUser(ApiUser apiUser) {
		this.apiUser = apiUser;
	}



	
	

}
