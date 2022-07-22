package br.gov.rj.ifrj.estoque.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {
	
	@NotBlank(message = "Preencha o nome")
	private String nome;
	
	@NotBlank(message = "Preencha o cpf")
	private String cpf;
	
	@NotBlank(message = "Preencha o rg")
	@Size(max = 11)
	private String rg;

	@NotBlank(message = "Preencha o e-mail")
	private String email;
	
	private Sexo sexo;
	
	@NotNull(message = "Preencha o celular")
	@Size(max = 13)
	private String celular;
	
	private Uf uf;
	
	@NotNull(message = "Preencha a cidade")
	private String cidade;
	
	@NotNull(message = "Preencha a cidade")
	private String bairro;
	
	@NotNull(message = "Preencha o CEP")
	private String cep;
	
	@NotNull(message = "Preencha o número")
	private int numero;
	
	private String complemento;
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
