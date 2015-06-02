package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaNikah;

public interface AktaNikahService {

	List<AktaNikah> list();
	void createAktaNikah(AktaNikah newAktaNikah);
}
