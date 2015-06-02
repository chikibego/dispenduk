package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;

import java.util.List;
public interface DataKelahiranDao {
	public List<DataKelahiran1>list();
	public void saveDataKelahiran(DataKelahiran1 dataKelahiran1);
	public void setValidasiLurah(String idPengajuanKelahiran);
	public void setValidasiDispenduk(String idPengajuanKelahiran);
	public void setValidasiRw(String idPengajuanKelahiran);
	public void setValidasiRt(String idPengajuanKelahiran);
	public void setHapusKelahiran(String idPengajuanKelahiran);
	public List<DataKelahiran1> findById(String idPengajuanKelahiran);
	public List<DataKelahiran1> findByPengajuanKematian(String idPengajuanKematian);
	public List<DataKelahiran1> findByIdIbu(String idWnIbu);
	public List<DataKelahiran1> findByIdPengaju(String idWnPengaju);
}
