package edu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VisitanteControl {

	private List<Visitante> visitantesLista = new ArrayList<>();
	private StringProperty id = new SimpleStringProperty("");
	private StringProperty nomeVisitante = new SimpleStringProperty("");
	private StringProperty nomeEscola = new SimpleStringProperty("");
	private StringProperty data = new SimpleStringProperty("");
	
	public StringProperty idProperty() {
		return id;
	}
		
	public StringProperty nomeVisitanteProperty() {
		return nomeVisitante;
	}
	
	public StringProperty nomeEscolaProperty() {
		return nomeEscola;
	}
	
	public StringProperty dataProperty() {
		return data;
	}
	
	public Visitante boundaryToEntity() {
		Visitante visitante = new Visitante();
		visitante.setNomeVisitante(nomeVisitante.get());
		visitante.setNomeEscola(nomeEscola.get());
		try {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
			Date dataVisita = formato.parse(data.get());
			visitante.setDataVisita(dataVisita);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return visitante;
	}
	
	public void entityToBoundary(Visitante visitante) {
		if(visitante != null) {
			id.set(String.valueOf(visitante.getId()));
			nomeVisitante.set(visitante.getNomeVisitante());
			nomeEscola.set(visitante.getNomeEscola());
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			data.set(formato.format(visitante.getDataVisita()));
		}
	}
	
	public void adicionar() {
		visitantesLista.add(boundaryToEntity());
	}
	
	public void pesquisar() {
		Iterator<Visitante> iterator = visitantesLista.iterator();
		while(iterator.hasNext()) {
			Visitante next = iterator.next();
			if (next != null && next.getNomeVisitante() != null && next.getNomeVisitante().contains(nomeVisitante.get())) {
                entityToBoundary(next);
            }
		}
	}

	public String getId() {
		return id.get();
	}
	
	public void setId(String id) {
		this.id.set(id);
	}
	
	public String getNomeVisitante() {
		return nomeVisitante.get();
	}
	
	public void setNomeVisitante(String nomeVisitante) {
		this.nomeVisitante.set(nomeVisitante);
	}
	
	public String getNomeEscola() {
		return nomeEscola.get();
	}
	
	public void setNome(String nomeEscola) {
		this.nomeEscola.set(nomeEscola);
	}
	
	public String getData() {
		return data.get();
	}
	
	public void setData(String data) {
		this.data.set(data);
	}
	
}
