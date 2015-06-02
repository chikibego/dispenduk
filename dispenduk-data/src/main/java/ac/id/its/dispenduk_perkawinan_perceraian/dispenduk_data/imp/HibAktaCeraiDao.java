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
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.AktaCeraiDao;

@Transactional
@Repository("dataAktaiCerai")

public class HibAktaCeraiDao implements AktaCeraiDao{

private SessionFactory sessionFactory;
	
	public HibAktaCeraiDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<AktaCerai> list() {
		List<AktaCerai> aktacerai = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from AktaCerai")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return aktacerai;
	}
	
	public void saveAktaCerai(AktaCerai aktacerai){
		this.getSessionFactory().getCurrentSession().save(aktacerai);
	}

}
