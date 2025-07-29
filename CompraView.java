public class CompraView {
    private CompraModel compraModel;

    public void imprimirDadosCompra() {
        System.out.println("Nome do cliente: " + compraModel.getCliente().getNome());
        System.out.println("Data da compra: " + compraModel.getDataCompra());
        System.out.println("Tipo de pagamento: " + compraModel.getTipoPagamento());
        System.out.println("Valor total: " + compraModel.getValorTotal());
        System.out.println("Quantidade de produtos: " + compraModel.getListaProdutos().size());
    }

    public void imprimirListaProdutos() {
        
    }
}
