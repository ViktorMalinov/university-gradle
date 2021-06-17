package main.business.facultydiscipline.processor;

import main.business.common.BaseDtoProcessorImpl;
import main.business.facultydiscipline.transformer.FacultyDisciplineParamTransformerImpl;
import main.business.facultydiscipline.transformer.FacultyDisciplineResultTransformerImpl;
import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;
import main.dataaccess.facultydiscipline.dao.FacultyDisciplineDaoHMapImpl;
import main.service.facultydiscipline.FacultyDisciplineParam;
import main.service.facultydiscipline.FacultyDisciplineResult;

public class FacultyDisciplineProcessorImpl 
		extends BaseDtoProcessorImpl<
		FacultyDisciplineParam,
		FacultyDisciplineResult,
		FacultyDiscipline,
		FacultyDisciplineDaoHMapImpl,
		FacultyDisciplineParamTransformerImpl,
		FacultyDisciplineResultTransformerImpl,
		Long >
		implements FacultyDisciplineProcessor {

	
	public FacultyDisciplineProcessorImpl() {
		this.dao = new FacultyDisciplineDaoHMapImpl();
		this.paramTransformer = new FacultyDisciplineParamTransformerImpl();
		this.resultTransformer = new FacultyDisciplineResultTransformerImpl();
	}
}
