package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain;

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
@Table(name="Data_Kelahiran")

public class Data_Kelahiran {
	/*
	 * Definisi data 
	 */
	
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name= "ID_BERKAS_KEMATIAN", nullable = false)
	private UUID id_berkas_kematian;
	
	@Column(name = "BERKAS_KEMATIAN", nullable = false)
	private int berkas_kematian;
	
	@Column(name = "NAMA_BERKAS_KEMATIAN", nullable = false)
	private String nama_berkas_kematian;


	public UUID getId_berkas_kematian() {
		return id_berkas_kematian;
	}

	public void setId_berkas_kematian(UUID id_berkas_kematian) {
		this.id_berkas_kematian = id_berkas_kematian;
	}

	public int getBerkas_kematian() {
		return berkas_kematian;
	}

	public void setBerkas_kematian(int berkas_kematian) {
		this.berkas_kematian = berkas_kematian;
	}

	public Data_Kelahiran( int berkas_kematian,
			String nama_berkas_kematian) {
		this.berkas_kematian = berkas_kematian;
		this.nama_berkas_kematian = nama_berkas_kematian;
	}

	public String getNama_berkas_kematian() {
		return nama_berkas_kematian;
	}

	public void setNama_berkas_kematian(String nama_berkas_kematian) {
		this.nama_berkas_kematian = nama_berkas_kematian;
	}
	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("Data_Kelahiran [ID_BERKAS_KEMATIAN=");
		builder.append(berkas_kematian);
		builder.append(",BERKAS_KEMATIAN=");
		builder.append(berkas_kematian);
		builder.append(", NAMA_BERKAS_KEMATIAN=");
		builder.append(nama_berkas_kematian);
		builder.append("]");
		builder.append("Data_Kelahiran [BERKAS_KEMATIAN=");
		builder.append(berkas_kematian);
		builder.append(", NAMA_BERKAS_KEMATIAN=");
		builder.append(nama_berkas_kematian);
		builder.append("]");
		return builder.toString();
	}*/

}
