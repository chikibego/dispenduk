package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.JenisAktaNikahDao;

@Transactional
@Repository("dataJenisAktaNikah")

public class HibJenisAktaNikahDao implements JenisAktaNikahDao{
private SessionFactory sessionFactory;
	
	public HibJenisAktaNikahDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<JenisAktaNikah> list() {
		List<JenisAktaNikah> jenisaktanikah = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from JenisAktaNikah")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return jenisaktanikah;
	}
	
	public void saveJenisAktaNikah(JenisAktaNikah jenisAktaNikah){
		this.getSessionFactory().getCurrentSession().save(jenisAktaNikah);
	}
}
