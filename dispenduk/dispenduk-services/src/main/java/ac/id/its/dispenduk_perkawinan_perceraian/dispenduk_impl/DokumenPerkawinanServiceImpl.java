package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DokumenPerkawinan;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DokumenPerkawinanDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.DokumenPerkawinanService;

public class DokumenPerkawinanServiceImpl implements DokumenPerkawinanService {
	private DokumenPerkawinanDao dokumenPerkawinanDao;

	public DokumenPerkawinanServiceImpl() {
	}

	public List<DokumenPerkawinan> list() {
		return this.dokumenPerkawinanDao.list();
	}

	public void createDokumenPerkawinan(DokumenPerkawinan newDokumenPerkawinan) {
		this.dokumenPerkawinanDao.saveDokumenKawin(newDokumenPerkawinan);
	}

	public DokumenPerkawinanDao getDokumenPerkawinanDao() {
		return dokumenPerkawinanDao;
	}

	public void setDokumenPerkawinanDao(DokumenPerkawinanDao dokumenPerkawinanDao) {
		this.dokumenPerkawinanDao = dokumenPerkawinanDao;
	}
	
}
