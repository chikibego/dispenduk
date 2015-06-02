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
@Table(name="dokumen_perkawinan")

public class DokumenPerkawinan {
	/*
	 * Tabel Dokumen Perkawinan
	 */
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name = "id_dokumen_perkawinan", nullable=false)
	private String idDokumenPerkawinan;
	
	//@OneToOne
	//@JoinColumn(name="id_perkawinan", nullable=false)
	@Column(name="id_perkawinan", nullable=false)
	private String idPerkawinan;
	
	@Column(name="surat_keterangan_kelurahan")
	private byte[] suratKeteranganKelurahan;
	
	@Column(name="surat_izin_kawin_komandan")
	private byte[] suratIzinKawinKomandan;

	@Column(name="surat_perjanjian_kawin")
	private byte[] suratPerjanjianKawin;
	
	@Column(name="surat_keterangan_kepercayaan")
	private byte[] suratKeteranganKepercayaan;

	public String getIdDokumenPerkawinan() {
		return idDokumenPerkawinan;
	}

	public void setIdDokumenPerkawinan(String idDokumenPerkawinan) {
		this.idDokumenPerkawinan = idDokumenPerkawinan;
	}

	public String getIdPerkawinan() {
		return idPerkawinan;
	}

	public void setIdPerkawinan(String idPerkawinan) {
		this.idPerkawinan = idPerkawinan;
	}

	public byte[] getSuratKeteranganKelurahan() {
		return suratKeteranganKelurahan;
	}

	public void setSuratKeteranganKelurahan(byte[] suratKeteranganKelurahan) {
		this.suratKeteranganKelurahan = suratKeteranganKelurahan;
	}

	public byte[] getSuratIzinKawinKomandan() {
		return suratIzinKawinKomandan;
	}

	public void setSuratIzinKawinKomandan(byte[] suratIzinKawinKomandan) {
		this.suratIzinKawinKomandan = suratIzinKawinKomandan;
	}

	public byte[] getSuratPerjanjianKawin() {
		return suratPerjanjianKawin;
	}

	public void setSuratPerjanjianKawin(byte[] suratPerjanjianKawin) {
		this.suratPerjanjianKawin = suratPerjanjianKawin;
	}

	public byte[] getSuratKeteranganKepercayaan() {
		return suratKeteranganKepercayaan;
	}

	public void setSuratKeteranganKepercayaan(byte[] suratKeteranganKepercayaan) {
		this.suratKeteranganKepercayaan = suratKeteranganKepercayaan;
	}


	public DokumenPerkawinan(String idDokumenPerkawinan, String idPerkawinan,
			byte[] suratKeteranganKelurahan, byte[] suratIzinKawinKomandan,
			byte[] suratPerjanjianKawin, byte[] suratKeteranganKepercayaan) {
		this.idDokumenPerkawinan = idDokumenPerkawinan;
		this.idPerkawinan = idPerkawinan;
		this.suratKeteranganKelurahan = suratKeteranganKelurahan;
		this.suratIzinKawinKomandan = suratIzinKawinKomandan;
		this.suratPerjanjianKawin = suratPerjanjianKawin;
		this.suratKeteranganKepercayaan = suratKeteranganKepercayaan;
	}

	public DokumenPerkawinan(){}
	
}