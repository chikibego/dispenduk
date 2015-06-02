package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.imp;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DetailPerceraianDao;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DetailPerkawinanDao;

@Transactional
@Repository("dataDetailPerkawinanDao")

public class HibDetailPerkawinanDao implements DetailPerkawinanDao{
	
	private SessionFactory sessionFactory;

	public HibDetailPerkawinanDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<DetailPerkawinan> list() {
		List<DetailPerkawinan> detailperkawinandao = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DetailPerkawinanDao")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return detailperkawinandao;
	}
	
	public List<DetailPerkawinan> findByIdPerkawinan(String idPerkawinan){
		List<DetailPerkawinan> dataDetailPerkawinan = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DetailPerkawinan where idPerkawinan = :w")
				.setParameter("w", idPerkawinan)
				.list();	
		return dataDetailPerkawinan;
	}

	public List<DetailPerkawinan> findById(String idDetailPerkawinan) {
		List<DetailPerkawinan> dataDetailPerkawinan = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DetailPerkawinan where idDetailPerkawinan = :w")
				.setParameter("w", idDetailPerkawinan)
				.list();	
		return dataDetailPerkawinan;
	}
	
	public void saveDetailKawin(DetailPerkawinan detailKawin){
		this.getSessionFactory().getCurrentSession().save(detailKawin);
	}

}
