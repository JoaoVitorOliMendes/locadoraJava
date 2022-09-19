package com.atividadePoo.fabrica;

public class Fita {

	private int id;
	private String nome;
	private String genero;
	private int duracaoMin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracaoMin() {
		return duracaoMin;
	}
	public void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}
	public Fita(int id, String nome, String genero, int duracaoMin) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.duracaoMin = duracaoMin;
	}
	public Fita() {
		super();
	}
	@Override
	public String toString() {
		return "Fita [id=" + id + ", nome=" + nome + ", genero=" + genero + ", duracaoMin=" + duracaoMin + "]";
	}
	
}
