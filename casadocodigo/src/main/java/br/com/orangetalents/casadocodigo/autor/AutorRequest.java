package br.com.orangetalents.casadocodigo.autor;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class AutorRequest {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank @Length(min = 5, max = 400)
	private String descricao;
	
	
	public AutorRequest(String nome, String email, String descricao) {
		
		this.nome = nome;
		this.email = email;
		this.descricao = descricao;
		
	}
	
	public Autor converter() {
		
		return new Autor(this.nome, this.email, this.descricao);
		
	}
	
}
