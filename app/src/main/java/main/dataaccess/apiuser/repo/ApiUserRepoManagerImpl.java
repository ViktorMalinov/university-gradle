package main.dataaccess.apiuser.repo;

import java.util.HashMap;
import java.util.Map;

import main.common.Utils;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.common.PersistentRepoManagerImpl;

public class ApiUserRepoManagerImpl extends PersistentRepoManagerImpl<ApiUser> implements ApiUserRepoManager {

	private static Map<Long, ApiUser> datasource = new HashMap<Long, ApiUser>();

	@Override
	public Map<Long, ApiUser> getDataSource() {
		return datasource;
	}


	public String getPath() {
        String file = Utils.getResourceFolder() + "\\datafiles\\ApiUser.json"; 
		
		return file;
	}
	
	@Override
	public Class<?> getClazz() {
		return ApiUser.class;
	}

	public ApiUserRepoManagerImpl() {
		load();
	}

}
