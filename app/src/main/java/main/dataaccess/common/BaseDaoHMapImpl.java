package main.dataaccess.common;

import java.util.List;

public class BaseDaoHMapImpl <PK, ENT, MAN extends BaseRepoManager<PK,ENT>> implements BaseDao <PK, ENT> {

	protected MAN repoManager;
	
	@Override
	public ENT create(ENT entity) {
		ENT res = repoManager.insert(entity);
		return res;
	}

	@Override
	public ENT get(PK id) {
		ENT entity = repoManager.select(id);
		return entity;	
	}

	@Override
	public void update(ENT entity) {
		repoManager.update(entity);
	}

	@Override
	public void delete(PK id) {
		repoManager.delete(id);

	}
	
	@Override
	public List<ENT> selectAll() {
		List<ENT> allData = repoManager.selectAll();
		return allData;
	}
	
	
}
