package br.com.java.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.java.models.Pessoa;

@Repository
public class PessoaDAOImpl implements PessoaDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addPessoa(Pessoa pessoa) {
		sessionFactory.getCurrentSession().saveOrUpdate(pessoa);

	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> getAllPessoas() {

		return sessionFactory.getCurrentSession().createQuery("from Pessoa")
				.list();
	}

	@Override
	public void deletePessoa(Integer pessoaId) {
		Pessoa pessoa = (Pessoa) sessionFactory.getCurrentSession().load(
				Pessoa.class, pessoaId);
		if (null != pessoa) {
			this.sessionFactory.getCurrentSession().delete(pessoa);
		}

	}

	public Pessoa getPessoas(int empid) {
		return (Pessoa) sessionFactory.getCurrentSession().get(
				Pessoa.class, empid);
	}

	@Override
	public Pessoa updatePessoa(Pessoa pessoa) {
		sessionFactory.getCurrentSession().update(pessoa);
		return pessoa;
	}
}
