package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.*;


import java.util.List;
public  interface DataDao {
	//dummy case
	public List<Data_Kelahiran> list();
	public void save(Data_Kelahiran data_Kelahiran);
	//akta kelahiran insert
	public List<AktaKelahiran> list_akta_kelahiran();
	public void save_akta_kelahiran(AktaKelahiran akta_kelahiran);
	public List<AktaKelahiran> findByName(String ax);
	//data kelahiran insert
	public List<DataKelahiran1> list_data_kelahiran();
	public void save_data_kelahiran(DataKelahiran1 data_kelahiran);
	//data kematian insert
	public List<DataKematian> list_data_kematian();
	public void save_data_kematian(DataKematian data_kematian);
}
