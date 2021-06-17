package main.business.speciality.transformer;

import main.business.common.BaseParamTransformerImpl;
import main.business.speciality.validator.SpecialityParamValidatorImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityParam;

public class SpecialityParamTransformerImpl 
extends BaseParamTransformerImpl<SpecialityParam, Speciality, SpecialityParamValidatorImpl>
implements SpecialityParamTransformer {

	private FacultyDao dao = new FacultyDaoHMapImpl();
	
	public SpecialityParamTransformerImpl() {
		this.validator = new SpecialityParamValidatorImpl();
	}
	
	@Override
	protected Speciality getNewEntity() {
		Speciality entity = new Speciality();
		return entity;
	}

	protected void setProperties(Speciality entity, SpecialityParam param) {
		Faculty faculty = dao.get(param.getFacultyId());
		entity.setFaculty(faculty);
	}


}
