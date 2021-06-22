package main.business.common;

import main.common.Constants;
import main.common.ErrCode;
import main.common.UniversityBaseException;
import main.common.Validator;

public abstract class BaseParamValidatorImpl<T> implements Validator<T> {
	
	public void validate(T param) throws Exception {
		
		if (param == null) {
			throw new UniversityBaseException( Constants.NULLOBJECTMESSAGE
											  + " ----> [ " + this.toString() + " ]", 
											ErrCode.NULLOBJECT );
		}
		
		this.customValidate(param);
		
	}

	public abstract void customValidate(T param)  throws Exception;
		
}
