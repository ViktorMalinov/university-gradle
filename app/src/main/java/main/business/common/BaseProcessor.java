package main.business.common;

public interface BaseProcessor<IN, OUT, PK> {

	OUT create(IN param) throws Exception;
	OUT get(PK id) throws Exception;
	void update(IN param) throws Exception;
	void delete(PK id);

	
}
