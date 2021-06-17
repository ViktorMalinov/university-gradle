package main.business.lecturer.transformer;

import main.business.common.BaseResultTransformerImpl;
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
			throw new Exception("The object Department was NOT found!");
		}
		
		if (entity.getDepartment().getName().isEmpty()) {
			throw new Exception("The Department NAME is empty!");
		}
		
		if (entity.getApiUser() == null) {
			throw new Exception("The object API User was NOT found!");
		}
		
		if (entity.getApiUser().getDisplayName().isEmpty()) {
			throw new Exception("The API user display NAME is empty!");
		}
		
		result.setDepartmentId(entity.getDepartment().getId());
		result.setDepartmentName(entity.getDepartment().getName());
		
		result.setApiUserId(entity.getApiUser().getId());
		result.setApiUserDisplayName(entity.getApiUser().getDisplayName());
	
	}

}
