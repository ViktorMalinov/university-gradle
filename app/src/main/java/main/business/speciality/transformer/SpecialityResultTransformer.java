package main.business.speciality.transformer;

import main.business.common.BaseResultTransformer;
import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityResult;

public interface SpecialityResultTransformer extends BaseResultTransformer<SpecialityResult, Speciality> {

}
