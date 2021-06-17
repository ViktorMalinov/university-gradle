package main.service.department;

import main.business.department.processor.DepartmentProcessor;
import main.business.department.processor.DepartmentProcessorImpl;
import main.service.common.BaseServiceImpl;

public class DepartmentServiceImpl 
		extends BaseServiceImpl<
		DepartmentParam,
		DepartmentResult,
		DepartmentProcessor,
		Long>
		implements DepartmentService {

	
	public DepartmentServiceImpl() {
		this.processor = new DepartmentProcessorImpl();
	}
	
}
