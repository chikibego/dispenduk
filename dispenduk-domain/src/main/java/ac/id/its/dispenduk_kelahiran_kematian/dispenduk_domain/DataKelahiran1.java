package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain;
import java.util.Calendar;
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

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaCerai;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.AktaNikah;

@Entity
@Table(name="Data_Kelahiran1")
public class DataKelahiran1 {
	/*
	 * Definisi data 
	 */
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid")
	@Column(name= "id_pengajuan_kelahiran", nullable = false)
	private String idPengajuanKelahiran;
	
	/*
	
	//@Column(name = "id_wn_ibu", nullable = false)
	//private String idWnIbu;
	@ManyToOne
	@JoinColumn(name = "unique_id_wn")
	 */
	//private WargaNegara idWnIbu;
	
	//@Column(name = "id_akte_nikah")
	//private String idAkteNikah;
	@ManyToOne
	@JoinColumn(name = "id_akte_nikah")
	private AktaNikah idAkteNikah;

	//@Column(name = "id_wilayah", nullable = false)
	//private Integer idWilayah;
	
	/*
	//@Column(name = "id_wn_ayah")
	//private String idWnAyah;
	@ManyToOne
	@JoinColumn(name = "unique_id_wn")
	private WargaNegara idWnAyah;
	*/

	//@Column(name = "id_akta_kelahiran")
	//private String idAktaKelahiran;
	@OneToOne
	@JoinColumn(name="id_akta_kelahiran")
	private AktaKelahiran idAktaKelahiran;

	@Column(name = "surat_pernyataan_pencatatan")
	private String suratPernyataanPencatatan;
	

	@Column(name = "berita_acara_polisi")
	private String beritaAcaraPolisi;

	/*
	//@Column(name = "id_wn_pengaju", nullable=false)
	//private String idWnPengaju;
	@ManyToOne
	@JoinColumn(name = "unique_id_wn")
	private WargaNegara idWnPengaju;
	*/
	
	@Column(name = "status_pendaftaran")
	private Boolean statusPendaftaran;
	

	@Column(name = "validasi_dispenduk_kelahiran")
	private Boolean validasiDispendukKelahiran;
	

	@Column(name = "validasi_rt_kelahiran")
	private Boolean validasiRtKelahiran;
	

	@Column(name = "validasi_rw_kelahiran")
	private Boolean validasiRwKelahiran;
	
	@Column(name = "validasi_lurah_kelahiran")
	private Boolean validasiLurahKelahiran;
	
	@Column(name = "hapus_kelahiran")
	private Boolean hapusKelahiran;
	
	//@Column(name = "id_tempat_kelahiran", nullable = false)
	//private Integer idTempatKelahiran;
	@ManyToOne
	@JoinColumn(name = "id_wilayah")
	private Wilayah idTempatKelahiran;
	
	@Column(name = "tgl_lahir", nullable = false)
	private Date tglLahir;
	
	@Column(name = "tgl_pengajuan", nullable = false)
	private Date tglPengajuan;
	
	@Column(name = "nama_bayi", nullable=false)
	private String namaBayi;
	
	//@Column(name = "id_pengajuan_kematian")
	//private String idPengajuanKematian;
	@OneToOne
	@JoinColumn(name = "id_pengajuan_kematian")
	private DataKematian idPengajuanKematian;
	
	/*
	 *Set dan Get 
	 */
	
	public String getIdPengajuanKelahiran() {
		return idPengajuanKelahiran;
	}

	public void setIdPengajuanKelahiran(String id_pengajuan_kelahiran) {
		this.idPengajuanKelahiran = id_pengajuan_kelahiran;
	}

	public String getSuratPernyataanPencatatan() {
		return suratPernyataanPencatatan;
	}

	public void setSuratPernyataanPencatatan(String surat_pernyataan_pencatatan) {
		this.suratPernyataanPencatatan = surat_pernyataan_pencatatan;
	}

	public String getBeritaAcaraPolisi() {
		return beritaAcaraPolisi;
	}

	public void setBeritaAcaraPolisi(String berita_acara_polisi) {
		this.beritaAcaraPolisi = berita_acara_polisi;
	}

	public Boolean getStatusPendaftaran() {
		return statusPendaftaran;
	}

	public void setStatusPendaftaran(Boolean status_pendaftaran) {
		this.statusPendaftaran = status_pendaftaran;
	}

	public Boolean getValidasiDispendukKelahiran() {
		return validasiDispendukKelahiran;
	}

	public void setValidasiDispendukKelahiran(Boolean validasi_dispenduk_kelahiran) {
		this.validasiDispendukKelahiran = validasi_dispenduk_kelahiran;
	}

	public Boolean getValidasiRtKelahiran() {
		return validasiRtKelahiran;
	}

