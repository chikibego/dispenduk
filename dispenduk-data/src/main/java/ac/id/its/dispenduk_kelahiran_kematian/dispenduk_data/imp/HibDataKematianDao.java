package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.DataKematianDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKematian;
@Transactional
@Repository("dataKematian")
public class HibDataKematianDao implements DataKematianDao{
	public HibDataKematianDao() {
	}

	private SessionFactory sessionFactory;
	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<DataKematian> list() {
		List<DataKematian> dataKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKematian")
				.list();	
		return dataKematian;
	}
	
	public void saveDataKematian(DataKematian dataKematian){
		this.getSessionFactory().getCurrentSession().save(dataKematian);
	}
	
	//set validasi kematian
	public void setValidasiRt(String idPengajuanKematian)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKematian set validasiRtKematian = :val" + " where idPengajuanKematian = :id");
		query.setParameter("id", idPengajuanKematian);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	public void setValidasiRw(String idPengajuanKematian)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKematian set validasiRwKematian = :val" + " where idPengajuanKematian = :id");
		query.setParameter("id", idPengajuanKematian);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	public void setValidasiLurah(String idPengajuanKematian)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKematian set validasiLurahKematian = :val" + " where idPengajuanKematian = :id");
		query.setParameter("id", idPengajuanKematian);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	public void setValidasiDispenduk(String idPengajuanKematian)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKematian set validasiDispenduk = :val" + " where idPengajuanKematian = :id");
		query.setParameter("id", idPengajuanKematian);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	//hapus data kematian
	public void hapusDataKematian(String idPengajuanKematian)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKematian set hapusKematian = :val" + " where idPengajuanKematian = :id");
		query.setParameter("id", idPengajuanKematian);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	//ambil data 
	//sesuai idPengajuanKematian
	public List<DataKematian> findById(String idPengajuanKematian) {
		List<DataKematian> dataKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKematian where idPengajuanKematian = :w")
				.setParameter("w", idPengajuanKematian)
				.list();	
		return dataKematian;
	}
	//sesuai dengan idWnJenazah
	public List<DataKematian> findByIdJenazah(String idWnJenazah) {
		List<DataKematian> dataKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKematian where idWnJenazah= :w")
				.setParameter("w", idWnJenazah)
				.list();	
		return dataKematian;
	}
	//sesuai dengan idPengaju
	public List<DataKematian> findByIdPengaju(String idPengaju) {
		List<DataKematian> dataKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKematian where idWnPengaju= :w")
				.setParameter("w", idPengaju)
				.list();	
		return dataKematian;
	}
	//sesuai dengan idAkteMati
	public List<DataKematian> findByAkteMati(String idAkteMati) {
		List<DataKematian> dataKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKematian where idAkteMati= :w")
				.setParameter("w", idAkteMati)
				.list();	
		return dataKematian;
	}
}
