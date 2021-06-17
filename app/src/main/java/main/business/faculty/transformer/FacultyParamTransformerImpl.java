package main.business.faculty.transformer;

import main.business.common.BaseParamTransformerImpl;
import main.business.faculty.validator.FacultyParamValidatorImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.service.faculty.FacultyParam;

public class FacultyParamTransformerImpl 
		extends BaseParamTransformerImpl<FacultyParam, Faculty, FacultyParamValidatorImpl>
		implements FacultyParamTransformer {


	public FacultyParamTransformerImpl() {
		this.validator = new FacultyParamValidatorImpl();
	}
	
	@Override
	protected Faculty getNewEntity() {
		Faculty entity = new Faculty();
		return entity;
	}

}
