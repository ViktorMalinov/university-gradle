package main.business.facultydiscipline.validator;

import main.common.Validator;
import main.service.facultydiscipline.FacultyDisciplineParam;

public interface FacultyDisciplineParamValidator extends Validator<FacultyDisciplineParam> {

	public void validate(FacultyDisciplineParam param) throws Exception;
}
