package main.business.lecturer.validator;

import main.common.Validator;
import main.service.lecturer.LecturerParam;

public interface LecturerParamValidator extends Validator<LecturerParam> {
	
	public void validate(LecturerParam param) throws Exception;
}
