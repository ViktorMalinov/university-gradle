package main.service.discipline;

import main.business.discipline.processor.DisciplineProcessor;
import main.business.discipline.processor.DisciplineProcessorImpl;
import main.service.common.BaseServiceImpl;

public class DisciplineServiceImpl 
extends BaseServiceImpl<
		DisciplineParam,
		DisciplineResult,
		DisciplineProcessor,
		Long>
		implements DisciplineService {

	public DisciplineServiceImpl() {
		this.processor = new DisciplineProcessorImpl();
	}

}
