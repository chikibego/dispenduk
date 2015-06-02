package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.AktaCeraiDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaCerai;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.AktaCeraiService;

public class AktaCeraServiceiimpl implements AktaCeraiService {
	
	private AktaCeraiDao aktaCeraiDao;
	
	public AktaCeraServiceiimpl() {}

	public List<AktaCerai> list() {
		return this.aktaCeraiDao.list();
	}

	public void createAktaCerai(AktaCerai newAktaCerai) {
		this.aktaCeraiDao.saveAktaCerai(newAktaCerai);	
	}

	public AktaCeraiDao getAktaCeraiDao() {
		return aktaCeraiDao;
	}

	public void setAktaCeraiDao(AktaCeraiDao aktaCeraiDao) {
		this.aktaCeraiDao = aktaCeraiDao;
	}
	
}
