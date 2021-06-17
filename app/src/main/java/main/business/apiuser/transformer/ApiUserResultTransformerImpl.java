package main.business.apiuser.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.dataaccess.apiuser.dao.ApiUser;
import main.service.apiuser.ApiUserResult;

public class ApiUserResultTransformerImpl 
		extends BaseResultTransformerImpl<ApiUserResult, ApiUser>
		implements ApiUserResultTransformer {

	
	public ApiUserResult getNewResult() {
		ApiUserResult result = new ApiUserResult();
		return result;
	}
	
	protected void setProperties(ApiUser entity, ApiUserResult result) {
		result.setDisplayName(entity.getDisplayName());
		result.setEmail(entity.getEmail());
		result.setPassword(entity.getPassword());		
		result.setUsername(entity.getUsername());
	}
	
}
