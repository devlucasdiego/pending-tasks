package com.lucas.pendingtasks.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class PendingTasks {

	private Integer id;
	private String titulo;
	private String descricao;
	private LocalDateTime dataFinalizar;
	private Boolean finalizado = false;

	public PendingTasks() {
		super();
	}

	public PendingTasks(Integer id, String titulo, String descricao, LocalDateTime dataFinalizar, Boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataFinalizar = dataFinalizar;
		this.finalizado = finalizado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataFinalizar() {
		return dataFinalizar;
	}

	public void setDataFinalizar(LocalDateTime dataFinalizar) {
		this.dataFinalizar = dataFinalizar;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PendingTasks other = (PendingTasks) obj;
		return Objects.equals(id, other.id);
	}

}
