package main.service.lecturer;

import main.service.common.NameDto;

public class LecturerResult extends NameDto{

	private String familyName;
	private Long apiUserId;
	private Long departmentId;
	
	private String apiUserDisplayName;
	private String departmentName;
	
	public Long getApiUserId() {
		return apiUserId;
	}
	public void setApiUserId(Long apiUserId) {
		this.apiUserId = apiUserId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getApiUserDisplayName() {
		return apiUserDisplayName;
	}
	public void setApiUserDisplayName(String apiUserDisplayName) {
		this.apiUserDisplayName = apiUserDisplayName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
}
