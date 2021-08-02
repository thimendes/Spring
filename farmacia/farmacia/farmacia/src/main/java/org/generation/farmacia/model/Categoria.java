package org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull 
	@Size(min = 3, max = 50)
	private String genericos;
	
	@NotNull 
	@Size(min = 3, max = 50)
	private String vitaminas;
	
	@NotNull 
	@Size(min = 3, max = 50)
	private String suplementos;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenericos() {
		return genericos;
	}

	public void setGenericos(String genericos) {
		this.genericos = genericos;
	}

	public String getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(String vitaminas) {
		this.vitaminas = vitaminas;
	}

	public String getSuplementos() {
		return suplementos;
	}

	public void setSuplementos(String suplementos) {
		this.suplementos = suplementos;
	}
	
	

}
