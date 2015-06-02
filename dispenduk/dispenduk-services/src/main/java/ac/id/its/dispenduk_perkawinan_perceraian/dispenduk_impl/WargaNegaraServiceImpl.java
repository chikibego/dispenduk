package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_impl;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.WargaNegara;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.WargaNegaraDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.WargaNegaraService;

public class WargaNegaraServiceImpl implements WargaNegaraService {
	private WargaNegaraDao wargaNegaraDao;
	
	public WargaNegaraServiceImpl() {
		
	}

	public List<WargaNegara> list() {
		return this.wargaNegaraDao.list();
	}

	public void createWargaNegara(WargaNegara newWargaNegara) {
		this.wargaNegaraDao.saveWargaNegara(newWargaNegara);
	}

	public WargaNegaraDao getWargaNegaraDao() {
		return wargaNegaraDao;
	}

	public void setWargaNegaraDao(WargaNegaraDao wargaNegaraDao) {
		this.wargaNegaraDao = wargaNegaraDao;
	}
	
}
