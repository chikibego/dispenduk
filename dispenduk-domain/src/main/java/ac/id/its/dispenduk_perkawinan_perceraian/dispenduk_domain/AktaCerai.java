package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="akta_cerai")

public class AktaCerai {
	/*
	 * Tabel Akta Cerai
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name = "id_akta_cerai", nullable=false)
	//private UUID idAktaCerai;
	private String idAktaCerai;
	
	//@ManyToOne
	//@JoinColumn(name="id_detail_perceraian", nullable=false)
	@Column(name="id_detail_perceraian", nullable=false)
	private String idDetailPerceraian;
	
	@Column(name="id_wilayah", nullable=false)
	private Integer idWilayah;
	
	@Column(name="tanggal_terbit", nullable=false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalTerbit;
	
	@Column(name="tempat_terbit", length=100, nullable=false)
	private String tempatTerbit;
	
	@Column(name="tanggal_cerai", nullable=false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalCerai;
	
	@Column(name="tanggal_putusan", nullable=false)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalPutusan;
	
	@Column(name="nomor_putusan", length=100, nullable=false)
	private String nomorPutusan;
	
	public String getIdAktaCerai() {
		return idAktaCerai;
	}
	public void setIdAktaCerai(String idAktaCerai) {
		this.idAktaCerai = idAktaCerai;
	}
	public String getIdDetailPerceraian() {
		return idDetailPerceraian;
	}
	public void setIdDetailPerceraian(String idDetailPerceraian) {
		this.idDetailPerceraian = idDetailPerceraian;
	}
	public Integer getIdWilayah() {
		return idWilayah;
	}
	public void setIdWilayah(Integer idWilayah) {
		this.idWilayah = idWilayah;
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
	public Date getTanggalCerai() {
		return tanggalCerai;
	}
	public void setTanggalCerai(Date tanggalCerai) {
		this.tanggalCerai = tanggalCerai;
	}
	public Date getTanggalPutusan() {
		return tanggalPutusan;
	}
	public void setTanggalPutusan(Date tanggalPutusan) {
		this.tanggalPutusan = tanggalPutusan;
	}
	public String getNomorPutusan() {
		return nomorPutusan;
	}
	public void setNomorPutusan(String nomorPutusan) {
		this.nomorPutusan = nomorPutusan;
	}
	
	public AktaCerai(String idAktaCerai, String idDetailPerceraian,
			Integer idWilayah, Date tanggalTerbit, String tempatTerbit,
			Date tanggalCerai, Date tanggalPutusan, String nomorPutusan) {
		this.idAktaCerai = idAktaCerai;
		this.idDetailPerceraian = idDetailPerceraian;
		this.idWilayah = idWilayah;
		this.tanggalTerbit = tanggalTerbit;
		this.tempatTerbit = tempatTerbit;
		this.tanggalCerai = tanggalCerai;
		this.tanggalPutusan = tanggalPutusan;
		this.nomorPutusan = nomorPutusan;
	}
	public AktaCerai(){}
	
}
