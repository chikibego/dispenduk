package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Agama;
import java.util.List;

public interface AgamaService {
	List<Agama> list();
	void createAgama(Agama newAgama);
}
