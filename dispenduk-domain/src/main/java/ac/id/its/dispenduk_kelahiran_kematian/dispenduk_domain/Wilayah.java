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
@Table(name="dataWilayah")
public class Wilayah {
	@Id
	@Column(name= "id_wilayah", nullable = false)
	private int idWilayah;
	
	@Column(name= "nama_wilayah", nullable = false,  length=50)
	private int namaWilayah;
	/*
	 * Set dan get
	 * */
	public int getIdWilayah() {
		return idWilayah;
	}

	public void setIdWilayah(int idWilayah) {
		this.idWilayah = idWilayah;
	}

	public int getNamaWilayah() {
		return namaWilayah;
	}

	public void setNamaWilayah(int nama_wilayah) {
		this.namaWilayah = nama_wilayah;
	}
	/*
	 * KOnstraktor
	 * */

	public Wilayah(int idWilayah, int nama_wilayah) {
		this.idWilayah = idWilayah;
		this.namaWilayah = nama_wilayah;
	}
	public Wilayah() {}
}
