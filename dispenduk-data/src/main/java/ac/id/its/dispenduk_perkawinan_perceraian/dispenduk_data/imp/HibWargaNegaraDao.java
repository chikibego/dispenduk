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
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.WargaNegaraDao;

@Transactional
@Repository("dataWargaNegara")

public class HibWargaNegaraDao implements WargaNegaraDao{
private SessionFactory sessionFactory;
	
	public HibWargaNegaraDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<WargaNegara> list() {
		List<WargaNegara> warganegara = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from WargaNegara")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return warganegara;
	}
	
	public void saveWargaNegara(WargaNegara warganegara){
		this.getSessionFactory().getCurrentSession().save(warganegara);
	}
}
