package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.imp;


import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.DataKelahiranDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKematian;
@Transactional
@Repository("dataKelahiran")
public class HibDataKelahiranDao implements DataKelahiranDao {
	private SessionFactory sessionFactory;

	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public List<DataKelahiran1> list() {
		List<DataKelahiran1> dataKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKelahiran")
				.list();	
		return dataKelahiran;
	}
	public void saveDataKelahiran(DataKelahiran1 dataKelahiran1){
		this.getSessionFactory().getCurrentSession().save(dataKelahiran1);
	}
	
	//set validasi
	public void setValidasiRt(String idPengajuanKelahiran)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKelahiran1 set validasiRtKelahiran = :val" + " where idPengajuanKelahiran = :id");
		query.setParameter("id", idPengajuanKelahiran);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	public void setValidasiRw(String idPengajuanKelahiran)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKelahiran1 set validasiRwKelahiran = :val" + " where idPengajuanKelahiran = :id");
		query.setParameter("id", idPengajuanKelahiran);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	public void setValidasiDispenduk(String idPengajuanKelahiran)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKelahiran1 set validasiDispendukKelahiran = :val" + " where idPengajuanKelahiran = :id");
		query.setParameter("id", idPengajuanKelahiran);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	public void setValidasiLurah(String idPengajuanKelahiran)
	{

		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKelahiran1 set validasiLurahKelahiran = :val" + " where idPengajuanKelahiran = :id");
		query.setParameter("id", idPengajuanKelahiran);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	//set hapus
	public void setHapusKelahiran(String idPengajuanKelahiran)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update DataKelahiran1 set hapusKelahiran = :val" + " where idPengajuanKelahiran = :id");
		query.setParameter("id", idPengajuanKelahiran);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	//Pencarian Data Kelahiran
	//Sesuai dengan idPengajuanKelahiran
	public List<DataKelahiran1> findById(String idPengajuanKelahiran){
		List<DataKelahiran1> dataKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKelahiran1 where idPengajuanKelahiran = :w")
				.setParameter("w", idPengajuanKelahiran)
				.list();	
		return dataKelahiran;
	}
	//Sesuai dengan idPengajuanKematian
	public List<DataKelahiran1> findByPengajuanKematian(String idPengajuanKematian){
		List<DataKelahiran1> dataKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKelahiran1 where idPengajuanKematian = :w")
				.setParameter("w", idPengajuanKematian)
				.list();	
		return dataKelahiran;
	}
	//Sesuai dengan idIbu
	public List<DataKelahiran1> findByIdIbu(String idWnIbu){
		List<DataKelahiran1> dataKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKelahiran1 where idWnIbu = :w")
				.setParameter("w", idWnIbu)
				.list();	
		return dataKelahiran;
	}
	//Sesuai dengan idPengaju
	public List<DataKelahiran1> findByIdPengaju(String idWnPengaju){
		List<DataKelahiran1> dataKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DataKelahiran1 where idWnPengaju = :w")
				.setParameter("w", idWnPengaju)
				.list();	
		return dataKelahiran;
	}
}

