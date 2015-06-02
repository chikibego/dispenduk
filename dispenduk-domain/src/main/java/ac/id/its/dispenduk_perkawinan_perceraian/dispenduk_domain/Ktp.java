package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ktp")
public class Ktp {
	/*
	 * Tabel ktp
	 */
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "nomor_registrasi", nullable=false)
	private String nomorRegistrasi;
	
	@Column(name = "unique_id_wn", nullable=false)
	private String uniqueIdWn;

	public String getNomorRegistrasi() {
		return nomorRegistrasi;
	}

	public void setNomorRegistrasi(String nomorRegistrasi) {
		this.nomorRegistrasi = nomorRegistrasi;
	}

	public String getUniqueIdWn() {
		return uniqueIdWn;
	}

	public void setUniqueIdWn(String uniqueIdWn) {
		this.uniqueIdWn = uniqueIdWn;
	}

	public Ktp(String nomorRegistrasi, String uniqueIdWn) {
		this.nomorRegistrasi = nomorRegistrasi;
		this.uniqueIdWn = uniqueIdWn;
	}
	public Ktp(){}

}
