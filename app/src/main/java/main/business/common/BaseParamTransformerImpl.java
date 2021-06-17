package main.business.common;

import main.dataaccess.common.NamePersistent;
import main.service.common.NameDto;

public abstract class BaseParamTransformerImpl<
		IN extends NameDto, 
		ENT extends NamePersistent, 
		VAL extends BaseParamValidatorImpl<IN> > 
		extends BaseDtoParamTransformerImpl<IN,ENT,VAL> 
		implements BaseParamTransformer<IN, ENT> {

	
	@Override
	public ENT transform(IN param) throws Exception {
		

		ENT entity = super.transform(param);
	
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		return entity;
	}
}
