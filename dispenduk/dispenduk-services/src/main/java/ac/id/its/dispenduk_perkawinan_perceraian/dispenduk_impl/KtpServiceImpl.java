package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Ktp;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.KtpDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.KtpService;

public class KtpServiceImpl implements KtpService{
	private KtpDao ktpDao;
	
	public KtpServiceImpl(KtpDao ktpDao) {
		super();
		this.ktpDao = ktpDao;
	}

	public List<Ktp> list() {
		return this.ktpDao.list();
	}

	public void createKtp(Ktp newKtp) {
		this.ktpDao.saveKtp(newKtp);
	}

	public KtpDao getKtpDao() {
		return ktpDao;
	}

	public void setKtpDao(KtpDao ktpDao) {
		this.ktpDao = ktpDao;
	}
	
}
