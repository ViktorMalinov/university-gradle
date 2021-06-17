package main.business.department.processor;

import main.business.common.BaseProcessorImpl;
import main.business.department.transformer.DepartmentParamTransformerImpl;
import main.business.department.transformer.DepartmentResultTransformerImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.department.dao.DepartmentDaoHMapImpl;
import main.service.department.DepartmentParam;
import main.service.department.DepartmentResult;

public class DepartmentProcessorImpl
		extends BaseProcessorImpl<
		DepartmentParam,
		DepartmentResult,
		Department,
		DepartmentDaoHMapImpl,
		DepartmentParamTransformerImpl,
		DepartmentResultTransformerImpl,
		Long >
		implements DepartmentProcessor {


	public DepartmentProcessorImpl() {
		this.dao = new DepartmentDaoHMapImpl();
		this.paramTransformer = new DepartmentParamTransformerImpl();
		this.resultTransformer = new DepartmentResultTransformerImpl();
	}

}
