package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "warga_negara")
public class WargaNegara {
	/*
	 * Tabel Warga Negara
	 */
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "unique_id_wn", nullable=false)
	private UUID uniqueIdWn;
	
	@Column(name = "id_agama", nullable=false)
	private UUID idAgama;
	
	@Column(name = "nik", nullable=false)
	private UUID nik;
	
	@Column(name = "nama", nullable=false)
	private String nama;

	public UUID getUniqueIdWn() {
		return uniqueIdWn;
	}

	public void setUniqueIdWn(UUID uniqueIdWn) {
		this.uniqueIdWn = uniqueIdWn;
	}

	public UUID getIdAgama() {
		return idAgama;
	}

	public void setIdAgama(UUID idAgama) {
		this.idAgama = idAgama;
	}

	public UUID getNik() {
		return nik;
	}

	public void setNik(UUID nik) {
		this.nik = nik;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public WargaNegara(UUID uniqueIdWn, UUID idAgama, UUID nik, String nama) {
		this.uniqueIdWn = uniqueIdWn;
		this.idAgama = idAgama;
		this.nik = nik;
		this.nama = nama;
	}
	public WargaNegara(){}
}
