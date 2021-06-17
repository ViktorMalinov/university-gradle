package main.business.apiuser.validator;

import main.common.Validator;
import main.service.apiuser.ApiUserParam;

public interface ApiUserParamValidator extends Validator<ApiUserParam> {
	
	public void validate(ApiUserParam param) throws Exception;

}
