package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.AktaNikahDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaNikah;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.AktaNikahService;

public class AktaNikahServiceImpl implements AktaNikahService {
	
	private AktaNikahDao aktaNikahDao;

	public AktaNikahServiceImpl() {
		
	}
	
 	public List<AktaNikah> list() {
		return this.aktaNikahDao.listAktaNikah();
	}

	public void createAktaNikah(AktaNikah newAktaNikah) {
		this.aktaNikahDao.saveAktaNikah(newAktaNikah);	
	}

	public AktaNikahDao getAktaNikahDao() {
		return aktaNikahDao;
	}

	public void setAktaNikahDao(AktaNikahDao aktaNikahDao) {
		this.aktaNikahDao = aktaNikahDao;
	}

}
