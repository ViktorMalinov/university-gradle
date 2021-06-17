package main.business.facultydiscipline.transformer;

import main.business.common.BaseDtoParamTransformerImpl;
import main.business.facultydiscipline.validator.FacultyDisciplineParamValidatorImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.dataaccess.discipline.dao.DisciplineDao;
import main.dataaccess.discipline.dao.DisciplineDaoHMapImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamTransformerImpl 
extends BaseDtoParamTransformerImpl<FacultyDisciplineParam, FacultyDiscipline, FacultyDisciplineParamValidatorImpl>
implements FacultyDisciplineParamTransformer {


	private FacultyDao facultyDao = new FacultyDaoHMapImpl();
	private DisciplineDao disciplineDao = new DisciplineDaoHMapImpl();
	
	public FacultyDisciplineParamTransformerImpl() {
		this.validator = new FacultyDisciplineParamValidatorImpl();
	}
	
	@Override
	protected FacultyDiscipline getNewEntity() {
		FacultyDiscipline entity = new FacultyDiscipline();
		return entity;
	}

	protected void setProperties(FacultyDiscipline entity, FacultyDisciplineParam param) {
		Discipline discipline = disciplineDao.get(param.getDisciplineId());
		Faculty faculty = facultyDao.get(param.getFacultyId());

		entity.setDiscipline(discipline);
		entity.setFaculty(faculty);
	}

}
