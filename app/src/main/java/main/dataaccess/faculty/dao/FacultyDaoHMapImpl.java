package main.dataaccess.faculty.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.faculty.repo.FacultyRepoManager;
import main.dataaccess.faculty.repo.FacultyRepoManagerImpl;


public class FacultyDaoHMapImpl extends BaseDaoHMapImpl <Long, Faculty, FacultyRepoManager> implements FacultyDao {

	public FacultyDaoHMapImpl() {
		this.repoManager = new FacultyRepoManagerImpl();
	}

}
