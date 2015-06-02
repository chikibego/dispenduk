package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DokumenPerkawinan;
import java.util.List;

public interface DokumenPerkawinanService {
	List<DokumenPerkawinan> list();
	void createDokumenPerkawinan(DokumenPerkawinan newDokumenPerkawinan);
}
