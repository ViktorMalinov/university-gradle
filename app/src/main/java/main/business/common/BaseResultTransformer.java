package main.business.common;

public interface BaseResultTransformer<OUT, ENT> {

	OUT transform(ENT entity) throws Exception;
}
