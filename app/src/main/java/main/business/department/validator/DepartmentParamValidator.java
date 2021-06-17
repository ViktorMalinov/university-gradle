package main.business.department.validator;

import main.common.Validator;
import main.service.department.DepartmentParam;

public interface DepartmentParamValidator extends Validator<DepartmentParam> {

	public void validate(DepartmentParam param) throws Exception;
}
