import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteModel {
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private final List<CompraModel> listaCompras;
    
    public ClienteModel(String nome, String email, String cpf, Date dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        listaCompras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<CompraModel> getListaCompras() {
        return this.listaCompras;
    }
}
