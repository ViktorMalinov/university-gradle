package main.business.apigroupuser.validator;

import main.common.Validator;
import main.service.apigroupuser.ApiGroupUserParam;

public interface ApiGroupUserParamValidator extends Validator<ApiGroupUserParam> {

	public void validate(ApiGroupUserParam param) throws Exception;
}
