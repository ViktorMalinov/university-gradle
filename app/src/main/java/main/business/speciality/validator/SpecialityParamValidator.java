package main.business.speciality.validator;

import main.common.Validator;
import main.service.speciality.SpecialityParam;

public interface SpecialityParamValidator extends Validator<SpecialityParam> {

	public void validate(SpecialityParam param) throws Exception;
}
