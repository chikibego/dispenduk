package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DetailPerceraianDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerceraian;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.DetailPerceraianService;

public class DetailPerceraianServiceImpl implements DetailPerceraianService {

	private DetailPerceraianDao detailPerceraianDao;
	
	public DetailPerceraianServiceImpl() {

	}

	public List<DetailPerceraian> list() {
		return this.detailPerceraianDao.list();
	}

	public void createDetailPerceraian(DetailPerceraian newDetailPerceraian) {
		this.detailPerceraianDao.saveDetailCerai(newDetailPerceraian);
	}

	public DetailPerceraianDao getDetailPerceraianDao() {
		return detailPerceraianDao;
	}

	public void setDetailPerceraianDao(DetailPerceraianDao detailPerceraianDao) {
		this.detailPerceraianDao = detailPerceraianDao;
	}

}
