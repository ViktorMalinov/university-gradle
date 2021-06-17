package main.common;

public interface Validator <T> {

	public void validate(T param) throws Exception; 
}
