package main.service.faculty;

import main.business.faculty.processor.FacultyProcessor;
import main.business.faculty.processor.FacultyProcessorImpl;
import main.service.common.BaseServiceImpl;

public class FacultyServiceImpl 
extends BaseServiceImpl<
		FacultyParam,
		FacultyResult,
		FacultyProcessor,
		Long>
		implements FacultyService {

	public FacultyServiceImpl() {
		this.processor = new FacultyProcessorImpl();
	}

}
