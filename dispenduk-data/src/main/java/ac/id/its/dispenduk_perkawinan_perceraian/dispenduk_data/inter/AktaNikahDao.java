package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaNikah;

public interface AktaNikahDao {
	public List<AktaNikah> listAktaNikah();
	public void saveAktaNikah(AktaNikah aktaNikah);
}
