package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.WargaNegara;

public interface WargaNegaraDao {
	public List<WargaNegara> list();
	public void saveWargaNegara(WargaNegara wargaNegara);
}
