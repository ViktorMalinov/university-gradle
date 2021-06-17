package main.dataaccess.apigroupuser.dao;

import main.dataaccess.apigroupuser.repo.ApiGroupUserRepoManager;
import main.dataaccess.apigroupuser.repo.ApiGroupUserRepoManagerImpl;
import main.dataaccess.common.BaseDaoHMapImpl;

public class ApiGroupUserDaoHMapImpl  extends BaseDaoHMapImpl<Long, ApiGroupUser, ApiGroupUserRepoManager> implements ApiGroupUserDao {

	public ApiGroupUserDaoHMapImpl() {
		this.repoManager = new ApiGroupUserRepoManagerImpl();
	}


}
