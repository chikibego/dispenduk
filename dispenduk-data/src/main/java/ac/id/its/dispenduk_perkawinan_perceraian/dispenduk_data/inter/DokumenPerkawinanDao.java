package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.DokumenPerkawinan;

public interface DokumenPerkawinanDao {
	public List<DokumenPerkawinan> list();
	public void saveDokumenKawin(DokumenPerkawinan dokumenKawin);
}
