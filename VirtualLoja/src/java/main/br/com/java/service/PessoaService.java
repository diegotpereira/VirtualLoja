package br.com.java.service;

import java.util.List;

import br.com.java.models.Pessoa;

public interface PessoaService {
	
	public void addPessoa(Pessoa pessoa);

	public List<Pessoa> getAllPessoas();

	public void deletePessoa(Integer pessoaId);

	public Pessoa getPessoa(int pessoaid);

	public Pessoa updatePessoa(Pessoa pessoa);

}
