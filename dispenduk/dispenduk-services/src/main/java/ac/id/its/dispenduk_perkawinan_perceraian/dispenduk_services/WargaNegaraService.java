package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.WargaNegara;
import java.util.List;

public interface WargaNegaraService {
	List<WargaNegara> list();
	void createWargaNegara(WargaNegara newWargaNegara);
}
