package main.business.common;

public interface BaseParamTransformer <IN, ENT> {

	ENT transform(IN param) throws Exception;
}
