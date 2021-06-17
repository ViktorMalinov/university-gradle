package main.business.lecturer.transformer;

import main.business.common.BaseResultTransformer;
import main.dataaccess.lecturer.dao.Lecturer;
import main.service.lecturer.LecturerResult;

public interface LecturerResultTransformer extends BaseResultTransformer<LecturerResult, Lecturer> {

}
