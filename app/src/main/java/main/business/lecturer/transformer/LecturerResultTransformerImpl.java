package main.business.lecturer.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.common.Constants;
import main.common.ErrCode;
import main.common.UniversityBaseException;
import main.dataaccess.lecturer.dao.Lecturer;
import main.service.lecturer.LecturerResult;

public class LecturerResultTransformerImpl 
		extends BaseResultTransformerImpl<LecturerResult,Lecturer>
		implements LecturerResultTransformer {

	public LecturerResult getNewResult() {
		LecturerResult result = new LecturerResult();
		return result;
	}
	
	protected void setProperties(Lecturer entity, LecturerResult result) throws Exception {
		result.setFamilyName(entity.getFamilyName());
		
		if (entity.getDepartment() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Department","Lecturer")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
		if (entity.getDepartment().getName() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "Department name","Department")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
		if (entity.getApiUser() == null) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "API User","Lecturer")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
		if (entity.getApiUser().getDisplayName().isEmpty()) {
			throw new UniversityBaseException( String.format(Constants.NULLOBJECTMESSAGEFORMATTED, "API user display name","ApiUser")
					  + " ----> [ " + this.toString() + " ]", 
					ErrCode.NULLOBJECT );
		}
		
		result.setDepartmentId(entity.getDepartment().getId());
		result.setDepartmentName(entity.getDepartment().getName());
		
		result.setApiUserId(entity.getApiUser().getId());
		result.setApiUserDisplayName(entity.getApiUser().getDisplayName());
	
	}

}
