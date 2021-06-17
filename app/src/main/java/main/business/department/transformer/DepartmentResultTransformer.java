package main.business.department.transformer;

import main.business.common.BaseResultTransformer;
import main.dataaccess.department.dao.Department;
import main.service.department.DepartmentResult;

public interface DepartmentResultTransformer extends BaseResultTransformer<DepartmentResult, Department> {

}
