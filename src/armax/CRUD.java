package armax;

public interface CRUD {

	public void inserir(Object obj);
	public Object buscar(Object obj);
	public void atualizar(Object obj, Object novoObj);
	public void deletar(Object obj);
}
