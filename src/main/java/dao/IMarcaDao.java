package dao;

import java.util.List;

import model.Marca;

public interface IMarcaDao {
	
	public Marca cadastrar(Marca marca);
		
	public void excluir(Marca marca);
	
	public List<Marca> buscarTodos();

}
