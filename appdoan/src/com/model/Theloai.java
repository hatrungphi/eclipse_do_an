package com.model;
// Generated Nov 26, 2022 10:26:00 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Theloai generated by hbm2java
 */
public class Theloai implements java.io.Serializable {

	private Integer matheloai;
	private String tentheloai;
	private Set baiviets = new HashSet(0);

	public Theloai() {
	}

	public Theloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}

	public Theloai(String tentheloai, Set baiviets) {
		this.tentheloai = tentheloai;
		this.baiviets = baiviets;
	}

	public Integer getMatheloai() {
		return this.matheloai;
	}

	public void setMatheloai(Integer matheloai) {
		this.matheloai = matheloai;
	}

	public String getTentheloai() {
		return this.tentheloai;
	}

	public void setTentheloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}

	public Set getBaiviets() {
		return this.baiviets;
	}

	public void setBaiviets(Set baiviets) {
		this.baiviets = baiviets;
	}

}