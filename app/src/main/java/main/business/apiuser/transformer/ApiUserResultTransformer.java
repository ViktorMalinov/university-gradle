package main.business.apiuser.transformer;

import main.business.common.BaseResultTransformer;
import main.dataaccess.apiuser.dao.ApiUser;
import main.service.apiuser.ApiUserResult;

public interface ApiUserResultTransformer extends BaseResultTransformer<ApiUserResult, ApiUser> {

}
