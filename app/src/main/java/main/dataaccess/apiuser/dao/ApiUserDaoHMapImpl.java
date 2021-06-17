package main.dataaccess.apiuser.dao;

import main.dataaccess.apiuser.repo.ApiUserRepoManager;
import main.dataaccess.apiuser.repo.ApiUserRepoManagerImpl;
import main.dataaccess.common.BaseDaoHMapImpl;

public class ApiUserDaoHMapImpl extends BaseDaoHMapImpl <Long, ApiUser, ApiUserRepoManager> implements ApiUserDao {

	public ApiUserDaoHMapImpl() {
		this.repoManager = new ApiUserRepoManagerImpl();
	}

}
