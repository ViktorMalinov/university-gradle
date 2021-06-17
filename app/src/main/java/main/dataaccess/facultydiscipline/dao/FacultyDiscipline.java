package main.dataaccess.facultydiscipline.dao;

import main.dataaccess.common.Persistent;
import main.dataaccess.discipline.dao.Discipline;
import main.dataaccess.faculty.dao.Faculty;

public class FacultyDiscipline extends Persistent {

	private Faculty faculty;
	private Discipline discipline;
	


	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}


	
}
