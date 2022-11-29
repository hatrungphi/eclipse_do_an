package com.model;
// Generated Nov 21, 2022 3:37:39 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Theloai generated by hbm2java
 */
@Entity
@Table(name = "theloai", catalog = "dbqbamthuc", uniqueConstraints = @UniqueConstraint(columnNames = "tentheloai"))
public class Theloai implements java.io.Serializable {

	private Integer matheloai;
	private String tentheloai;
	private Set<Baiviet> baiviets = new HashSet<Baiviet>(0);

	public Theloai() {
	}

	public Theloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}

	public Theloai(String tentheloai, Set<Baiviet> baiviets) {
		this.tentheloai = tentheloai;
		this.baiviets = baiviets;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "matheloai", unique = true, nullable = false)
	public Integer getMatheloai() {
		return this.matheloai;
	}

	public void setMatheloai(Integer matheloai) {
		this.matheloai = matheloai;
	}

	@Column(name = "tentheloai", unique = true, nullable = false, length = 30)
	public String getTentheloai() {
		return this.tentheloai;
	}

	public void setTentheloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "theloais")
	public Set<Baiviet> getBaiviets() {
		return this.baiviets;
	}

	public void setBaiviets(Set<Baiviet> baiviets) {
		this.baiviets = baiviets;
	}

}
