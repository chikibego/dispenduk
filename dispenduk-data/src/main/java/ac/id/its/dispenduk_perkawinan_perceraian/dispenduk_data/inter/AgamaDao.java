package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Agama;

public interface AgamaDao {
	public List<Agama> list();
	public void saveAgama(Agama agama);
}
