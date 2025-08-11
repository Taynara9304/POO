public class ProdutoView {
    private ProdutoModel produtoModel;

    public void imprimirDadosProdutos() {
        System.out.println("Nome do produto: " + produtoModel.getNome());
        System.out.println("Descrição: " + produtoModel.getDescricao());
        System.out.println("Preço: " + produtoModel.getPreco());
    }
}
