package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter;

import java.util.List;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Ktp;

public interface KtpDao {
	public List<Ktp> list();
	public void saveKtp(Ktp ktp);
}
