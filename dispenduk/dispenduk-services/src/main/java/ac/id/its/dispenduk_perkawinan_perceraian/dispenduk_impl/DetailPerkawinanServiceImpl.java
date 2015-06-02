package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerkawinan;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DetailPerkawinanDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.DetailPerkawinanService;

public class DetailPerkawinanServiceImpl implements DetailPerkawinanService{
	private DetailPerkawinanDao detailPerkawinanDao;
	
	public DetailPerkawinanServiceImpl() {
		
	}

	public List<DetailPerkawinan> list() {
		return this.detailPerkawinanDao.list();
	}

	public void createDetailPerkawinan(DetailPerkawinan newDetailPerkawinan) {
		this.detailPerkawinanDao.saveDetailKawin(newDetailPerkawinan);
	}

	public DetailPerkawinanDao getDetailPerkawinanDao() {
		return detailPerkawinanDao;
	}

	public void setDetailPerkawinanDao(DetailPerkawinanDao detailPerkawinanDao) {
		this.detailPerkawinanDao = detailPerkawinanDao;
	}
	
}
