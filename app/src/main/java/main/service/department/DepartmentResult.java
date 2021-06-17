package main.service.department;

import main.service.common.NameDto;

public class DepartmentResult extends NameDto{

	private Long facultyId;
	private String facultyName;
	
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	
}
