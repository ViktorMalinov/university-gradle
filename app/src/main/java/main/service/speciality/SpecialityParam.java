package main.service.speciality;

import main.service.common.NameDto;

public class SpecialityParam extends NameDto {

	private Long facultyId;
	
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	
}
