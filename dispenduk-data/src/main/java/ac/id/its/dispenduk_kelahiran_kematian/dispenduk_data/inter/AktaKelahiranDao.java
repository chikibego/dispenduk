package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.AktaKelahiran;

import java.util.List;
public interface AktaKelahiranDao {
	public List<AktaKelahiran>list();
	public void saveAktaKelahiran(AktaKelahiran aktaKelahiran);
}
