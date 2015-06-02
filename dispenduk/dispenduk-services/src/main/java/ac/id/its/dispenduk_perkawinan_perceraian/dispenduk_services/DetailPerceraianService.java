package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerceraian;

public interface DetailPerceraianService {
	List<DetailPerceraian> list();
	void createDetailPerceraian(DetailPerceraian newDetailPerceraian);
}
