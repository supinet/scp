package scp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import scp.model.domain.Fornecedor;

public class FornecedorDaoImpl implements FornecedorDao {
	
	@PersistenceContext(unitName="scpPU")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Fornecedor> getFornecedores() {
		Query query = entityManager.createQuery("from Fornecedor");
		return query.getResultList();
	}

	@Override
	public Fornecedor salvar(Fornecedor fornecedor) {
		entityManager.persist(fornecedor);
		return fornecedor;
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		Fornecedor fornecedorMerge = entityManager.merge(fornecedor);
		entityManager.persist(fornecedorMerge);
	}

	@Override
	public void excluir(Fornecedor fornecedor) {
		Fornecedor fornecedorMerge = entityManager.merge(fornecedor);
		entityManager.remove(fornecedorMerge);
	}
}