	public void setValidasiRtKelahiran(Boolean validasi_rt_kelahiran) {
		this.validasiRtKelahiran = validasi_rt_kelahiran;
	}

	public Boolean getValidasiRwKelahiran() {
		return validasiRwKelahiran;
	}

	public void setValidasiRwKelahiran(Boolean validasi_rw_kelahiran) {
		this.validasiRwKelahiran = validasi_rw_kelahiran;
	}

	public Boolean getValidasiLurahKelahiran() {
		return validasiLurahKelahiran;
	}

	public void setValidasiLurahKelahiran(Boolean validasi_lurah_kelahiran) {
		this.validasiLurahKelahiran = validasi_lurah_kelahiran;
	}

	public Boolean getHapusKelahiran() {
		return hapusKelahiran;
	}

	public void setHapusKelahiran(Boolean hapus_kelahiran) {
		this.hapusKelahiran = hapus_kelahiran;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tgl_lahir) {
		this.tglLahir = tgl_lahir;
	}

	public Date getTglPengajuan() {
		return tglPengajuan;
	}

	public void setTglPengajuan(Date tgl_pengajuan) {
		this.tglPengajuan = tgl_pengajuan;
	}
	

	public String getNamaBayi() {
		return namaBayi;
	}

	public void setNamaBayi(String nama_bayi) {
		this.namaBayi = nama_bayi;
	}

	/*
	public WargaNegara getIdWnIbu() {
		return idWnIbu;
	}
	*/

	/*
	public void setIdWnIbu(WargaNegara idWnIbu) {
		this.idWnIbu = idWnIbu;
	}
	*/
	public AktaNikah getIdAkteNikah() {
		return idAkteNikah;
	}

	public void setIdAkteNikah(AktaNikah idAkteNikah) {
		this.idAkteNikah = idAkteNikah;
	}

	/*
	public WargaNegara getIdWnAyah() {
		return idWnAyah;
	}
	
	public void setIdWnAyah(WargaNegara idWnAyah) {
		this.idWnAyah = idWnAyah;
	}
	*/
	
	public AktaKelahiran getIdAktaKelahiran() {
		return idAktaKelahiran;
	}

	public void setIdAktaKelahiran(AktaKelahiran idAktaKelahiran) {
		this.idAktaKelahiran = idAktaKelahiran;
	}

	/*
	
		return idWnPengaju;
	}

	public void setIdWnPengaju(WargaNegara idWnPengaju) {
		this.idWnPengaju = idWnPengaju;
	}
	*/

	public Wilayah getIdTempatKelahiran() {
		return idTempatKelahiran;
	}

	public void setIdTempatKelahiran(Wilayah idTempatKelahiran) {
		this.idTempatKelahiran = idTempatKelahiran;
	}

	public DataKematian getIdPengajuanKematian() {
		return idPengajuanKematian;
	}

	public void setIdPengajuanKematian(DataKematian idPengajuanKematian) {
		this.idPengajuanKematian = idPengajuanKematian;
	}

	/*
	 * konstraktor
	 * */
	public DataKelahiran1(){}

	public DataKelahiran1(String idPengajuanKelahiran,// WargaNegara idWnIbu,
			AktaNikah idAkteNikah, //WargaNegara idWnAyah,
			AktaKelahiran idAktaKelahiran, String suratPernyataanPencatatan,
			String beritaAcaraPolisi, //WargaNegara idWnPengaju,
			Boolean statusPendaftaran, Boolean validasiDispendukKelahiran,
			Boolean validasiRtKelahiran, Boolean validasiRwKelahiran,
			Boolean validasiLurahKelahiran, Boolean hapusKelahiran,
			Wilayah idTempatKelahiran, Date tglLahir, Date tglPengajuan,
			String namaBayi, DataKematian idPengajuanKematian) {
		
		this.idPengajuanKelahiran = idPengajuanKelahiran;
		//this.idWnIbu = idWnIbu;
		this.idAkteNikah = idAkteNikah;
		//this.idWnAyah = idWnAyah;
		this.idAktaKelahiran = idAktaKelahiran;
		this.suratPernyataanPencatatan = suratPernyataanPencatatan;
		this.beritaAcaraPolisi = beritaAcaraPolisi;
		//this.idWnPengaju = idWnPengaju;
		this.statusPendaftaran = statusPendaftaran;
		this.validasiDispendukKelahiran = validasiDispendukKelahiran;
		this.validasiRtKelahiran = validasiRtKelahiran;
		this.validasiRwKelahiran = validasiRwKelahiran;
		this.validasiLurahKelahiran = validasiLurahKelahiran;
		this.hapusKelahiran = hapusKelahiran;
		this.idTempatKelahiran = idTempatKelahiran;
		this.tglLahir = tglLahir;
		this.tglPengajuan = tglPengajuan;
		this.namaBayi = namaBayi;
		this.idPengajuanKematian = idPengajuanKematian;
	}
}
