package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "signo")
public class Signo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signo_paciente"))
	private Paciente paciente;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;

	@Size(min = 3, max = 5, message = "temperatura debe tener minimo 3 y maximo 5 caracteres ")
	@Column(name = "temperatura", length = 5, nullable = true)
	private String temperatura;
	
	@Size(min = 1, max = 5, message = "pulso debe tener minimo 1 y maximo 5 caracteres ")
	@Column(name = "pulso", length = 5, nullable = true)
	private String pulso;
	
	@Size(min = 1, max = 5, message = "ritmo respiratorio debe tener minimo 1 y maximo 5 caracteres")
	@Column(name = "ritmo_respiratorio", length = 5, nullable = true)
	private String ritmoRespiratorio;

	public Integer getIdSigno() {
		return idSigno;
	}

	public void setIdSigno(Integer idSignos) {
		this.idSigno = idSignos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmoRespiratorio() {
		return ritmoRespiratorio;
	}

	public void setRitmoRespiratorio(String ritmoRespiratorio) {
		this.ritmoRespiratorio = ritmoRespiratorio;
	}
	
	
}
