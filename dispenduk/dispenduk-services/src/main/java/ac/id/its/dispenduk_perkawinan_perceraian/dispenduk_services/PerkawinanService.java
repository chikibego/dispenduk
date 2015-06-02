package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Perkawinan;
import java.util.List;;

public interface PerkawinanService {
	List<Perkawinan> list();
	void createPerkawinan(Perkawinan newPerkawinan);
	void setPerceraian();
	void validasiPerkawinan();
	void hapusPerkawinan();
}
