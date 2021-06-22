package main.business.common;

import main.common.UniversityBaseException;
import main.common.Utils;
import main.dataaccess.common.BaseDao;
import main.dataaccess.common.Persistent;
import main.service.common.BaseDto;

public class BaseDtoProcessorImpl<
		IN  extends BaseDto,
		OUT extends BaseDto,
		ENT extends Persistent,
		DAO extends BaseDao<PK, ENT>,
		PTR extends BaseParamTransformer<IN, ENT>,
		RTR extends BaseResultTransformer<OUT, ENT>,
		PK > 
		implements BaseProcessor<IN, OUT, PK> {


	protected DAO dao;
	protected PTR paramTransformer;
	protected RTR resultTransformer;
	
	
	@Override
	public OUT create(IN param) throws Exception {
		try {  // ONLY FOR TEST !!!

			ENT entity = paramTransformer.transform(param); 
			
			entity = dao.create(entity);
			
			OUT result = resultTransformer.transform(entity);
			return result;
		}
		catch (UniversityBaseException e) {
			Utils.log(e.getMessage(), e.getErrCode());
			throw e;
		}
	}

	@Override
	public OUT get(PK id) throws Exception {
			ENT entity = dao.get(id);
			OUT result = resultTransformer.transform(entity);
			return result;
	}

	@Override
	public void update(IN param) throws Exception {
			ENT entity = paramTransformer.transform(param);
			dao.update(entity);
	}

	@Override
	public void delete(PK id) {
		dao.delete(id);
	}
	
	
}
