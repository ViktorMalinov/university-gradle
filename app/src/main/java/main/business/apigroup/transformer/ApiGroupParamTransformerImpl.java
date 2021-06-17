package main.business.apigroup.transformer;

import main.business.apigroup.validator.ApiGroupParamValidatorImpl;
import main.business.common.BaseParamTransformerImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public class ApiGroupParamTransformerImpl 
		extends BaseParamTransformerImpl<ApiGroupParam, ApiGroup, ApiGroupParamValidatorImpl>
		implements ApiGroupParamTransformer {

	
	public ApiGroupParamTransformerImpl() {
		this.validator = new ApiGroupParamValidatorImpl();
	}

	@Override
	protected ApiGroup getNewEntity() {
		ApiGroup entity = new ApiGroup();
		return entity;
	}

	protected void setProperties(ApiGroup entity, ApiGroupParam param) {
		entity.setDisplayName(param.getDisplayName());	
	}

}
