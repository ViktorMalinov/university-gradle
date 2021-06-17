package main.service.common;

import main.business.common.BaseProcessor;

public class BaseServiceImpl<
		IN  extends NameDto,
		OUT extends NameDto,
		PRC extends BaseProcessor<IN, OUT, PK>,
		PK>
		extends BaseDtoServiceImpl<IN, OUT, PRC, PK>
		implements BaseService<IN, OUT, PK> {


}
