package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain;

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
@Table(name="akte_kelahiran")
public class AktaKelahiran {
	/*
	 * Data Akta Kelahiran
	 * */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "id_akte_kelahiran", nullable = false)
	private String idAkteKelahiran;

	//@Column(name = "id_pengajuan_kelahiran", nullable = false)
	//private String idPengajuanKelahiran;
	@OneToOne
	@JoinColumn(name="id_pengajuan_kelahiran")
	private DataKelahiran1 idPengajuanKelahiran;
	
	@Column(name = "id_wilayah", nullable = false)
	private Integer idWilayah;
	
	@Column(name = "tanggal_terbit", nullable = false)
	private Date tanggalTerbit;
	/*
	 * Set dan get
	 * */
	
	public String getIdAkteKelahiran() {
		return idAkteKelahiran;
	}


	public void setIdAkteKelahiran(String idAkteKelahiran) {
		this.idAkteKelahiran = idAkteKelahiran;
	}

	
	public DataKelahiran1 getIdPengajuanKelahiran() {
		return idPengajuanKelahiran;
	}


	public void setIdPengajuanKelahiran(DataKelahiran1 idPengajuanKelahiran) {
		this.idPengajuanKelahiran = idPengajuanKelahiran;
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

	/*
	 * Konstruktor
	 * */
	
	public AktaKelahiran(){}


	public AktaKelahiran(String idAkteKelahiran,
			DataKelahiran1 idPengajuanKelahiran, Integer idWilayah,
			Date tanggalTerbit) {
		this.idAkteKelahiran = idAkteKelahiran;
		this.idPengajuanKelahiran = idPengajuanKelahiran;
		this.idWilayah = idWilayah;
		this.tanggalTerbit = tanggalTerbit;
	}

}
