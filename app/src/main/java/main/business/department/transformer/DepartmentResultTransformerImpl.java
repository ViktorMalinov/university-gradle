package main.business.department.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.dataaccess.department.dao.Department;
import main.service.department.DepartmentResult;

public class DepartmentResultTransformerImpl 
		extends BaseResultTransformerImpl<DepartmentResult,Department> 
		implements DepartmentResultTransformer {

	public DepartmentResult getNewResult() {
		DepartmentResult result = new DepartmentResult();
		return result;
	}
	
	protected void setProperties(Department entity, DepartmentResult result) {
		result.setFacultyId(entity.getFaculty().getId());
		result.setFacultyName(entity.getFaculty().getName());
	}

}

