package main.common;

public class UniversityBaseException extends Exception{
	private static final long serialVersionUID = 1L;
	protected ErrCode errCode; 

	public ErrCode getErrCode() {
		return this.errCode;
	}


	public UniversityBaseException(ErrCode errCode) {
		
		this("", errCode);
		
	}
	
	
	public UniversityBaseException(String errorMessage, ErrCode errCode) {
		
		super(errorMessage);
		this.errCode = errCode;
		
    }
	
}
