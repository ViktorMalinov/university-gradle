package main.service.department;

import main.service.common.NameDto;

public class DepartmentParam extends NameDto{


	private Long facultyId;
	
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}

	
}
