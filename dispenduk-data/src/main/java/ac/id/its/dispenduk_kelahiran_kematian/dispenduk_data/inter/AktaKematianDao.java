package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.AktaKematian;
import java.util.List;
public interface AktaKematianDao {
	public List<AktaKematian>list();
	public void saveAktaKematian(AktaKematian aktaKematian);
}
