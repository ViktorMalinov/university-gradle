package main.business.apigroup.validator;

import main.common.Validator;
import main.service.apigroup.ApiGroupParam;

public interface ApiGroupParamValidator extends Validator<ApiGroupParam> {

	public void validate(ApiGroupParam param) throws Exception;
}
