package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import java.util.UUID;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Perkawinan;

public interface PerkawinanDao {
	public List<Perkawinan> list();
	public void savePerkawinan(Perkawinan perkawinan);
	public void setFlagCerai(String idPerkawinan);
	public void setFlagValidasi(String idPerkawinan);
	public void setHapusPerkawinan(String idPerkawinan);
	public List<Perkawinan> findById(String idPerkawinan);
	public List<Perkawinan> findByIdSuami(String suami);
}
