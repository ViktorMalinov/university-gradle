package main.dataaccess.common;

import java.util.Set;

import main.common.Utils;

public abstract class PersistentRepoManagerImpl<ENT extends Persistent> extends BaseRepoManagerImpl<Long, ENT> 
		implements BaseRepoManager<Long, ENT> {

	// protected Map<PK, ENT> datasource = new HashMap<PK, ENT>();

	
	@Override
	public Long getPk(ENT entity) {
		return entity.getId();
	}

	@Override
	public void setPk(ENT entity) {

		Set<Long> idSet = getDataSource().keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
	}

	
}
