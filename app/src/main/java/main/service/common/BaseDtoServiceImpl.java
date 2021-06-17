package main.service.common;

import main.business.common.BaseProcessor;

public class BaseDtoServiceImpl<
		IN  extends BaseDto,
		OUT extends BaseDto,
		PRC extends BaseProcessor<IN, OUT, PK>,
		PK> 
		implements BaseService<IN, OUT, PK> {

	protected PRC processor;
	
	@Override
	public OUT create(IN param) throws Exception {
		OUT result;
		
		result = processor.create(param);

		return result;
	}
	
	
	@Override
	public OUT get(PK id)  throws Exception {
		OUT result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(IN param)  throws Exception {
		processor.update(param);
	}
	
	
	@Override
	public void delete(PK id) {
		processor.delete(id);
	}	

}
