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
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DetailPerkawinanDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DokumenPerkawinanDao;

@Transactional
@Repository("dataDokumenPerkawinanDao")

public class HibDokumenPerkawinanDao implements DokumenPerkawinanDao{

	private SessionFactory sessionFactory;

	public HibDokumenPerkawinanDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<DokumenPerkawinan> list() {
		List<DokumenPerkawinan> dokumenperkawinandao = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DokumenPerkawinanDao")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return dokumenperkawinandao;
	}
	
	public void saveDokumenKawin(DokumenPerkawinan dokumenKawin){
		this.getSessionFactory().getCurrentSession().save(dokumenKawin);
	}



}
