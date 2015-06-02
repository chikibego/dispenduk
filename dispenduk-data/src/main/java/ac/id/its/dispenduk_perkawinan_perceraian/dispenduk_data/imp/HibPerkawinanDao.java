package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.PerkawinanDao;

@Transactional
@Repository("dataPerkawinan")

public class HibPerkawinanDao {

private SessionFactory sessionFactory;
	
	public HibPerkawinanDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<Perkawinan> list() {
		List<Perkawinan> perkawinan = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Perkawinan")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return perkawinan;
	}
	
	public void savePerkawinan(Perkawinan perkawinan){
		this.getSessionFactory().getCurrentSession().save(perkawinan);
	}
	
	public void setFlagCerai(String idPerkawinan)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update Perkawinan set flagCerai = :val" + " where idPerkawinan = :id");
		query.setParameter("id", idPerkawinan);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	
	public void setFlagValidasi(String idPerkawinan)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update Perkawinan set flagValidasi = :val" + " where idPerkawinan = :id");
		query.setParameter("id", idPerkawinan);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	
	public void setHapusCerai(String idPerkawinan)
	{
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update Perkawinan set flagHapus = :val" + " where idPerkawinan = :id");
		query.setParameter("id", idPerkawinan);
		query.setParameter("val", true);
		int result = query.executeUpdate();
		session.getTransaction().commit();
	}
	
	public List<Perkawinan> findByIdSuami(String suami){
		List<Perkawinan> dataPerkawinan = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Perkawinan where suami = :w")
				.setParameter("w", suami)
				.list();	
		return dataPerkawinan;
	}
	
	public List<Perkawinan> findById(String idPerkawinan){
		List<Perkawinan> dataPerkawinan = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Perkawinan where idPerkawinan = :w")
				.setParameter("w", idPerkawinan)
				.list();	
		return dataPerkawinan;
	}
}
