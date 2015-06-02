package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.AktaKematianDao;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.AktaKematian;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.DataKelahiran1;

@Transactional
@Repository("dataAktaKematian")
public class HibAktaKematianDao implements AktaKematianDao{
	public HibAktaKematianDao() {
	}
	private SessionFactory sessionFactory;

	@Resource(name="sessionFactory")
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public List<AktaKematian> list() {
		List<AktaKematian> aktaKematian = this.getSessionFactory()
				.getCurrentSession()
				.createQuery("from AktaKematian")
				.list();	
		return aktaKematian;
	}
	public void saveAktaKematian(AktaKematian aktaKematian){
		this.getSessionFactory().getCurrentSession().save(aktaKematian);
	}
}
