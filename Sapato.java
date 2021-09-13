public class Sapato{
	public int codigo;
	public String descricao;
	public char codigoCor;
	public int tamanho;
	public double preco;
	public char genero;
	public int quantidadeEmEstoque;

	public void mostrarInformacoes(){
		System.out.println("Codigo " + codigo);
		System.out.println("Descricao " + descricao);
		System.out.println("Codigo da cor " + codigoCor);
		System.out.println("Tamanho " + tamanho);
		System.out.println("Preco " + preco);
		System.out.println("Genero " + genero);
		System.out.println("Quantidade em estoque " + quantidadeEmEstoque);

	}
}