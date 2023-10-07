package dao;

import java.util.List;

import model.Acessorio;

public interface IAcessorioDao {
	public Acessorio cadastrar(Acessorio acessorio);
	
	public void excluir(Acessorio acessorio);
	
	public List<Acessorio> buscarTodos();

}
