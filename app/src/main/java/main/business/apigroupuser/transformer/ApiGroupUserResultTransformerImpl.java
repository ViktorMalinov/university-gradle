package main.business.apigroupuser.transformer;

import main.business.common.BaseDtoResultTransformerImpl;
import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserResultTransformerImpl 
		extends BaseDtoResultTransformerImpl<ApiGroupUserResult,ApiGroupUser> 
		implements ApiGroupUserResultTransformer {


	public ApiGroupUserResult getNewResult() {
		ApiGroupUserResult result = new ApiGroupUserResult();
		return result;
	}
	
	protected void setProperties(ApiGroupUser entity, ApiGroupUserResult result) throws Exception {
		
		if (entity.getApiGroup() == null) {
			throw new Exception("The object API Group was NOT found!");
		}
		
		if (entity.getApiGroup().getDisplayName() == null) {
			throw new Exception("The Discipline NAME is empty!");
		}
		
		if (entity.getApiUser() == null) {
			throw new Exception("The object API User was NOT found!");
		}
		
		if (entity.getApiUser().getDisplayName() == null) {
			throw new Exception("The API User display NAME is empty!");
		}
		
		result.setApiGroupId(entity.getApiGroup().getId());
		result.setApiGroupDisplayName(entity.getApiGroup().getDisplayName());
		
		result.setApiUserId(entity.getApiUser().getId());
		result.setApiUserDisplayName(entity.getApiUser().getDisplayName());

	
	}

}
