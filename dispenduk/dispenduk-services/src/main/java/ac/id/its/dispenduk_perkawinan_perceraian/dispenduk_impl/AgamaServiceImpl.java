package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Agama;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.AgamaDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.AgamaService;

public class AgamaServiceImpl implements AgamaService{
	private AgamaDao agamaDao;
	
	public AgamaServiceImpl() {
		
	}

	public List<Agama> list() {
		return this.agamaDao.list();
	}

	public void createAgama(Agama newAgama) {
		this.agamaDao.saveAgama(newAgama);
	}

	public AgamaDao getAgamaDao() {
		return agamaDao;
	}

	public void setAgamaDao(AgamaDao agamaDao) {
		this.agamaDao = agamaDao;
	}

}
