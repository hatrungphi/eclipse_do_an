package com.model;
// Generated Nov 26, 2022 10:26:00 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Baiviet generated by hbm2java
 */
public class Baiviet implements java.io.Serializable {

	private Integer mabaiviet;
	private Nguoidung nguoidung;
	private String tenbaiviet;
	private String mota;
	private String nguyenlieu;
	private String cachlam;
	private String hinh;
	private Set danhgias = new HashSet(0);
	private Set theloais = new HashSet(0);

	public Baiviet() {
	}

	public Baiviet(Nguoidung nguoidung, String tenbaiviet, String mota, String nguyenlieu, String cachlam) {
		this.nguoidung = nguoidung;
		this.tenbaiviet = tenbaiviet;
		this.mota = mota;
		this.nguyenlieu = nguyenlieu;
		this.cachlam = cachlam;
	}

	public Baiviet(Nguoidung nguoidung, String tenbaiviet, String mota, String nguyenlieu, String cachlam, String hinh,
			Set danhgias, Set theloais) {
		this.nguoidung = nguoidung;
		this.tenbaiviet = tenbaiviet;
		this.mota = mota;
		this.nguyenlieu = nguyenlieu;
		this.cachlam = cachlam;
		this.hinh = hinh;
		this.danhgias = danhgias;
		this.theloais = theloais;
	}

	public Integer getMabaiviet() {
		return this.mabaiviet;
	}

	public void setMabaiviet(Integer mabaiviet) {
		this.mabaiviet = mabaiviet;
	}

	public Nguoidung getNguoidung() {
		return this.nguoidung;
	}

	public void setNguoidung(Nguoidung nguoidung) {
		this.nguoidung = nguoidung;
	}

	public String getTenbaiviet() {
		return this.tenbaiviet;
	}

	public void setTenbaiviet(String tenbaiviet) {
		this.tenbaiviet = tenbaiviet;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getNguyenlieu() {
		return this.nguyenlieu;
	}

	public void setNguyenlieu(String nguyenlieu) {
		this.nguyenlieu = nguyenlieu;
	}

	public String getCachlam() {
		return this.cachlam;
	}

	public void setCachlam(String cachlam) {
		this.cachlam = cachlam;
	}

	public String getHinh() {
		return this.hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public Set getDanhgias() {
		return this.danhgias;
	}

	public void setDanhgias(Set danhgias) {
		this.danhgias = danhgias;
	}

	public Set getTheloais() {
		return this.theloais;
	}

	public void setTheloais(Set theloais) {
		this.theloais = theloais;
	}

}