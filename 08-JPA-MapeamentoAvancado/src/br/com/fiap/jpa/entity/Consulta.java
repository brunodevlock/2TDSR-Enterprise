package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CONSULTA")
@IdClass(ConsultaPK.class)
public class Consulta {

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="nr_crm")
	private Medico medico;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_paciente")
	private Paciente paciente;
	
	@Id
	@Column(name="dt_consulta")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Column(name="st_convenio")
	private boolean convenio;
	
	@Column(name="ds_consultorio")
	private String consultorio;

	public Consulta(Medico medico, Paciente paciente, Calendar data, boolean convenio, String consultorio) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
		this.convenio = convenio;
		this.consultorio = consultorio;
	}

	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public boolean isConvenio() {
		return convenio;
	}

	public void setConvenio(boolean convenio) {
		this.convenio = convenio;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}
	
}
