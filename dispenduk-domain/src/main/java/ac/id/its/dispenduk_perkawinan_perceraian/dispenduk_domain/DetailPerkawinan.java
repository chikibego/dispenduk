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
@Table(name="detail_perkawinan")

public class DetailPerkawinan {
	/*
	 * Tabel Detail Perkawinan
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name = "id_detail_perkawinan", nullable=false)
	private String idDetailPerkawinan;
	
	//@ManyToOne
	//@JoinColumn(name="id_perkawinan", nullable=false)
	@Column(name="id_perkawinan", nullable=false)
	private String idPerkawinan;
	
	@Column(name="tanggal_pemberangkatan_perkawinan", nullable=true)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalPemberangkatanPerkawinan;
	
	@Column(name="tanggal_pencatatan_perkawinan", nullable=true)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalPencatatanPerkawinan;
	
	@Column(name="organisasi_penghayat_kepercayaan", length=50, nullable=true)
	private String organisasiPenghayatKepercayaan;
	
	@Column(name="tempat_pemberkatan", length=50, nullable=true)
	private String tempatPemberkatan;
	
	@Column(name="nama_badan_peradilan", length=50, nullable=true)
	private String namaBadanPeradilan;
	
	@Column(name="nomor_putusan_penetapan_peradilan", length=50, nullable=true)
	private String nomorPutusanPenetapanPeradilan;
	
	@Column(name="tanggal_putusan_penetapan_peradilan", nullable=true)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tangggalPutusanPenetapanPeradilan;
	
	@Column(name="izin_perwakilan", length=50, nullable=true)
	private String izinPerwakilan;
	
	@Column(name="jumlah_anak", length=3, nullable=true)
	private String jumlahAnak;
	
	@Column(name="pelapor")
	private String pelapor;

	

	public String getIdDetailPerkawinan() {
		return idDetailPerkawinan;
	}
	public void setIdDetailPerkawinan(String idDetailPerkawinan) {
		this.idDetailPerkawinan = idDetailPerkawinan;
	}
	public String getIdPerkawinan() {
		return idPerkawinan;
	}
	public void setIdPerkawinan(String idPerkawinan) {
		this.idPerkawinan = idPerkawinan;
	}
	public Date getTanggalPemberangkatanPerkawinan() {
		return tanggalPemberangkatanPerkawinan;
	}
	public void setTanggalPemberangkatanPerkawinan(
			Date tanggalPemberangkatanPerkawinan) {
		this.tanggalPemberangkatanPerkawinan = tanggalPemberangkatanPerkawinan;
	}
	public Date getTanggalPencatatanPerkawinan() {
		return tanggalPencatatanPerkawinan;
	}
	public void setTanggalPencatatanPerkawinan(Date tanggalPencatatanPerkawinan) {
		this.tanggalPencatatanPerkawinan = tanggalPencatatanPerkawinan;
	}
	public String getOrganisasiPenghayatKepercayaan() {
		return organisasiPenghayatKepercayaan;
	}
	public void setOrganisasiPenghayatKepercayaan(
			String organisasiPenghayatKepercayaan) {
		this.organisasiPenghayatKepercayaan = organisasiPenghayatKepercayaan;
	}
	public String getTempatPemberkatan() {
		return tempatPemberkatan;
	}
	public void setTempatPemberkatan(String tempatPemberkatan) {
		this.tempatPemberkatan = tempatPemberkatan;
	}
	public String getNamaBadanPeradilan() {
		return namaBadanPeradilan;
	}
	public void setNamaBadanPeradilan(String namaBadanPeradilan) {
		this.namaBadanPeradilan = namaBadanPeradilan;
	}
	public String getNomorPutusanPenetapanPeradilan() {
		return nomorPutusanPenetapanPeradilan;
	}
	public void setNomorPutusanPenetapanPeradilan(
			String nomorPutusanPenetapanPeradilan) {
		this.nomorPutusanPenetapanPeradilan = nomorPutusanPenetapanPeradilan;
	}
	public Date getTangggalPutusanPenetapanPeradilan() {
		return tangggalPutusanPenetapanPeradilan;
	}
	public void setTangggalPutusanPenetapanPeradilan(
			Date tangggalPutusanPenetapanPeradilan) {
		this.tangggalPutusanPenetapanPeradilan = tangggalPutusanPenetapanPeradilan;
	}
	public String getIzinPerwakilan() {
		return izinPerwakilan;
	}
	public void setIzinPerwakilan(String izinPerwakilan) {
		this.izinPerwakilan = izinPerwakilan;
	}
	public String getJumlahAnak() {
		return jumlahAnak;
	}
	public void setJumlahAnak(String jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}
	public String getPelapor() {
		return pelapor;
	}
	public void setPelapor(String pelapor) {
		this.pelapor = pelapor;
	}
	
	
	public DetailPerkawinan(String idDetailPerkawinan, String idPerkawinan,
			Date tanggalPemberangkatanPerkawinan,
			Date tanggalPencatatanPerkawinan,
			String organisasiPenghayatKepercayaan, String tempatPemberkatan,
			String namaBadanPeradilan, String nomorPutusanPenetapanPeradilan,
			Date tangggalPutusanPenetapanPeradilan, String izinPerwakilan,
			String jumlahAnak, String pelapor) {
	
		this.idDetailPerkawinan = idDetailPerkawinan;
		this.idPerkawinan = idPerkawinan;
		this.tanggalPemberangkatanPerkawinan = tanggalPemberangkatanPerkawinan;
		this.tanggalPencatatanPerkawinan = tanggalPencatatanPerkawinan;
		this.organisasiPenghayatKepercayaan = organisasiPenghayatKepercayaan;
		this.tempatPemberkatan = tempatPemberkatan;
		this.namaBadanPeradilan = namaBadanPeradilan;
		this.nomorPutusanPenetapanPeradilan = nomorPutusanPenetapanPeradilan;
		this.tangggalPutusanPenetapanPeradilan = tangggalPutusanPenetapanPeradilan;
		this.izinPerwakilan = izinPerwakilan;
		this.jumlahAnak = jumlahAnak;
		this.pelapor = pelapor;
	}
	public DetailPerkawinan(){}
	
}
