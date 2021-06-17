package main.service.apiuser;

import main.business.apiuser.processor.ApiUserProcessor;
import main.business.apiuser.processor.ApiUserProcessorImpl;
import main.service.common.BaseServiceImpl;

public class ApiUserServiceImpl 
extends BaseServiceImpl<
ApiUserParam,
ApiUserResult,
ApiUserProcessor,
Long>
implements ApiUserService {


	public ApiUserServiceImpl() {
		this.processor = new ApiUserProcessorImpl();
	}
}
