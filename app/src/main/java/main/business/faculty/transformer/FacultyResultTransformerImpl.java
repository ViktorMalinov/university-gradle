package main.business.faculty.transformer;

import main.business.common.BaseResultTransformerImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.service.faculty.FacultyResult;

public class FacultyResultTransformerImpl 
extends BaseResultTransformerImpl<FacultyResult,Faculty>
implements FacultyResultTransformer {

	public FacultyResult getNewResult() {
		FacultyResult result = new FacultyResult();
		return result;
	}
}
