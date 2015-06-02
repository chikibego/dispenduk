package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.Wilayah;

import java.util.List;
public interface WilayahDao {
	public List<Wilayah> list();
	public List<Wilayah> findById(int idWilayah);
	public List<Wilayah> findByWilayah(String namaWilayah) ;
	
}
