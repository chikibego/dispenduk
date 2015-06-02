package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Ktp;
import java.util.List;

public interface KtpService {
	List<Ktp> list();
	void createKtp(Ktp newKtp);
}
