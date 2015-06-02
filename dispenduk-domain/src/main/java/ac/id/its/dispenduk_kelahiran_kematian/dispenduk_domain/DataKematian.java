package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="data_kematian")
public class DataKematian {
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid")
	@Column(name= "id_pengajuan_kematian", nullable = false)
	private String idPengajuanKematian;
	
	/*
	//@Column(name = "id_wn_jenazah", nullable = false)
	//private String idWnJenazah;
	@ManyToOne
	@JoinColumn(name = "unique_id_wn")
	private WargaNegara idWnJenazah;
	*/
	
	//@Column(name = "id_akte_mati")
	//private String idAkteMati;
	@ManyToOne
	@JoinColumn(name="id_akte_mati")
	private AktaKelahiran idAkteMati;

	//@Column(name = "id_tempat_kematian", nullable = false)
	//private Integer idTempatKematian;
	@ManyToOne
	@JoinColumn(name = "id_wilayah")
	private Wilayah idTempatKematian;

	/*
	//@Column(name = "id_wn_pengaju", nullable = false)
	//private String idWnPengaju;
	@ManyToOne
	@JoinColumn(name = "unique_id_wn")
	private WargaNegara idWnPengaju;
	*/
	
	@Column(name = "tgl_kematian", nullable = false)
	private Date tglKematian;
	
	@Column(name = "tgl_pengajuan", nullable = false)
	private Date tglPengajuan;
	
	@Column(name = "sebab_kematian")
	private String sebabKematian;
	
	@Column(name = "penerangan")
	private String penerangan;
	

	@Column(name = "validasi_dispenduk")
	private Boolean validasiDispenduk;
	

	@Column(name = "validasi_rt_kematian")
	private Boolean validasiRtKematian;
	

	@Column(name = "validasi_rw_kematian")
	private Boolean validasiRwKematian;
	
	@Column(name = "validasi_lurah_kematian")
	private Boolean validasiLurahKematian;
	
	@Column(name = "hapus_kematian")
	private Boolean hapusKematian;
	
	//@Column(name = "id_pengajuan_kelahiran")
	//private String idPengajuanKelahiran;
	@OneToOne
	@JoinColumn(name = "id_pengajuan_kelahiran")
	private DataKelahiran1 idPengajuanKelahiran;
	
	/*
	 * Set dan Get
	 * */
	public String getIdPengajuanKematian() {
		return idPengajuanKematian;
	}

	public void setIdPengajuanKematian(String id_pengajuan_kematian) {
		this.idPengajuanKematian = id_pengajuan_kematian;
	}

	

	public Date getTglKematian() {
		return tglKematian;
	}

	public void setTglKematian(Date tgl_kematian) {
		this.tglKematian = tgl_kematian;
	}

	public Date getTglPengajuan() {
		return tglPengajuan;
	}

	public void setTglPengajuan(Date tgl_pengajuan) {
		this.tglPengajuan = tgl_pengajuan;
	}

	public String getSebabKematian() {
		return sebabKematian;
	}

	public void setSebabKematian(String sebab_kematian) {
		this.sebabKematian = sebab_kematian;
	}

	public String getPenerangan() {
		return penerangan;
	}

	public void setPenerangan(String penerangan) {
		this.penerangan = penerangan;
	}

	public Boolean getValidasiDispenduk() {
		return validasiDispenduk;
	}

	public void setValidasiDispenduk(Boolean validasi_dispenduk) {
		this.validasiDispenduk = validasi_dispenduk;
	}

	public Boolean getValidasiRtKematian() {
		return validasiRtKematian;
	}

	public void setValidasiRtKematian(Boolean validasi_rt_kematian) {
		this.validasiRtKematian = validasi_rt_kematian;
	}

	public Boolean getValidasiRwKematian() {
		return validasiRwKematian;
	}

	public void setValidasiRwKematian(Boolean validasi_rw_kematian) {
		this.validasiRwKematian = validasi_rw_kematian;
	}

	public Boolean getValidasiLurahKematian() {
		return validasiLurahKematian;
	}

	public void setValidasiLurahKematian(Boolean validasi_lurah_kematian) {
		this.validasiLurahKematian = validasi_lurah_kematian;
	}

	public Boolean getHapusKematian() {
		return hapusKematian;
	}

	public void setHapusKematian(Boolean hapus_kematian) {
		this.hapusKematian = hapus_kematian;
	}
	
	/*
	public WargaNegara getIdWnJenazah() {
		return idWnJenazah;
	}

	public void setIdWnJenazah(WargaNegara idWnJenazah) {
		this.idWnJenazah = idWnJenazah;
	}
	*/

	public AktaKelahiran getIdAkteMati() {
		return idAkteMati;
	}

	public void setIdAkteMati(AktaKelahiran idAkteMati) {
		this.idAkteMati = idAkteMati;
	}

	public Wilayah getIdTempatKematian() {
		return idTempatKematian;
	}

	public void setIdTempatKematian(Wilayah idTempatKematian) {
		this.idTempatKematian = idTempatKematian;
	}

	/*
	public WargaNegara getIdWnPengaju() {
		return idWnPengaju;
	}

	public void setIdWnPengaju(WargaNegara idWnPengaju) {
		this.idWnPengaju = idWnPengaju;
	}
	*/

	public DataKelahiran1 getIdPengajuanKelahiran() {
		return idPengajuanKelahiran;
	}

	public void setIdPengajuanKelahiran(DataKelahiran1 idPengajuanKelahiran) {
		this.idPengajuanKelahiran = idPengajuanKelahiran;
	}

	/*
	 * Konstruktor 
	 * */
	public DataKematian(String idWnJenazah, Wilayah idTempatKematian, String id_wn_pengaju, Date tglKematian,
			Date tglPengajuan, String sebabKematian, String penerangan) {
		//this.idWnJenazah = idWnJenazah;
		this.idTempatKematian = idTempatKematian;
		//this.idWnPengaju = id_wn_pengaju;
		this.tglKematian = tglKematian;
		this.tglPengajuan = tglPengajuan;
		this.sebabKematian = sebabKematian;
		this.idAkteMati = null;
		this.hapusKematian = false;
		this.validasiDispenduk = false;
		this.validasiLurahKematian = false;
		this.validasiRtKematian = false;
		this.validasiRwKematian = false;
		this.penerangan = penerangan;
	}
	public DataKematian(){}
	
}
