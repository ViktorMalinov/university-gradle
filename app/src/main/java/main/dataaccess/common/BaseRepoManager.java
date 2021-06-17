package main.dataaccess.common;

import java.util.List;

public interface BaseRepoManager <PK, ENT> {

	ENT insert(ENT entity);
	ENT select(PK id);
	void update(ENT entity);
	void delete(PK id);
	List<ENT> selectAll();
}
