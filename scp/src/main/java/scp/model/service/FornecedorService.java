package scp.model.service;

import java.util.List;

import scp.model.domain.Fornecedor;

public interface FornecedorService {

	public List<Fornecedor> getFornecedores();

	public Fornecedor salvar(Fornecedor fornecedor);

	public void atualizar(Fornecedor fornecedor);

	public void excluir(Fornecedor fornecedor);

}