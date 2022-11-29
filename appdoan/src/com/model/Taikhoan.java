package com.model;

import org.codehaus.jackson.annotate.JsonBackReference;

// Generated Nov 26, 2022 10:26:00 PM by Hibernate Tools 4.3.5.Final

/**
 * Taikhoan generated by hbm2java
 */
public class Taikhoan implements java.io.Serializable {

	private TaikhoanId id;
	@JsonBackReference
	private Nguoidung nguoidung;

	public Taikhoan() {
	}

	public Taikhoan(TaikhoanId id, Nguoidung nguoidung) {
		this.id = id;
		this.nguoidung = nguoidung;
	}

	public TaikhoanId getId() {
		return this.id;
	}

	public void setId(TaikhoanId id) {
		this.id = id;
	}

	public Nguoidung getNguoidung() {
		return this.nguoidung;
	}

	public void setNguoidung(Nguoidung nguoidung) {
		this.nguoidung = nguoidung;
	}

}