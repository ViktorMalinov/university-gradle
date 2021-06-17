package main.business.discipline.validator;

import main.common.Validator;
import main.service.discipline.DisciplineParam;

public interface DisciplineParamValidator extends Validator<DisciplineParam> {

	public void validate(DisciplineParam param) throws Exception;
}

