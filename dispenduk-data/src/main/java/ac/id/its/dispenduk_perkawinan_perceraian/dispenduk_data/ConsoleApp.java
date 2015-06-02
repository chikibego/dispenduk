package ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data;


import java.util.List;
import java.util.Calendar;

import org.springframework.context.support.GenericXmlApplicationContext;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.*;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.*;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.imp.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.inter.*;

public class ConsoleApp {
	public static void main(String[] args){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:datasource.xml");
		ctx.refresh();
		/*
		 * Akses Bean
		 * */
	/*	AktaKelahiranDao dataAktaKelahiran = ctx.getBean("dataAktaKelahiran",AktaKelahiranDao.class);
		AktaKematianDao dataAktaKematian = ctx.getBean("dataAktaKematian",AktaKematianDao.class);
		BerkasKematianDao databerkasKematian = ctx.getBean("dataBerkasKematian",BerkasKematianDao.class);
		DataKematianDao dataKematian = ctx.getBean("dataKematian",DataKematianDao.class);
		DataKelahiranDao dataKelahiran = ctx.getBean("dataKelahiran",DataKelahiranDao.class);
	*/
		
		AgamaDao dataAgama = ctx.getBean("dataAgama", AgamaDao.class);
		AktaCeraiDao dataAktaCerai = ctx.getBean("dataAktaCerai", AktaCeraiDao.class);
		AktaNikahDao dataAktaNikah = ctx.getBean("dataAktaNikah", AktaNikahDao.class);
		DetailPerceraianDao dataDetailPerceraian = ctx.getBean("dataDetailPerceraian", DetailPerceraianDao.class);
		DetailPerkawinanDao dataDetailPerkawinan = ctx.getBean("dataDetailPerkawinan", DetailPerkawinanDao.class);
		DokumenPerkawinanDao dataDokumenPerkawinan = ctx.getBean("dataDokumenPerkawinan", DokumenPerkawinanDao.class);
		JenisAktaCeraiDao dataJenisAktaCerai = ctx.getBean("dataJenisAktaCerai", JenisAktaCeraiDao.class);
		JenisAktaNikahDao dataJenisAktaNikah = ctx.getBean("dataJenisAktaNikah", JenisAktaNikahDao.class);
		KtpDao dataKtp = ctx.getBean("dataKtp", KtpDao.class);
		PerkawinanDao dataPerkawinan = ctx.getBean("dataPerkawinan", PerkawinanDao.class);
		WargaNegaraDao dataWargaNegara = ctx.getBean("dataWargaNegara", WargaNegaraDao.class);
		
		Calendar cal = Calendar.getInstance();
		cal.set(1995, 5, 25);
		
	/*	Agama agama = new Agama("1","agama");
		AktaCerai aktaCerai = new AktaCerai("1","2",3,cal.getTime(),"sby",cal.getTime(),cal.getTime(),"xx/123");
		AktaNikah aktaNikah = new AktaNikah("1",2,"1",cal.getTime(),"sby",cal.getTime(),"1","2","3");
		DetailPerceraian detailPerceraian = new DetailPerceraian("1","2","jono","cc/123",cal.getTime(),"rt",3,"cerai","pengen aja",cal.getTime());
		DetailPerkawinan detailPerkawinan = new DetailPerkawinan("1","1",cal.getTime(),cal.getTime(),"rumah","rumah","agama","pp/123",cal.getTime(),"diijinkan","3","jono");
		//DokumenPerkawinan dokumenPerkawinan = new DokumenPerkawinan(); //bingung insert file
		JenisAktaCerai jenisAktaCerai = new JenisAktaCerai("1","1","2");
		JenisAktaNikah jenisAktaNikah = new JenisAktaNikah("1","1","2");
		Ktp ktp = new Ktp("12345","888");
		//Perkawinan perkawinan = new Perkawinan("1","1","2","3","4","5","6","7","8","9","10",'0' ,'1' ,'0');
		WargaNegara wargaNegara = new WargaNegara();
		*/
		
		
		/*Calendar cal = Calendar.getInstance();
		cal.set(1995, 5, 25);*/
		
		/*
		 * Test Insert
		 *
		AktaKelahiran aktaKelahiran  = new AktaKelahiran("1",1,cal.getTime());
		dataAktaKelahiran.saveAktaKelahiran(aktaKelahiran);
		AktaKematian aktaKematian = new AktaKematian("1", 1, cal.getTime(), cal.getTime());
		dataAktaKematian.saveAktaKematian(aktaKematian);
		BerkasKematian berkasKematian = new BerkasKematian("1","aji", "1");
		databerkasKematian.saveBerkasKematian(berkasKematian);
		DataKematian kematian  = new DataKematian("1", 1, "1", cal.getTime(), cal.getTime(), "aw", "aw");
		dataKematian.saveDataKematian(kematian);
		DataKelahiran1 kelahiran = new DataKelahiran1("1", "1", 1, "1", "wow", "wow", "2", 2, cal.getTime(), cal.getTime(),"ade");
		dataKelahiran.saveDataKelahiran(kelahiran);
		*/
		
		/*
		 * Test Update
		 * */
		//Set Validasi data kelahiran1
	/*	dataKelahiran.setValidasiDispenduk("1");
		dataKelahiran.setValidasiLurah("1");
		dataKelahiran.setValidasiRt("1");
		dataKelahiran.setValidasiRw("1");
		//set Validasi data Kematian
		dataKematian.setValidasiDispenduk("1");
		dataKematian.setValidasiLurah("1");
		dataKematian.setValidasiRt("1");
		dataKematian.setValidasiRw("1");
		//set Hapus Data
		dataKelahiran.setHapusKelahiran("1");
		dataKematian.hapusDataKematian("1");
		//Pencarian data kematian
		dataKematian.findById("1");
		dataKematian.findByAkteMati("1");
		dataKematian.findByIdJenazah("1");
		dataKematian.findByIdPengaju("1");
		//Pencarian data Kelahiran
		dataKelahiran.findById("1");
		dataKelahiran.findByIdIbu("1");
		dataKelahiran.findByIdPengaju("1");
		dataKelahiran.findByPengajuanKematian("1");
		//Pencarian data Wilayah
		//dataWilayah.findById(1);
		//dataWilayah.findByWilayah("Surabaya");
		//Download pengajuan kematian
		databerkasKematian.findById("1"); */
		ctx.close();
	}
}
