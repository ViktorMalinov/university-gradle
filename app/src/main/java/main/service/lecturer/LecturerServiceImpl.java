package main.service.lecturer;

import main.business.lecturer.processor.LecturerProcessor;
import main.business.lecturer.processor.LecturerProcessorImpl;
import main.service.common.BaseServiceImpl;

public class LecturerServiceImpl 
extends BaseServiceImpl<
LecturerParam,
LecturerResult,
LecturerProcessor,
Long>
implements LecturerService {

	
	public LecturerServiceImpl() {
		this.processor = new LecturerProcessorImpl();
	}
	
}
