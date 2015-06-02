package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerkawinan;

public interface DetailPerkawinanService {
	List<DetailPerkawinan> list();
	void createDetailPerkawinan(DetailPerkawinan newDetailPerkawinan);
}
