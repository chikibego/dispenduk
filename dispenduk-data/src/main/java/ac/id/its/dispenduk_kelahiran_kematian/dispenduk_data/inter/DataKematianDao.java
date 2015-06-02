package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKematian;

import java.util.List;
public interface DataKematianDao {
	public List<DataKematian>list();
	public void saveDataKematian(DataKematian dataKematian);
	public void setValidasiRt(String idPengajuanKematian);
	public void setValidasiRw(String idPengajuanKematian);
	public void setValidasiLurah(String idPengajuanKematian);
	public void setValidasiDispenduk(String idPengajuanKematian);
	public void hapusDataKematian(String idPengajuanKematian);
	public List<DataKematian> findById(String idPengajuanKematian);
	public List<DataKematian> findByIdJenazah(String idWnJenazah);
	public List<DataKematian> findByIdPengaju(String idPengaju);
	public List<DataKematian> findByAkteMati(String idAkteMati);
}
