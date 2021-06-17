package main.business.common;

import main.dataaccess.common.BaseDao;
import main.dataaccess.common.NamePersistent;
import main.service.common.NameDto;

public class BaseProcessorImpl<
		IN  extends NameDto,
		OUT extends NameDto,
		ENT extends NamePersistent,
		DAO extends BaseDao<PK, ENT>,
		PTR extends BaseParamTransformer<IN, ENT>,
		RTR extends BaseResultTransformer<OUT, ENT>,
		PK >
		extends BaseDtoProcessorImpl<IN,OUT,ENT,DAO,PTR,RTR,PK>
		implements BaseProcessor<IN, OUT, PK> {
	
}
