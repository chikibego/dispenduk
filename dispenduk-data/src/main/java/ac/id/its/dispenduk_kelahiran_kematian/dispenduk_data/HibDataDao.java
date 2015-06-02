package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data;



import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.DataDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.*;

@Transactional
@Repository("dataDao")
public class HibDataDao implements DataDao{
	private SessionFactory sessionFactory;
	
	public HibDataDao(){
		
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly=true)
	public List<Data_Kelahiran> list() {
		List<Data_Kelahiran> data_Kelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from data_kelahiran")
				.list();
		
		return data_Kelahiran;
	}
	
	public void save(Data_Kelahiran data_Kelahiran) {
		this.getSessionFactory().getCurrentSession().save(data_Kelahiran);
		
	}
	@Transactional(readOnly=true)
	public List<AktaKelahiran> list_akta_kelahiran() {
		List<AktaKelahiran> akta_Kelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from akta_kelahiran")
				.list();
		
		return akta_Kelahiran;
	}
	
	public void save_akta_kelahiran(AktaKelahiran akta_kelahiran) {
		this.getSessionFactory().getCurrentSession().save(akta_kelahiran);
	}
	
	@Transactional(readOnly=true)
	public List<DataKelahiran1> list_data_kelahiran() {
		List<DataKelahiran1> data_Kelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from data_kelahiran1")
				.list();
		
		return data_Kelahiran;
	}
	
	public void save_data_kelahiran(DataKelahiran1 data_Kelahiran1){
		this.getSessionFactory().getCurrentSession().save(data_Kelahiran1);
	}
	
	@Transactional(readOnly=true)
	public List <DataKematian> list_data_kematian() {
		List<DataKematian> data_Kematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKematian")
				.list();
		
		return data_Kematian;
	}
	
	public void save_data_kematian(DataKematian data_kematian){
		this.getSessionFactory().getCurrentSession().save(data_kematian);
	}
	
	@Transactional(readOnly=true)
	public List<AktaKelahiran> findByName(String idWilayah) {
		List<AktaKelahiran> aktaKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from akte_kelahiran").list();
		
		return aktaKelahiran;
	}
}
