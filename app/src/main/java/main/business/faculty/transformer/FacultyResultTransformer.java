package main.business.faculty.transformer;

import main.business.common.BaseResultTransformer;
import main.dataaccess.faculty.dao.Faculty;
import main.service.faculty.FacultyResult;

public interface FacultyResultTransformer extends BaseResultTransformer<FacultyResult, Faculty> {
	
}
