package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import java.util.UUID;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DetailPerkawinan;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Perkawinan;

public interface DetailPerkawinanDao {
	public List<DetailPerkawinan> list(); //diisi update juga kl bisa :3
	public void saveDetailKawin(DetailPerkawinan detailKawin);
	public List<DetailPerkawinan> findById(String idDetailPerkawinan);
	public List<DetailPerkawinan> findByIdPerkawinan(String idPerkawinan);
}
