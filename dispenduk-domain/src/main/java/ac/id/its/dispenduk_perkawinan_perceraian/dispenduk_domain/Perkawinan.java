package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "perkawinan")
public class Perkawinan {
	/*
	 * Tabel Perkawinan
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id_perkawinan", nullable=false)
	private String idPerkawinan;
	
	//@OneToOne
	//@JoinColumn(name = "id_dokumen_perkawinan") 
	@Column(name = "id_dokumen_perkawinan", nullable=false)
	private String idDokumenPerkawinan;
	
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="pemuka_agama", nullable=false)
	private String pemukaAgama;
	
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="saksi1", nullable=false)
	private String saksi1;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="saksi2", nullable=false)
	private String saksi2;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="suami", nullable=false)
	private String suami;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="istri", nullable=false)
	private String istri;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="ayah_dari_suami", nullable=false)
	private String ayahDariSuami;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="ibu_dari_suami", nullable=false)
	private String ibuDariSuami;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="ayah_dari_istri", nullable=false)
	private String ayahDariIstri;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name="ibu_dari_istri", nullable=false)
	private String ibuDariIstri;

	@Column(name="flag_cerai", nullable = false)
	private boolean flagCerai;

	@Column(name="flag_validasi", nullable = false)
	private boolean flagValidasi;

	@Column(name="flag_hapus", nullable = false)
	private boolean flagHapus;

	

	
	public String getIdPerkawinan() {
		return idPerkawinan;
	}

	public void setIdPerkawinan(String idPerkawinan) {
		this.idPerkawinan = idPerkawinan;
	}

	public String getIdDokumenPerkawinan() {
		return idDokumenPerkawinan;
	}

	public void setIdDokumenPerkawinan(String idDokumenPerkawinan) {
		this.idDokumenPerkawinan = idDokumenPerkawinan;
	}

	public String getPemukaAgama() {
		return pemukaAgama;
	}

	public void setPemukaAgama(String pemukaAgama) {
		this.pemukaAgama = pemukaAgama;
	}

	public String getSaksi1() {
		return saksi1;
	}

	public void setSaksi1(String saksi1) {
		this.saksi1 = saksi1;
	}

	public String getSaksi2() {
		return saksi2;
	}

	public void setSaksi2(String saksi2) {
		this.saksi2 = saksi2;
	}

	public String getSuami() {
		return suami;
	}

	public void setSuami(String suami) {
		this.suami = suami;
	}

	public String getIstri() {
		return istri;
	}

	public void setIstri(String istri) {
		this.istri = istri;
	}

	public String getAyahDariSuami() {
		return ayahDariSuami;
	}

	public void setAyahDariSuami(String ayahDariSuami) {
		this.ayahDariSuami = ayahDariSuami;
	}

	public String getIbuDariSuami() {
		return ibuDariSuami;
	}

	public void setIbuDariSuami(String ibuDariSuami) {
		this.ibuDariSuami = ibuDariSuami;
	}

	public String getAyahDariIstri() {
		return ayahDariIstri;
	}

	public void setAyahDariIstri(String ayahDariIstri) {
		this.ayahDariIstri = ayahDariIstri;
	}

	public String getIbuDariIstri() {
		return ibuDariIstri;
	}

	public void setIbuDariIstri(String ibuDariIstri) {
		this.ibuDariIstri = ibuDariIstri;
	}

	public boolean isFlagCerai() {
		return flagCerai;
	}

	public void setFlagCerai(boolean flagCerai) {
		this.flagCerai = flagCerai;
	}

	public boolean isFlagValidasi() {
		return flagValidasi;
	}

	public void setFlagValidasi(boolean flagValidasi) {
		this.flagValidasi = flagValidasi;
	}

	public boolean isFlagHapus() {
		return flagHapus;
	}

	public void setFlagHapus(boolean flagHapus) {
		this.flagHapus = flagHapus;
	}

	

	public Perkawinan(String idPerkawinan, String idDokumenPerkawinan,
			String pemukaAgama, String saksi1, String saksi2, String suami, String istri,
			String ayahDariSuami, String ibuDariSuami, String ayahDariIstri,
			String ibuDariIstri, boolean flagCerai, boolean flagValidasi,
			boolean flagHapus) {
		this.idPerkawinan = idPerkawinan;
		this.idDokumenPerkawinan = idDokumenPerkawinan;
		this.pemukaAgama = pemukaAgama;
		this.saksi1 = saksi1;
		this.saksi2 = saksi2;
		this.suami = suami;
		this.istri = istri;
		this.ayahDariSuami = ayahDariSuami;
		this.ibuDariSuami = ibuDariSuami;
		this.ayahDariIstri = ayahDariIstri;
		this.ibuDariIstri = ibuDariIstri;
		this.flagCerai = flagCerai;
		this.flagValidasi = flagValidasi;
		this.flagHapus = flagHapus;
	}

	public Perkawinan(){}
}
