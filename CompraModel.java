import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraModel {
    private ClienteModel cliente;
    private Date dataCompra;
    private TipoPagamento tipoPagamento;
    private List<ProdutoModel> listaProdutos;
    private float valorTotal;
    
    public CompraModel(ClienteModel cliente, Date dataCompra, TipoPagamento tipoPagamento, float valorTotal) {
        this.cliente = cliente;
        this.dataCompra = dataCompra;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
        this.listaProdutos = new ArrayList<>();
    }

    public ClienteModel getCliente() {
        return cliente;
    }
    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    public Date getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public List<ProdutoModel> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(List<ProdutoModel> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
