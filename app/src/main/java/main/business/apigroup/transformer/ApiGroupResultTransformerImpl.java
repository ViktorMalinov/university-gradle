package main.business.apigroup.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.service.apigroup.ApiGroupResult;

public class ApiGroupResultTransformerImpl 
	extends BaseResultTransformerImpl<ApiGroupResult,ApiGroup> 
	implements ApiGroupResultTransformer {

	public ApiGroupResult getNewResult() {
		ApiGroupResult result = new ApiGroupResult();
		return result;
	}
	
	protected void setProperties(ApiGroup entity, ApiGroupResult result) {
		result.setDisplayName(entity.getDisplayName());
	}

}
