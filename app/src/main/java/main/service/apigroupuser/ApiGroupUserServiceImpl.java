package main.service.apigroupuser;

import main.business.apigroupuser.processor.ApiGroupUserProcessor;
import main.business.apigroupuser.processor.ApiGroupUserProcessorImpl;
import main.service.common.BaseDtoServiceImpl;

public class ApiGroupUserServiceImpl 
		extends BaseDtoServiceImpl<
		ApiGroupUserParam,
		ApiGroupUserResult,
		ApiGroupUserProcessor,
		Long>
		implements ApiGroupUserService {

	public ApiGroupUserServiceImpl() {
		this.processor = new ApiGroupUserProcessorImpl();
	}
	
	
	/*
	private ApiGroupUserProcessor processor = new ApiGroupUserProcessorImpl();
	
	
	@Override
	public ApiGroupUserResult create(ApiGroupUserParam param) throws Exception {
		ApiGroupUserResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public ApiGroupUserResult get(Long id) throws Exception {
		ApiGroupUserResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(ApiGroupUserParam param) throws Exception {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	*/
	
}
