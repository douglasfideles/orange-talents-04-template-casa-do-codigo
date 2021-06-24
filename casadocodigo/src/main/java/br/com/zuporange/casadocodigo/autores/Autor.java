package br.com.zuporange.casadocodigo.autores;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
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
	
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	public Autor() {}

	public Autor(String nome, String email, String descricao) {
		
		this.nome = nome;
		this.email = email;
		this.descricao = descricao;

	}

	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}



	
	
}
