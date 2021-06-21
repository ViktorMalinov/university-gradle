package main.business.common;

import main.common.ErrCode;
import main.common.UniversityBaseException;
import main.common.Validator;

public abstract class BaseParamValidatorImpl<T> implements Validator<T> {
	
	public void validate(T param) throws Exception {
		
		if (param == null) {
			//throw new Exception( "Param object you want to manipulate was not found!" );
			throw new UniversityBaseException( "Param object you want to manipulate was not found!"
											  + " ----> [ " + this.toString() + " ]", 
											ErrCode.NULLOBJECT );
		}
		
		this.customValidate(param);
		
	}

	public abstract void customValidate(T param)  throws Exception;
		
}
