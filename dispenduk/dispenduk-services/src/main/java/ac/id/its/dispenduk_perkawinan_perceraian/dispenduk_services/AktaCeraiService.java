package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaCerai;

public interface AktaCeraiService {

	List<AktaCerai> list();
	void createAktaCerai(AktaCerai newAktaCerai);
}
