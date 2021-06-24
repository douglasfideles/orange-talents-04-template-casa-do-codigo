package br.com.zuporange.casadocodigo.autores;

import java.time.OffsetDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@NotEmpty 
    @Length(max = 30)
	private String nome;
	
	
	@NotNull
	@NotEmpty 
	@Length(max = 30)
 	@Email
	private String email;
	
	
	@NotNull
	@NotEmpty 
	@Length(max = 400)
	private String descricao;
	
	private OffsetDateTime dataCriacao;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Autor() {

	}

	public Autor(String nome, String email, String descricao, OffsetDateTime dataCriacao) {
		this.nome = nome;
		this.email = email;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;

	}

	
	
}
