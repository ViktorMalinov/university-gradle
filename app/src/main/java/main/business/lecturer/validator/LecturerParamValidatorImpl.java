package main.business.lecturer.validator;

import main.business.common.BaseParamValidatorImpl;
import main.common.Constants;
import main.common.ErrCode;
import main.common.UniversityBaseException;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.department.dao.DepartmentDao;
import main.dataaccess.department.dao.DepartmentDaoHMapImpl;
import main.service.lecturer.LecturerParam;

public class LecturerParamValidatorImpl extends BaseParamValidatorImpl <LecturerParam> implements LecturerParamValidator{

	private ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();
	private DepartmentDao departmentDao = new DepartmentDaoHMapImpl(); 
	
	@Override
	public void customValidate(LecturerParam param) throws Exception {

		if (param.getApiUserId() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Api User ID","Lecturer")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}		

		if (param.getDepartmentId() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Department ID","Lecturer")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}		

		Department department = departmentDao.get(param.getDepartmentId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		if (department == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Department","Lecturer")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
		if (apiUser == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Api User","Lecturer")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}

	}

}
