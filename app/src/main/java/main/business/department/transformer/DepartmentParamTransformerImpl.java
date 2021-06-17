package main.business.department.transformer;

import main.business.common.BaseParamTransformerImpl;
import main.business.department.validator.DepartmentParamValidatorImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.department.DepartmentParam;

public class DepartmentParamTransformerImpl 
		extends BaseParamTransformerImpl<DepartmentParam, Department, DepartmentParamValidatorImpl> 
		implements DepartmentParamTransformer {

		
	private FacultyDao dao = new FacultyDaoHMapImpl();
	
	public DepartmentParamTransformerImpl() {
		this.validator = new DepartmentParamValidatorImpl();
	}
	
	@Override
	protected Department getNewEntity() {
		Department entity = new Department();
		return entity;
	}

	protected void setProperties(Department entity, DepartmentParam param) {
		Faculty fResult = dao.get(param.getFacultyId());  
		entity.setFaculty(fResult); 
	}


}
