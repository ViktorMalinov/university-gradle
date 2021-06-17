package main.business.speciality.processor;

import main.business.common.BaseProcessorImpl;
import main.business.speciality.transformer.SpecialityParamTransformerImpl;
import main.business.speciality.transformer.SpecialityResultTransformerImpl;
import main.dataaccess.speciality.dao.Speciality;
import main.dataaccess.speciality.dao.SpecialityDaoHMapImpl;
import main.service.speciality.SpecialityParam;
import main.service.speciality.SpecialityResult;

public class SpecialityProcessorImpl 
extends BaseProcessorImpl<
SpecialityParam,
SpecialityResult,
Speciality,
SpecialityDaoHMapImpl,
SpecialityParamTransformerImpl,
SpecialityResultTransformerImpl,
Long >
implements SpecialityProcessor {


	public SpecialityProcessorImpl() {
		this.dao = new SpecialityDaoHMapImpl();
		this.paramTransformer = new SpecialityParamTransformerImpl();
		this.resultTransformer = new SpecialityResultTransformerImpl();
	}
}
