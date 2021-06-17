package main.business.speciality.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityResult;

public class SpecialityResultTransformerImpl 
extends BaseResultTransformerImpl<SpecialityResult,Speciality>
implements SpecialityResultTransformer {


	public SpecialityResult getNewResult() {
		SpecialityResult result = new SpecialityResult();
		return result;
	}
	
	protected void setProperties(Speciality entity, SpecialityResult result) throws Exception {

		if (entity.getFaculty() == null) {
			throw new Exception("The object Faculty was NOT found!");
		}
		
		if (entity.getFaculty().getName().isEmpty()) {
			throw new Exception("The Faculty NAME is empty!");
		}

		result.setFacultyId(entity.getFaculty().getId());
		result.setFacultyName(entity.getFaculty().getName());
	}

}
