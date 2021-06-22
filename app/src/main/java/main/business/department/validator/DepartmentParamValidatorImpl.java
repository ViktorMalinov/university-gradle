package main.business.department.validator;

import main.business.common.BaseParamValidatorImpl;
import main.common.Constants;
import main.common.ErrCode;
import main.common.UniversityBaseException;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.department.DepartmentParam;

public class DepartmentParamValidatorImpl extends BaseParamValidatorImpl<DepartmentParam> implements DepartmentParamValidator{

	private FacultyDao dao = new FacultyDaoHMapImpl(); 
	
	@Override
	public void customValidate(DepartmentParam param) throws Exception {

		if (param.getFacultyId() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Faculty ID","Department")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}

		Faculty fResult = dao.get(param.getFacultyId());
		
		if (fResult == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Faculty","Department")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
	}




}
