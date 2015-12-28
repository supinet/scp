package scp.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import scp.model.dao.ProdutoDao;
import scp.model.domain.Produto;

public class ProdutoServiceImpl implements ProdutoService {
	
	@Inject
	private ProdutoDao produtoDao;

	@Override
	public List<Produto> getProdutos() {
		return this.produtoDao.getProdutos();
	}

	@Override
	@Transactional
	public Produto salvar(Produto produto) {
		return produtoDao.salvar(produto);
	}

	@Override
	@Transactional
	public void atualizar(Produto produto) {
		produtoDao.atualizar(produto);
		
	}
	
	@Override
	@Transactional
	public void excluir(Produto produto) {
		produtoDao.excluir(produto);
		
	}
}
