package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaCerai;

public interface AktaCeraiDao {
	public List<AktaCerai> list();
	public void saveAktaCerai(AktaCerai aktaCerai);
}
