package br.com.java.models;

import java.io.Serializable;

public class Pessoa implements Serializable
{
	private static final long serialVersionUID = -1243993196713645765L;
	private long id;
	private String nome;
	private String cpf;
	private String email;
	
	public Pessoa()
	{
		this.id = 0;
		this.nome = "";
		this.cpf = "";
		this.email = "";
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
}
