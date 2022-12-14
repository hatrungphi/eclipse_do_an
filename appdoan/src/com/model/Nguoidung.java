package com.model;
// Generated Nov 26, 2022 10:26:00 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Nguoidung generated by hbm2java
 */
public class Nguoidung implements java.io.Serializable {

	private Integer manguoidung;
	private String tennguoidung;
	private String sodienthoai;
	private Date ngaysinh;
	private String hinhdaidien;
	private Set taikhoans = new HashSet(0);
	private Set baiviets = new HashSet(0);

	public Nguoidung() {
	}

	public Nguoidung(String tennguoidung, String sodienthoai, Date ngaysinh) {
		this.tennguoidung = tennguoidung;
		this.sodienthoai = sodienthoai;
		this.ngaysinh = ngaysinh;
	}

	public Nguoidung(String tennguoidung, String sodienthoai, Date ngaysinh, String hinhdaidien, Set taikhoans,
			Set baiviets) {
		this.tennguoidung = tennguoidung;
		this.sodienthoai = sodienthoai;
		this.ngaysinh = ngaysinh;
		this.hinhdaidien = hinhdaidien;
		this.taikhoans = taikhoans;
		this.baiviets = baiviets;
	}

	public Integer getManguoidung() {
		return this.manguoidung;
	}

	public void setManguoidung(Integer manguoidung) {
		this.manguoidung = manguoidung;
	}

	public String getTennguoidung() {
		return this.tennguoidung;
	}

	public void setTennguoidung(String tennguoidung) {
		this.tennguoidung = tennguoidung;
	}

	public String getSodienthoai() {
		return this.sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public Date getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getHinhdaidien() {
		return this.hinhdaidien;
	}

	public void setHinhdaidien(String hinhdaidien) {
		this.hinhdaidien = hinhdaidien;
	}

	public Set getTaikhoans() {
		return this.taikhoans;
	}

	public void setTaikhoans(Set taikhoans) {
		this.taikhoans = taikhoans;
	}

	public Set getBaiviets() {
		return this.baiviets;
	}

	public void setBaiviets(Set baiviets) {
		this.baiviets = baiviets;
	}

}
