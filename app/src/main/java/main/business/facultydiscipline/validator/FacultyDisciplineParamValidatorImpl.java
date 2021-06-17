package main.business.facultydiscipline.validator;

import main.business.common.BaseParamValidatorImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.dataaccess.discipline.dao.DisciplineDao;
import main.dataaccess.discipline.dao.DisciplineDaoHMapImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamValidatorImpl extends BaseParamValidatorImpl <FacultyDisciplineParam> implements FacultyDisciplineParamValidator{

	private FacultyDao facultyDao = new FacultyDaoHMapImpl();
	private DisciplineDao disciplineDao = new DisciplineDaoHMapImpl(); 
	
	@Override
	public void customValidate(FacultyDisciplineParam param) throws Exception {
		
		if (param.getDisciplineId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		if (param.getFacultyId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		Discipline discipline = disciplineDao.get(param.getDisciplineId());
		Faculty faculty = facultyDao.get(param.getFacultyId());
		
		if (discipline == null) {
			throw new Exception("The Deiscipline DAO was NOT found!");
		}
		
		if (faculty == null) {
			throw new Exception("The Faculty DAO was NOT found!");
		}
		

	}

}
