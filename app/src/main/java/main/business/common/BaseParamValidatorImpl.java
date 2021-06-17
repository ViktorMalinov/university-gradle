package main.business.common;

import main.common.Validator;

public abstract class BaseParamValidatorImpl<T> implements Validator<T> {
	
	public void validate(T param) throws Exception {

		if (param == null) {
			throw new Exception( "Param object you want to manipulate was not found!" );
		}
		
		this.customValidate(param);
		
	}

	public abstract void customValidate(T param)  throws Exception;
		
}
