package com.example.demo;

public class Wilaya {

	@Override
	public String toString() {
		return "Wilaya [id=" + id + ", actif=" + actif + ", compte_creation=" + compte_creation + ", compte_maj="
				+ compte_maj + ", date_creation=" + date_creation + ", date_maj=" + date_maj + ", nom_arabe="
				+ nom_arabe + ", nom_latin=" + nom_latin + ", nom_tamazight=" + nom_tamazight + "]";
	}
	private long id;
    private boolean actif;
    private long compte_creation; 
    private long compte_maj;    
    private String date_creation;    
    private String date_maj;
    private String nom_arabe;
    private String nom_latin;
    private String nom_tamazight;

	
		public Wilaya(long id, boolean actif, long compte_creation, long compte_maj, String date_creation, String date_maj,
			String nom_arabe, String nom_latin, String nom_tamazight) {
		super();
		this.id = id;
		this.actif = actif;
		this.compte_creation = compte_creation;
		this.compte_maj = compte_maj;
		this.date_creation = date_creation;
		this.date_maj = date_maj;
		this.nom_arabe = nom_arabe;
		this.nom_latin = nom_latin;
		this.nom_tamazight = nom_tamazight;
	}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public boolean isActif() {
			return actif;
		}
		public void setActif(boolean actif) {
			this.actif = actif;
		}
		public long getCompte_creation() {
			return compte_creation;
		}
		public void setCompte_creation(long compte_creation) {
			this.compte_creation = compte_creation;
		}
		public long getCompte_maj() {
			return compte_maj;
		}
		public void setCompte_maj(long compte_maj) {
			this.compte_maj = compte_maj;
		}
		public String getDate_creation() {
			return date_creation;
		}
		public void setDate_creation(String date_creation) {
			this.date_creation = date_creation;
		}
		public String getDate_maj() {
			return date_maj;
		}
		public void setDate_maj(String date_maj) {
			this.date_maj = date_maj;
		}
		public String getNom_arabe() {
			return nom_arabe;
		}
		public void setNom_arabe(String nom_arabe) {
			this.nom_arabe = nom_arabe;
		}
		public String getNom_latin() {
			return nom_latin;
		}
		public void setNom_latin(String nom_latin) {
			this.nom_latin = nom_latin;
		}
		public String getNom_tamazight() {
			return nom_tamazight;
		}
		public void setNom_tamazight(String nom_tamazight) {
			this.nom_tamazight = nom_tamazight;
		}


	
}
