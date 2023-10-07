package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MARCA")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
	@SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 1)
	private Long id;
	private String marca;
	private String descricao;
	
	@ManyToMany
	@JoinTable(name = "TB_MARCA_ACESSORIO",
	joinColumns = {@JoinColumn(name="id_marca_fk")},
	inverseJoinColumns = {@JoinColumn(name = "id_acessorio_fk")}
	)
	private List<Acessorio> acessorios = new ArrayList<Acessorio>();
	
	@OneToMany(mappedBy = "marca")
	private List<Carro> carros = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public List<Carro> getCarros() {
		return carros;
	}
	
}
