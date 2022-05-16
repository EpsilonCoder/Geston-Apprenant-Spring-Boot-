package com.epsilon.com.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Simplon implements Serializable {

	@Id @GeneratedValue
	private int id;
	private String prenom;
	private String nom;
	private String email;
	private String address;
	private String tel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Simplon() {
		super();
	}

	public Simplon(String prenom, String nom, String email, String address, String tel) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.address = address;
		this.tel = tel;
	}

}
