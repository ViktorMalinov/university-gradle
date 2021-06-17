package main.business.discipline.processor;

import main.business.common.BaseProcessorImpl;
import main.business.discipline.transformer.DisciplineParamTransformerImpl;
import main.business.discipline.transformer.DisciplineResultTransformerImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.dataaccess.discipline.dao.DisciplineDaoHMapImpl;
import main.service.discipline.DisciplineParam;
import main.service.discipline.DisciplineResult;

public class DisciplineProcessorImpl 
		extends BaseProcessorImpl<
		DisciplineParam,
		DisciplineResult,
		Discipline,
		DisciplineDaoHMapImpl,
		DisciplineParamTransformerImpl,
		DisciplineResultTransformerImpl,
		Long >
		implements DisciplineProcessor {

	public DisciplineProcessorImpl() {
		this.dao = new DisciplineDaoHMapImpl();
		this.paramTransformer = new DisciplineParamTransformerImpl();
		this.resultTransformer = new DisciplineResultTransformerImpl();
	}
}
