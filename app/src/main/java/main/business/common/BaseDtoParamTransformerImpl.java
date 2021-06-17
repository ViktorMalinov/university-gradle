package main.business.common;

import main.dataaccess.common.Persistent;
import main.service.common.BaseDto;

public abstract class BaseDtoParamTransformerImpl<
		IN extends BaseDto, 
		ENT extends Persistent, 
		VAL extends BaseParamValidatorImpl<IN> > implements BaseParamTransformer<IN, ENT> {

	protected VAL validator;
	
	protected abstract ENT getNewEntity(); 
	protected void setProperties(ENT entity, IN param){
	}
	
	
	@Override
	public ENT transform(IN param) throws Exception {

		validator.validate(param);

		ENT entity = getNewEntity();
	
		entity.setId(param.getId());
		
		setProperties(entity,param);
		
			
		return entity;
	}
}
