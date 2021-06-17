package main.service.facultydiscipline;

import main.service.common.BaseDto;

public class FacultyDisciplineParam extends BaseDto {

	private Long disciplineId;
	private Long facultyId;
	
	public Long getDisciplineId() {
		return disciplineId;
	}

	public void setDisciplineId(Long disciplineId) {
		this.disciplineId = disciplineId;
	}


	public Long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}

	
}
