import modelo.repositorio.FabricaConexao;

public class Main {

	public static void main(String[] args) {
		
		FabricaConexao fc = new FabricaConexao();
		
		fc.abrirConexao();
		
		fc.abrirConexao();
		fc.fecharConexao();
		fc.fecharConexao();
		

	}

}
