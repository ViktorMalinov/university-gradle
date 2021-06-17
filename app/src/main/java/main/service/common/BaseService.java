package main.service.common;

public interface BaseService<IN, OUT, PK> {

	OUT create(IN param) throws Exception;
	OUT get(PK id) throws Exception;
	void update(IN param) throws Exception;
	void delete(PK id);

}
