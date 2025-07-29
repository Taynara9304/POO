import java.util.ArrayList;
import java.util.List;


public class Loja {
    private String nomeSocial;
    private String telefone;
    private String email;
    private final List<ProdutoModel> listaProdutos;

    public Loja(String nomeSocial, String telefone, String email, List<ProdutoModel> listaProdutos) {
        this.nomeSocial = nomeSocial;
        this.telefone = telefone;
        this.email = email;
        this.listaProdutos = new ArrayList<>();
    }

    public String getNomeSocial() {
        return nomeSocial;
    }
    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<ProdutoModel> getListaProdutos() {
        return listaProdutos;
    }
}
