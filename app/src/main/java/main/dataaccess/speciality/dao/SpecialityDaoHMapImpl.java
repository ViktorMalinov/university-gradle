package main.dataaccess.speciality.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.speciality.repo.SpecialityRepoManager;
import main.dataaccess.speciality.repo.SpecialityRepoManagerImpl;


public class SpecialityDaoHMapImpl extends BaseDaoHMapImpl <Long, Speciality, SpecialityRepoManager> implements SpecialityDao {

	public SpecialityDaoHMapImpl() {
		this.repoManager = new SpecialityRepoManagerImpl();
	}

}
