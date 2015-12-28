package scp.model.service;

import java.util.List;

import scp.model.domain.Produto;

public interface ProdutoService {

	public List<Produto> getProdutos();

	public Produto salvar(Produto produto);

	public void atualizar(Produto produto);

	public void excluir(Produto produto);

}