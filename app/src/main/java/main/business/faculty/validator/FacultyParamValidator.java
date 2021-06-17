package main.business.faculty.validator;

import main.common.Validator;
import main.service.faculty.FacultyParam;

public interface FacultyParamValidator extends Validator<FacultyParam> {

	public void validate(FacultyParam param) throws Exception;
}
