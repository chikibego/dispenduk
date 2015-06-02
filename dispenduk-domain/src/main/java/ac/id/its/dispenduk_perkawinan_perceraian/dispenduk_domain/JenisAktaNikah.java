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
@Table(name="jenis_akta_nikah")

public class JenisAktaNikah {
	/*
	 * Tabel Jenis Akta Nikah
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name="id_jenis_akta_nikah", nullable=false)
	private String idJenisAktaNikah;
	
	//@ManyToOne
	//@JoinColumn(name="id_akta_nikah", nullable=false)
	@Column(name="id_akta_nikah", nullable=false)
	private String idAktaNikah;
	
	@Column(name="jenis_akta_nikah", length=10, nullable=true)
	private String jenisAktaNikah;

	public String getIdJenisAktaNikah() {
		return idJenisAktaNikah;
	}

	public void setIdJenisAktaNikah(String idJenisAktaNikah) {
		this.idJenisAktaNikah = idJenisAktaNikah;
	}

	public String getIdAktaNikah() {
		return idAktaNikah;
	}

	public void setIdAktaNikah(String idAktaNikah) {
		this.idAktaNikah = idAktaNikah;
	}

	public String getJenisAktaNikah() {
		return jenisAktaNikah;
	}

	public void setJenisAktaNikah(String jenisAktaNikah) {
		this.jenisAktaNikah = jenisAktaNikah;
	}

	public JenisAktaNikah(String idJenisAktaNikah, String idAktaNikah,
			String jenisAktaNikah) {
		this.idJenisAktaNikah = idJenisAktaNikah;
		this.idAktaNikah = idAktaNikah;
		this.jenisAktaNikah = jenisAktaNikah;
	}

	public JenisAktaNikah(){};
}
