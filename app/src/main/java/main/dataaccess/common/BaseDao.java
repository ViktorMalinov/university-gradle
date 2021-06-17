package main.dataaccess.common;

import java.util.List;

public interface BaseDao <PK, ENT> {

	ENT create(ENT entity);
	ENT get(PK id);
	void update(ENT entity);
	void delete(PK id);
	List<ENT> selectAll();

}
