package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="agama")
public class Agama {
	/*
	 * Tabel Agama
	 */
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "id_agama", nullable = false)
	//private UUID idAgama;
	private String idAgama;
	
	@Column(name = "jenis_agama")
	private String jenisAgama;

	public String getIdAgama() {
		return idAgama;
	}

	public void setIdAgama(String idAgama) {
		this.idAgama = idAgama;
	}

	public String getJenisAgama() {
		return jenisAgama;
	}

	public void setJenisAgama(String jenisAgama) {
		this.jenisAgama = jenisAgama;
	}

	public Agama(String idAgama, String jenisAgama) {
		this.idAgama = idAgama;
		this.jenisAgama = jenisAgama;
	}
	public Agama(){}
}
