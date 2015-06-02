package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="akta_nikah")

public class AktaNikah {
	/*
	 * Tabel Akta Nikah
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name="id_akta_nikah", nullable=false)
	private String idAktaNikah;
	
	@Column(name="id_wilayah", nullable=false)
	private Integer idWilayah;

	@Column(name="id_perkawinan", nullable=false)
	private String idPerkawinan;
	
	@Column(name="tanggal_terbit", nullable=false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalTerbit;
	
	@Column(name="tempat_terbit", length=100, nullable=false)
	private String tempatTerbit;
	
	@Column(name="tanggal_nikah", nullable=false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalNikah;
	
	@Column(name="pemuka_agama", nullable=false)
	private String pemukaAgama;
	
	@Column(name="suami", nullable=false)
	private String suami;
	
	@Column(name="istri", nullable=false)
	private String istri;

	public String getIdAktaNikah() {
		return idAktaNikah;
	}

	public void setIdAktaNikah(String idAktaNikah) {
		this.idAktaNikah = idAktaNikah;
	}

	public Integer getIdWilayah() {
		return idWilayah;
	}

	public void setIdWilayah(Integer idWilayah) {
		this.idWilayah = idWilayah;
	}

	public String getIdPerkawinan() {
		return idPerkawinan;
	}

	public void setIdPerkawinan(String idPerkawinan) {
		this.idPerkawinan = idPerkawinan;
	}

	public Date getTanggalTerbit() {
		return tanggalTerbit;
	}

	public void setTanggalTerbit(Date tanggalTerbit) {
		this.tanggalTerbit = tanggalTerbit;
	}

	public String getTempatTerbit() {
		return tempatTerbit;
	}

	public void setTempatTerbit(String tempatTerbit) {
		this.tempatTerbit = tempatTerbit;
	}

	public Date getTanggalNikah() {
		return tanggalNikah;
	}

	public void setTanggalNikah(Date tanggalNikah) {
		this.tanggalNikah = tanggalNikah;
	}

	public String getPemukaAgama() {
		return pemukaAgama;
	}

	public void setPemukaAgama(String pemukaAgama) {
		this.pemukaAgama = pemukaAgama;
	}

	public String getSuami() {
		return suami;
	}

	public void setSuami(String suami) {
		this.suami = suami;
	}

	public String getIstri() {
		return istri;
	}

	public void setIstri(String istri) {
		this.istri = istri;
	}

	public AktaNikah(String idAktaNikah, Integer idWilayah, String idPerkawinan,
			Date tanggalTerbit, String tempatTerbit, Date tanggalNikah,
			String pemukaAgama, String suami, String istri) {
		this.idAktaNikah = idAktaNikah;
		this.idWilayah = idWilayah;
		this.idPerkawinan = idPerkawinan;
		this.tanggalTerbit = tanggalTerbit;
		this.tempatTerbit = tempatTerbit;
		this.tanggalNikah = tanggalNikah;
		this.pemukaAgama = pemukaAgama;
		this.suami = suami;
		this.istri = istri;
	}
	public AktaNikah(){}
	
}
