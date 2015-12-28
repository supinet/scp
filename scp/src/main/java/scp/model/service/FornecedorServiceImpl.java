package scp.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import scp.model.dao.FornecedorDao;
import scp.model.domain.Fornecedor;

public class FornecedorServiceImpl implements FornecedorService {
	
	@Inject
	private FornecedorDao fornecedorDao;

	@Override
	public List<Fornecedor> getFornecedores() {
		return fornecedorDao.getFornecedores();
	}

	@Override
	@Transactional
	public Fornecedor salvar(Fornecedor fornecedor) {
		return fornecedorDao.salvar(fornecedor);
	}

	@Override
	@Transactional
	public void atualizar(Fornecedor fornecedor) {
		fornecedorDao.atualizar(fornecedor);
		
	}
	
	@Override
	@Transactional
	public void excluir(Fornecedor fornecedor) {
		fornecedorDao.excluir(fornecedor);
		
	}
}
