package main.common;

public class UniversityBaseException extends Exception{
	private static final long serialVersionUID = 1L;
	protected ErrCode errCode; 
	protected String errorMessage;

	public ErrCode getErrCode() {
		return this.errCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public UniversityBaseException(ErrCode errCode) {
		
		this("", errCode);
		
	}
	
	
	public UniversityBaseException(String errorMessage, ErrCode errCode) {
		
		super(errorMessage);
		this.errCode = errCode;
		this.errorMessage = errorMessage;
		
    }
	
}
