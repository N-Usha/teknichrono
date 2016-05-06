package org.jboss.tools.example.forge.model;
// Generated 5 mai 2016 11:08:49 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Pilots generated by hbm2java
 */
@Entity
@XmlRootElement
public class Pilots implements java.io.Serializable {

	private int id;
	private int idShop;
	private String nom;
	private String prenom;
	private String moto;
	private String cylindree;
	private int groupe;
	private int beacon;

	public Pilots() {
	}

	public Pilots(int id, int idShop, String nom, String prenom, String moto,
			String cylindree, int groupe, int beacon) {
		this.id = id;
		this.idShop = idShop;
		this.nom = nom;
		this.prenom = prenom;
		this.moto = moto;
		this.cylindree = cylindree;
		this.groupe = groupe;
		this.beacon = beacon;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ID_SHOP", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "NOM", nullable = false)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "PRENOM", nullable = false)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "MOTO", nullable = false)
	public String getMoto() {
		return this.moto;
	}

	public void setMoto(String moto) {
		this.moto = moto;
	}

	@Column(name = "CYLINDREE", nullable = false)
	public String getCylindree() {
		return this.cylindree;
	}

	public void setCylindree(String cylindree) {
		this.cylindree = cylindree;
	}

	@Column(name = "GROUPE", nullable = false)
	public int getGroupe() {
		return this.groupe;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	@Column(name = "BEACON", nullable = false)
	public int getBeacon() {
		return this.beacon;
	}

	public void setBeacon(int beacon) {
		this.beacon = beacon;
	}

}
