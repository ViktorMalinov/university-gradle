package main.business.speciality.validator;

import main.business.common.BaseParamValidatorImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.speciality.SpecialityParam;

public class SpecialityParamValidatorImpl extends BaseParamValidatorImpl <SpecialityParam> implements SpecialityParamValidator{

	private FacultyDao dao = new FacultyDaoHMapImpl();
	
	@Override
	public void customValidate(SpecialityParam param) throws Exception {

		if (param.getFacultyId() == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}

		Faculty faculty = dao.get(param.getFacultyId());
		
		if (faculty == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}
		
		
	}

}
