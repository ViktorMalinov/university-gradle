package main.business.common;

import main.dataaccess.common.Persistent;
import main.service.common.BaseDto;

public abstract class BaseDtoResultTransformerImpl<
		OUT extends BaseDto,
		ENT extends Persistent> implements BaseResultTransformer<OUT, ENT> {

	protected abstract OUT getNewResult();
	protected void setProperties(ENT entity, OUT result) throws Exception{
	}
	
	public OUT transform(ENT entity) throws Exception {
		
		OUT result = getNewResult();
		
		result.setId(entity.getId());
		
		setProperties(entity, result);
		
		return result;
	}
}
