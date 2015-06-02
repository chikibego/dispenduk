package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.BerkasKematian;

import java.util.List;
public interface BerkasKematianDao {
	public List<BerkasKematian>list();
	public void saveBerkasKematian(BerkasKematian berkasKematian);
	public List<BerkasKematian>findById(String idBerkasKematian);
}
