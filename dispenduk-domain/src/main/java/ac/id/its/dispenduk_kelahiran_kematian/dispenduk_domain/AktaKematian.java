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
@Table(name="akte_kematian")
public class AktaKematian {
	/*
	 * Data Akta Kematian
	 * */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "id_akte_mati", nullable = false)
	private String idAkteMati;
	
	
	@Column(name = "id_pengajuan_kematian", nullable = false)
	private String idPengajuanKematian;
	
	//@Column(name = "id_wilayah", nullable = false)
	//private Integer idWilayah;
	@ManyToOne
	@JoinColumn(name = "id_wilayah")
	private Wilayah idWilayah;
	
	@Column(name = "tanggal_mati", nullable = false)
	private Date tanggalMati;
	
	@Column(name = "tanggal_terbit", nullable = false)
	private Date tanggalTerbit;
	/*
	 * Set dan get
	 * */
	public String getIdAkteMati() {
		return idAkteMati;
	}

	public void setIdAkteMati(String id_akte_mati) {
		this.idAkteMati = id_akte_mati;
	}

	public String getIdPengajuanKematian() {
		return idPengajuanKematian;
	}

	public void setIdPengajuanKematian(String id_pengajuan_kematian) {
		this.idPengajuanKematian = id_pengajuan_kematian;
	}

	public Wilayah getIdWilayah() {
		return idWilayah;
	}

	public void setIdWilayah(Wilayah idWilayah) {
		this.idWilayah = idWilayah;
	}

	public Date getTanggalMati() {
		return tanggalMati;
	}

	public void setTanggalMati(Date tanggal_mati) {
		this.tanggalMati = tanggal_mati;
	}

	public Date getTanggalTerbit() {
		return tanggalTerbit;
	}

	public void setTanggalTerbit(Date tanggal_terbit) {
		this.tanggalTerbit = tanggal_terbit;
	}

	/*
	 * Konstruktor
	 * */
	public AktaKematian(){}

	public AktaKematian(String idAkteMati, String idPengajuanKematian,
			Wilayah idWilayah, Date tanggalMati, Date tanggalTerbit) {
		this.idAkteMati = idAkteMati;
		this.idPengajuanKematian = idPengajuanKematian;
		this.idWilayah = idWilayah;
		this.tanggalMati = tanggalMati;
		this.tanggalTerbit = tanggalTerbit;
	}
	
}
