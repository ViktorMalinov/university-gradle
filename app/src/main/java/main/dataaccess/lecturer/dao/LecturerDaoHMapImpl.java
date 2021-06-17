package main.dataaccess.lecturer.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.lecturer.repo.LecturerRepoManager;
import main.dataaccess.lecturer.repo.LecturerRepoManagerImpl;


public class LecturerDaoHMapImpl extends BaseDaoHMapImpl <Long, Lecturer, LecturerRepoManager> implements LecturerDao {

	public LecturerDaoHMapImpl() {
		this.repoManager = new LecturerRepoManagerImpl();
	}


}
