package main.service.apigroup;

import main.business.apigroup.processor.ApiGroupProcessor;
import main.business.apigroup.processor.ApiGroupProcessorImpl;
import main.service.common.BaseServiceImpl;

public class ApiGroupServiceImpl 
extends BaseServiceImpl<
		ApiGroupParam,
		ApiGroupResult,
		ApiGroupProcessor,
		Long>
		implements ApiGroupService {
	
	public ApiGroupServiceImpl() {
		this.processor = new ApiGroupProcessorImpl();
	}	
	
}
