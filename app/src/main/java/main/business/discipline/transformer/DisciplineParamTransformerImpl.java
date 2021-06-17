package main.business.discipline.transformer;

import main.business.common.BaseParamTransformerImpl;
import main.business.discipline.validator.DisciplineParamValidatorImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.service.discipline.DisciplineParam;

public class DisciplineParamTransformerImpl 
		extends BaseParamTransformerImpl<DisciplineParam, Discipline, DisciplineParamValidatorImpl>
		implements DisciplineParamTransformer {


	public DisciplineParamTransformerImpl() {
		this.validator = new DisciplineParamValidatorImpl();
	}
	
	@Override
	protected Discipline getNewEntity() {
		Discipline entity = new Discipline();
		return entity;
	}
	
}
