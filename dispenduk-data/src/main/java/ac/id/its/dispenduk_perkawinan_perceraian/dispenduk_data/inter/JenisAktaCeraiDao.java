package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.JenisAktaCerai;;

public interface JenisAktaCeraiDao {
	public List<JenisAktaCerai> list();
	public void saveJenisAktaCerai(JenisAktaCerai jenisAktaCerai);
}
