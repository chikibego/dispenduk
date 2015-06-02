package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data;

import java.util.List;
import java.util.Calendar;

import org.springframework.context.support.GenericXmlApplicationContext;

import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_domain.*;
import ac.id.its.dispenduk_kelahiran_kematian.dispenduk_data.inter.*;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_data.*;

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
		AktaKelahiranDao dataAktaKelahiran = ctx.getBean("dataAktaKelahiran",AktaKelahiranDao.class);
		AktaKematianDao dataAktaKematian = ctx.getBean("dataAktaKematian",AktaKematianDao.class);
		BerkasKematianDao databerkasKematian = ctx.getBean("dataBerkasKematian",BerkasKematianDao.class);
		DataKematianDao dataKematian = ctx.getBean("dataKematian",DataKematianDao.class);
		DataKelahiranDao dataKelahiran = ctx.getBean("dataKelahiran",DataKelahiranDao.class);

		Calendar cal = Calendar.getInstance();
		cal.set(1995, 5, 25);
		
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
		dataKelahiran.setValidasiDispenduk("1");
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
		databerkasKematian.findById("1"); 
		ctx.close();
	}
}
