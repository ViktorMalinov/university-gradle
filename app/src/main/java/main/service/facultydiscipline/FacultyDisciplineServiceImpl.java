package main.service.facultydiscipline;

import main.business.facultydiscipline.processor.FacultyDisciplineProcessor;
import main.business.facultydiscipline.processor.FacultyDisciplineProcessorImpl;
import main.service.common.BaseDtoServiceImpl;

public class FacultyDisciplineServiceImpl 
		extends BaseDtoServiceImpl<
		FacultyDisciplineParam,
		FacultyDisciplineResult,
		FacultyDisciplineProcessor,
		Long>
implements FacultyDisciplineService {


	public FacultyDisciplineServiceImpl() {
		this.processor = new FacultyDisciplineProcessorImpl();
	}

}
