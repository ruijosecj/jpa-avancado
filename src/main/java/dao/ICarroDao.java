package dao;

import java.util.List;

import model.Carro;

public interface ICarroDao {
	
	public Carro cadastrar(Carro carro);
	
	public void excluir(Carro carro);
	 
	public List<Carro> buscarTodos();
	
}
