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
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.AktaNikahDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.JenisAktaCeraiDao;

@Transactional
@Repository("dataJenisAktaCerai")

public class HibJenisAktaCeraiDao implements JenisAktaCeraiDao{

private SessionFactory sessionFactory;
	
	public HibJenisAktaCeraiDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<JenisAktaCerai> list() {
		List<JenisAktaCerai> jenisaktacerai = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from JenisAktaCerai")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return jenisaktacerai;
	}
	
	public void saveJenisAktaCerai(JenisAktaCerai jenisAktaCerai){
		this.getSessionFactory().getCurrentSession().save(jenisAktaCerai);
	}
}
