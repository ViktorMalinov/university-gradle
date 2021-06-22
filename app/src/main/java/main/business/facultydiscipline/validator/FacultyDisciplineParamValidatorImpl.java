package main.business.facultydiscipline.validator;

import main.business.common.BaseParamValidatorImpl;
import main.common.Constants;
import main.common.ErrCode;
import main.common.UniversityBaseException;
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
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Discipline ID","Faculty Discipline")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}		

		if (param.getFacultyId() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Faculty ID","Faculty Discipline")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}		

		Discipline discipline = disciplineDao.get(param.getDisciplineId());
		Faculty faculty = facultyDao.get(param.getFacultyId());
		
		if (discipline == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Discipline","Faculty Discipline")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
		if (faculty == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Faculty","Faculty Discipline")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		

	}

}
