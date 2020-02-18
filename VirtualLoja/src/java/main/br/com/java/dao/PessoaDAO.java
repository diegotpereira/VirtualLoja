package br.com.java.dao;

import java.util.List;

import br.com.java.models.Pessoa;

public interface PessoaDAO {
	
	public void addPessoa(Pessoa pessoa);

	public List<Pessoa> getAllPessoas();

	public void deletePessoa(Integer pessoaId);

	public Pessoa updatePessoa(Pessoa pessoa);

	public Pessoa getPessoas(int pessoaid);

}
