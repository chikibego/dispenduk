package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.WilayahDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.Wilayah;

@Transactional
@Repository("dataWilayah")
public class HibWilayahDao implements WilayahDao {
	public HibWilayahDao(){}
	private SessionFactory sessionFactory;
	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<Wilayah> list() {
		List<Wilayah> dataWilayah = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Wilayah")
				.list();	
		return dataWilayah;
	}
	
	public List<Wilayah> findById(int idWilayah) {
		List<Wilayah> dataWilayah = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Wilayah where idWilayah = :w")
				.setParameter("w", idWilayah)
				.list();	
		return dataWilayah;
	}
	
	public List<Wilayah> findByWilayah(String namaWilayah) {
		List<Wilayah> dataWilayah = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from Wilayah where namaWilayah = :w")
				.setParameter("w", namaWilayah)
				.list();	
		return dataWilayah;
	}
}
