package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Perkawinan;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.PerkawinanDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.PerkawinanService;

public class PerkawinanServiceImpl implements PerkawinanService{
	private PerkawinanDao perkawinanDao;
	
	public PerkawinanServiceImpl() {
	}

	public List<Perkawinan> list() {
		return this.perkawinanDao.list();
	}

	public void createPerkawinan(Perkawinan newPerkawinan) {
		this.perkawinanDao.savePerkawinan(newPerkawinan);
	}

	public void setPerceraian() {
		//button cerai clicked -> "true"
		//else "false"
		this.perkawinanDao.setFlagCerai("true");
	}
	
	public void validasiPerkawinan() {
		//button validasi clicked -> "true"
		//else "false"
		this.perkawinanDao.setFlagValidasi("true");
	}

	public void hapusPerkawinan() {
		//button hapus clicked -> "true"
		//else "false"
		this.perkawinanDao.setHapusPerkawinan("true");
	}
	
	public PerkawinanDao getPerkawinanDao() {
		return perkawinanDao;
	}

	public void setPerkawinanDao(PerkawinanDao perkawinanDao) {
		this.perkawinanDao = perkawinanDao;
	}
	
}
