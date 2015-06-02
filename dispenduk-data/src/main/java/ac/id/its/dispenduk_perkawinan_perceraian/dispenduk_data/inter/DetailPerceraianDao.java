package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerceraian;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerkawinan;

public interface DetailPerceraianDao {
	public List<DetailPerceraian> list(); //diisi update juga kl bisa :3
	public void saveDetailCerai(DetailPerceraian detailCerai);
	public List<DetailPerceraian> findById(String idDetailPerceraian);
	public List<DetailPerceraian> findByIdAktaNikah(String idAktaNikah);
}
