package br.com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.dao.PessoaDAO;
import br.com.java.models.Pessoa;

@Service ("pessoaService")
@Transactional
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired 
	private PessoaDAO pessoaDAO;

	@Override
	@Transactional
	public void addPessoa(Pessoa pessoa) {
		pessoaDAO.addPessoa(pessoa);
	}

	@Override
	@Transactional
	public List<Pessoa> getAllPessoas() {
		return pessoaDAO.getAllPessoas();
	}

	@Override
	@Transactional
	public void deletePessoa(Integer pessoaId) {
		pessoaDAO.deletePessoa(pessoaId);
	}

	public Pessoa getPessoa(int empid) {
		return pessoaDAO.getPessoas(empid);
	}

	public Pessoa updatePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return pessoaDAO.updatePessoa(pessoa);
	}

	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}





}
