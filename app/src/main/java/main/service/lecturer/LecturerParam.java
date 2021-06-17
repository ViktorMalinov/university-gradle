package main.service.lecturer;

import main.service.common.NameDto;

public class LecturerParam extends NameDto {

	private String familyName;
	private Long apiUserId;
	private Long departmentId;
	
	
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

	
}
