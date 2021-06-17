package main.dataaccess.apigroup.dao;

import main.dataaccess.apigroup.repo.ApiGroupRepoManager;
import main.dataaccess.apigroup.repo.ApiGroupRepoManagerImpl;
import main.dataaccess.common.BaseDaoHMapImpl;

public class ApiGroupDaoHMapImpl extends BaseDaoHMapImpl <Long, ApiGroup, ApiGroupRepoManager> implements ApiGroupDao {

	public ApiGroupDaoHMapImpl() {
		this.repoManager = new ApiGroupRepoManagerImpl();
	}

}
