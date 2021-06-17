package main.service.speciality;

import main.business.speciality.processor.SpecialityProcessor;
import main.business.speciality.processor.SpecialityProcessorImpl;
import main.service.common.BaseServiceImpl;

public class SpecialityServiceImpl 
		extends BaseServiceImpl<
		SpecialityParam,
		SpecialityResult,
		SpecialityProcessor,
		Long>
		implements SpecialityService {

	
	public SpecialityServiceImpl() {
		this.processor = new SpecialityProcessorImpl();
	}
	
}
