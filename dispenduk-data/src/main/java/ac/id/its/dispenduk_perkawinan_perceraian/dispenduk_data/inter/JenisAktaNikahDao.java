package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.JenisAktaNikah;

public interface JenisAktaNikahDao {
	public List<JenisAktaNikah> list();
	public void saveJenisAktaNikah(JenisAktaNikah jenisAktaNikah);
}
