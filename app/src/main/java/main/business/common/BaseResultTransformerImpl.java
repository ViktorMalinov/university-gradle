package main.business.common;

import main.dataaccess.common.NamePersistent;
import main.service.common.NameDto;

public abstract class BaseResultTransformerImpl<
	OUT extends NameDto,
	ENT extends NamePersistent > 
	extends BaseDtoResultTransformerImpl<OUT, ENT>
	implements BaseResultTransformer<OUT, ENT> {

	
	public OUT transform(ENT entity) throws Exception {
		
		OUT result = super.transform(entity);
		
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		return result;
	}
}
