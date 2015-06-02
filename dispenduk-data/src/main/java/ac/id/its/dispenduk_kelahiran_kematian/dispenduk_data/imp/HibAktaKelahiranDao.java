package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.AktaKelahiranDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.AktaKelahiran;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;

@Transactional
@Repository("dataAktaKelahiran")
public class HibAktaKelahiranDao implements AktaKelahiranDao{

	private SessionFactory sessionFactory;
	
	public HibAktaKelahiranDao() {
	}

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<AktaKelahiran> list() {
		List<AktaKelahiran> aktaKelahiran = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from AktaKelahiran a where a.idWilayah = (:x) ")
				.setParameter("x",2 )
				.list();
		Session session = getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update AktaKelahiran set idWilayah = :studentName" + " where idPengajuanKelahiran = :studentId");
		query.setParameter("studentName", 2);
		query.setParameter("studentId", "1");
		int result = query.executeUpdate();
		session.getTransaction().commit();
		
		return aktaKelahiran;
	}
	
	public void saveAktaKelahiran(AktaKelahiran aktaKelahiran){
		this.getSessionFactory().getCurrentSession().save(aktaKelahiran);
	}
}
