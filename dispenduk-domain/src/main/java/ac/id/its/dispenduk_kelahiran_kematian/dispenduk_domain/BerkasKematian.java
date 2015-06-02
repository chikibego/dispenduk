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
@Table(name="berkas_kematian")
public class BerkasKematian {
	/*
	 * data berkas
	 * */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "id_berkas_kematian", nullable = false)
	private String idBerkasKematian;

	//@Column(name = "id_pengajuan_kematian", nullable = false)
	//private String idPengajuanKematian;
	@ManyToOne
	@JoinColumn(name = "id_pengajuan_kematian")
	private DataKematian idPengajuanKematian;
	
	@Column(name = "nama_berkas_kematian", nullable = false)
	private String namaBerkasKematian;
	
	@Column(name = "file_berkas_kematian", nullable = false)
	private String fileBerkasKematian;


	/*
	 * Set dan Get
	 * */
	
	public String getIdBerkasKematian() {
		return idBerkasKematian;
	}

	public void setIdBerkasKematian(String id_berkas_kematian) {
		this.idBerkasKematian = id_berkas_kematian;
	}

	public DataKematian getIdPengajuanKematian() {
		return idPengajuanKematian;
	}

	public void setIdPengajuanKematian(DataKematian idPengajuanKematian) {
		this.idPengajuanKematian = idPengajuanKematian;
	}

	public String getNamaBerkasKematian() {
		return namaBerkasKematian;
	}

	public void setNamaBerkasKematian(String nama_berkas_kematian) {
		this.namaBerkasKematian = nama_berkas_kematian;
	}

	public String getFileBerkasKematian() {
		return fileBerkasKematian;
	}

	public void setFileBerkasKematian(String file_berkas_kematian) {
		this.fileBerkasKematian = file_berkas_kematian;
	}

	/*
	 * konstraktor
	 * */
	public BerkasKematian(){}

	public BerkasKematian(String idBerkasKematian,
			DataKematian idPengajuanKematian, String namaBerkasKematian,
			String fileBerkasKematian) {
		this.idBerkasKematian = idBerkasKematian;
		this.idPengajuanKematian = idPengajuanKematian;
		this.namaBerkasKematian = namaBerkasKematian;
		this.fileBerkasKematian = fileBerkasKematian;
	}
	

}
