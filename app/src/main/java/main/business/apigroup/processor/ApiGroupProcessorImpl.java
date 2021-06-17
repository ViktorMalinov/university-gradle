package main.business.apigroup.processor;

import main.business.apigroup.transformer.ApiGroupParamTransformerImpl;
import main.business.apigroup.transformer.ApiGroupResultTransformerImpl;
import main.business.common.BaseProcessorImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apigroup.dao.ApiGroupDaoHMapImpl;
import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;


public class ApiGroupProcessorImpl 
	extends BaseProcessorImpl<
	ApiGroupParam,
	ApiGroupResult,
	ApiGroup,
	ApiGroupDaoHMapImpl,
	ApiGroupParamTransformerImpl,
	ApiGroupResultTransformerImpl,
	Long >
	implements ApiGroupProcessor {


	public ApiGroupProcessorImpl() {
		this.dao = new ApiGroupDaoHMapImpl();
		this.paramTransformer = new ApiGroupParamTransformerImpl();
		this.resultTransformer = new ApiGroupResultTransformerImpl();
	}

}
