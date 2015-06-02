package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.BerkasKematianDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.BerkasKematian;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;

@Transactional
@Repository("dataBerkasKematian")
public class HibBerkasKematianDao implements BerkasKematianDao{
	public HibBerkasKematianDao() {
	}
	
	private SessionFactory sessionFactory;
	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<BerkasKematian> list() {
		List<BerkasKematian> berkasKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from BerkasKematian")
				.list();	
		return berkasKematian;
	}
	
	public void saveBerkasKematian(BerkasKematian berkasKematian){
		this.getSessionFactory().getCurrentSession().save(berkasKematian);
	}
	
	public List<BerkasKematian> findById(String idBerkasKematian)
	{
		List<BerkasKematian> berkasKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from BerkasKematian where idBerkasKematian = :w")
				.setParameter("w", idBerkasKematian)
				.list();
		
		return berkasKematian;
	}
}
