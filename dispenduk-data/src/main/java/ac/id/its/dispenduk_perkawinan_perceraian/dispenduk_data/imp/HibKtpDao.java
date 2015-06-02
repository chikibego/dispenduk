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
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.KtpDao;

@Transactional
@Repository("dataKtp")

public class HibKtpDao implements KtpDao{

private SessionFactory sessionFactory;
	
	public HibKtpDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<Ktp> list() {
		List<Ktp> ktp = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Ktp")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return ktp;
	}
	
	public void saveKtp(Ktp ktp){
		this.getSessionFactory().getCurrentSession().save(ktp);
	}
}
