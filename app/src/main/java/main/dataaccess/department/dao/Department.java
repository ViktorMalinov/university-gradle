package main.dataaccess.department.dao;

import main.dataaccess.common.NamePersistent;
import main.dataaccess.faculty.dao.Faculty;

public class Department extends NamePersistent {

	private Faculty faculty;



	public Faculty getFaculty() {
		return faculty;
	}


	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}



	
	
}
