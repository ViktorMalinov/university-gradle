package main.business.discipline.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.service.discipline.DisciplineResult;

public class DisciplineResultTransformerImpl 
		extends BaseResultTransformerImpl<DisciplineResult,Discipline>
		implements DisciplineResultTransformer {

	public DisciplineResult getNewResult() {
		DisciplineResult result = new DisciplineResult();
		return result;
	}

}
