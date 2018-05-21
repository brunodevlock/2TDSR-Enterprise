package br.com.fiap.nac.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="NAC_APARTAMENTO")
@SequenceGenerator(name="ap",sequenceName="SEQ_NAC_APARTAMENTO",allocationSize=1)
public class Apartamento {

	@Id
	@GeneratedValue(generator="ap",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(length=150,nullable=false)
	private String endereco;
	
	@Column(length=300)
	private String detalhes;
	
	@Lob
	private byte[] foto;
	
	@OneToMany(mappedBy="apartamento")
	private List<Locacao> locacoes;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	
	
}
