package main.business.apigroupuser.processor;

import main.business.apigroupuser.transformer.ApiGroupUserParamTransformerImpl;
import main.business.apigroupuser.transformer.ApiGroupUserResultTransformerImpl;
import main.business.common.BaseDtoProcessorImpl;
import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.dataaccess.apigroupuser.dao.ApiGroupUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserProcessorImpl 
		extends BaseDtoProcessorImpl<
		ApiGroupUserParam,
		ApiGroupUserResult,
		ApiGroupUser,
		ApiGroupUserDaoHMapImpl,
		ApiGroupUserParamTransformerImpl,
		ApiGroupUserResultTransformerImpl,
		Long >
		implements ApiGroupUserProcessor {


	public ApiGroupUserProcessorImpl() {
		this.dao = new ApiGroupUserDaoHMapImpl();
		this.paramTransformer = new ApiGroupUserParamTransformerImpl();
		this.resultTransformer = new ApiGroupUserResultTransformerImpl();
	}

}
