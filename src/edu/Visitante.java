package edu;

import java.util.Date;

public class Visitante {

	private long id = 0L;
	private String nomeVisitante = "";
	private String nomeEscola = "";
	private Date dataVisita;
	private static long SEQUENCIAL = 1L;
	
	public Visitante() {
		this.id = SEQUENCIAL++;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNomeVisitante() {
		return nomeVisitante;
	}
	
	public void setNomeVisitante(String nomeVisitante) {
		this.nomeVisitante = nomeVisitante;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public Date getDataVisita() {
		return dataVisita;
	}
	
	public void setDataVisita(Date dataVisita) {
		this.dataVisita = dataVisita;
	}
	
	@Override
	public String toString() {
		return "Visitante [id=" + id + ", nomeVisitante=" + nomeVisitante + ", nomeEscola=" + nomeEscola
				+ ", dataVisita=" + dataVisita + "]";
	}
	
}
