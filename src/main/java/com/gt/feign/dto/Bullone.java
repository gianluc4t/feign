package com.gt.feign.dto;

public class Bullone {

	private long id;
	private String nome;
	private String descrizione;
	
	public Bullone() {
		id = 1;
		nome = "azzaleo";
		descrizione = "zizzania";
	}
	
	public Bullone(long id) {
		this();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Bullone [id=" + id + ", nome=" + nome + ", descrizione="
				+ descrizione + "]";
	}
	
}
