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
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.DetailPerceraianDao;

@Transactional
@Repository("dataDetailPerceraianDao")

public class HibDetailPerceraianDao implements DetailPerceraianDao{
	
	private SessionFactory sessionFactory;

	public HibDetailPerceraianDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<DetailPerceraian> list() {
		List<DetailPerceraian> detailperceraiandao = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DetailPerceraianDao")
				//.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		
		session.getTransaction().commit();
		
		return detailperceraiandao;
	}
	
	public void saveDetailCerai(DetailPerceraian detailCerai){
		this.getSessionFactory().getCurrentSession().save(detailCerai);
	}

	public List<DetailPerceraian> findById(String idDetailPerceraian) {
		List<DetailPerceraian> dataDetailPerceraian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DetailPerceraian where idDetailPerceraian = :w")
				.setParameter("w", idDetailPerceraian)
				.list();	
		return dataDetailPerceraian;
	}

	public List<DetailPerceraian> findByIdAktaNikah(String idAktaNikah) {
		List<DetailPerceraian> dataDetailPerceraian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from DetailPerceraian where idAktaNikah = :w")
				.setParameter("w", idAktaNikah)
				.list();	
		return dataDetailPerceraian;
	}

}
