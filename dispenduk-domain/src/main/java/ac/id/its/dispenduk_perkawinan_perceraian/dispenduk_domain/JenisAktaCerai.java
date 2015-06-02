package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="jenis_akta_cerai")

public class JenisAktaCerai {
	/*
	 * Tabel Jenis Akta Cerai
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name="id_jenis_akta_perceraian", nullable=false)
	private String idJenisAktaPerceraian;
	
	//@ManyToOne
	//@JoinColumn(name="id_akta_cerai")
	@Column(name="id_akta_cerai", nullable=false)
	private String idAktaCerai;
	
	@Column(name="jenis_akta_perceraian", length=10, nullable=false)
	private String jenisAktaPerceraian;

	
	public String getIdJenisAktaPerceraian() {
		return idJenisAktaPerceraian;
	}


	public void setIdJenisAktaPerceraian(String idJenisAktaPerceraian) {
		this.idJenisAktaPerceraian = idJenisAktaPerceraian;
	}


	public String getIdAktaCerai() {
		return idAktaCerai;
	}


	public void setIdAktaCerai(String idAktaCerai) {
		this.idAktaCerai = idAktaCerai;
	}


	public String getJenisAktaPerceraian() {
		return jenisAktaPerceraian;
	}


	public void setJenisAktaPerceraian(String jenisAktaPerceraian) {
		this.jenisAktaPerceraian = jenisAktaPerceraian;
	}


	public JenisAktaCerai(String idJenisAktaPerceraian, String idAktaCerai,
			String jenisAktaPerceraian) {
		this.idJenisAktaPerceraian = idJenisAktaPerceraian;
		this.idAktaCerai = idAktaCerai;
		this.jenisAktaPerceraian = jenisAktaPerceraian;
	}


	public JenisAktaCerai(){}
	
}
