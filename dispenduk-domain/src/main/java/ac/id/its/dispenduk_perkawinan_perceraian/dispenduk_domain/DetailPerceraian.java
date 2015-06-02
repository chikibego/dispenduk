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
@Table(name="detail_perceraian")
public class DetailPerceraian {
	/*
	 * Tabel Detail Perceraian
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name = "id_detail_perceraian", nullable=false)
	private String idDetailPerceraian;
	
	//@ManyToOne
	//@JoinColumn(name="id_akta_nikah", nullable=false)
	@Column(name="id_akta_nikah", nullable=false)
	private String idAktaNikah;
	
	@Column(name="pelapor_perceraian")
	private String pelaporPerceraian;
	
	@Column(name="nomor_putusan_pengadilan", length=100, nullable=true)
	private String nomorPutusanPengadilan;
	
	@Column(name="tanggal_putusan_pengadilan", nullable=true)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalPutusanPengadilan;
	
	@Column(name="tingkat_pengadilan_perkara", length=200, nullable=true)
	private String tingkatPengadilanPerkara;
	
	@Column(name="tempat_kedudukan_peradilan", length=200, nullable=true)
	private int tempatKedudukanPeradilan;
	
	@Column(name="nama_lembaga_peradilan_perceraian", length=200, nullable=true)
	private String namaLembagaPeradilanPerceraian;
	
	@Column(name="sebab_perceraian", length=500, nullable=true)
	private String sebabPerceraian;
	
	@Column(name="tanggal_pelapor", nullable=true)
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private Date tanggalPelapor;

	
	public String getIdDetailPerceraian() {
		return idDetailPerceraian;
	}
	public void setIdDetailPerceraian(String idDetailPerceraian) {
		this.idDetailPerceraian = idDetailPerceraian;
	}
	public String getIdAktaNikah() {
		return idAktaNikah;
	}
	public void setIdAktaNikah(String idAktaNikah) {
		this.idAktaNikah = idAktaNikah;
	}
	public String getPelaporPerceraian() {
		return pelaporPerceraian;
	}
	public void setPelaporPerceraian(String pelaporPerceraian) {
		this.pelaporPerceraian = pelaporPerceraian;
	}
	public String getNomorPutusanPengadilan() {
		return nomorPutusanPengadilan;
	}
	public void setNomorPutusanPengadilan(String nomorPutusanPengadilan) {
		this.nomorPutusanPengadilan = nomorPutusanPengadilan;
	}
	public Date getTanggalPutusanPengadilan() {
		return tanggalPutusanPengadilan;
	}
	public void setTanggalPutusanPengadilan(Date tanggalPutusanPengadilan) {
		this.tanggalPutusanPengadilan = tanggalPutusanPengadilan;
	}
	public String getTingkatPengadilanPerkara() {
		return tingkatPengadilanPerkara;
	}
	public void setTingkatPengadilanPerkara(String tingkatPengadilanPerkara) {
		this.tingkatPengadilanPerkara = tingkatPengadilanPerkara;
	}
	public int getTempatKedudukanPeradilan() {
		return tempatKedudukanPeradilan;
	}
	public void setTempatKedudukanPeradilan(int tempatKedudukanPeradilan) {
		this.tempatKedudukanPeradilan = tempatKedudukanPeradilan;
	}
	public String getNamaLembagaPeradilanPerceraian() {
		return namaLembagaPeradilanPerceraian;
	}
	public void setNamaLembagaPeradilanPerceraian(
			String namaLembagaPeradilanPerceraian) {
		this.namaLembagaPeradilanPerceraian = namaLembagaPeradilanPerceraian;
	}
	public String getSebabPerceraian() {
		return sebabPerceraian;
	}
	public void setSebabPerceraian(String sebabPerceraian) {
		this.sebabPerceraian = sebabPerceraian;
	}
	public Date getTanggalPelapor() {
		return tanggalPelapor;
	}
	public void setTanggalPelapor(Date tanggalPelapor) {
		this.tanggalPelapor = tanggalPelapor;
	}
	
	public DetailPerceraian(String idDetailPerceraian, String idAktaNikah,
			String pelaporPerceraian, String nomorPutusanPengadilan,
			Date tanggalPutusanPengadilan, String tingkatPengadilanPerkara,
			int tempatKedudukanPeradilan,
			String namaLembagaPeradilanPerceraian, String sebabPerceraian,
			Date tanggalPelapor) {
		this.idDetailPerceraian = idDetailPerceraian;
		this.idAktaNikah = idAktaNikah;
		this.pelaporPerceraian = pelaporPerceraian;
		this.nomorPutusanPengadilan = nomorPutusanPengadilan;
		this.tanggalPutusanPengadilan = tanggalPutusanPengadilan;
		this.tingkatPengadilanPerkara = tingkatPengadilanPerkara;
		this.tempatKedudukanPeradilan = tempatKedudukanPeradilan;
		this.namaLembagaPeradilanPerceraian = namaLembagaPeradilanPerceraian;
		this.sebabPerceraian = sebabPerceraian;
		this.tanggalPelapor = tanggalPelapor;
	}
	public DetailPerceraian(){}
	
}