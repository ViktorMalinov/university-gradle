package main.business.lecturer.processor;

import main.business.common.BaseProcessorImpl;
import main.business.lecturer.transformer.LecturerParamTransformerImpl;
import main.business.lecturer.transformer.LecturerResultTransformerImpl;
import main.dataaccess.lecturer.dao.Lecturer;
import main.dataaccess.lecturer.dao.LecturerDaoHMapImpl;
import main.service.lecturer.LecturerParam;
import main.service.lecturer.LecturerResult;

public class LecturerProcessorImpl 
		extends BaseProcessorImpl<
		LecturerParam,
		LecturerResult,
		Lecturer,
		LecturerDaoHMapImpl,
		LecturerParamTransformerImpl,
		LecturerResultTransformerImpl,
		Long >
		implements LecturerProcessor {

	public LecturerProcessorImpl() {
		this.dao = new LecturerDaoHMapImpl();
		this.paramTransformer = new LecturerParamTransformerImpl();
		this.resultTransformer = new LecturerResultTransformerImpl();
	}

}
