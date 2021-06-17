package main.dataaccess.lecturer.dao;

import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.common.NamePersistent;
import main.dataaccess.department.dao.Department;

public class Lecturer extends NamePersistent {

	private String familyName;
	
	private ApiUser apiUser;
	private Department department;
	
	
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public ApiUser getApiUser() {
		return apiUser;
	}
	public void setApiUser(ApiUser apiUser) {
		this.apiUser = apiUser;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}


	
}
