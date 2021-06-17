package main.business.apigroupuser.transformer;

import main.business.apigroupuser.validator.ApiGroupUserParamValidatorImpl;
import main.business.common.BaseDtoParamTransformerImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apigroup.dao.ApiGroupDao;
import main.dataaccess.apigroup.dao.ApiGroupDaoHMapImpl;
import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;

public class ApiGroupUserParamTransformerImpl 
		extends BaseDtoParamTransformerImpl<ApiGroupUserParam, ApiGroupUser, ApiGroupUserParamValidatorImpl>
		implements ApiGroupUserParamTransformer {


	private ApiGroupDao	apiGroupDao = new ApiGroupDaoHMapImpl();
	private ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();

	public ApiGroupUserParamTransformerImpl() {
		this.validator = new ApiGroupUserParamValidatorImpl();
	}
	
	@Override
	protected ApiGroupUser getNewEntity() {
		ApiGroupUser entity = new ApiGroupUser();
		return entity;
	}

	protected void setProperties(ApiGroupUser entity, ApiGroupUserParam param) {

		ApiGroup apiGroup = apiGroupDao.get(param.getApiGroupId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		entity.setApiGroup(apiGroup);
		entity.setApiUser(apiUser);

		//entity.setId(param.getId());

	}

}
