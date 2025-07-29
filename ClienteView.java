public class ClienteView {
    private ClienteModel cliendeModel;

    public void imprimirDadosPerfil() {
        System.out.println("Nome: " + cliendeModel.getNome());
        System.out.println("Email: " + cliendeModel.getEmail());
        System.out.println("CPF: " + cliendeModel.getCpf());
        System.out.println("Data de nascimento: " + cliendeModel.getDataNascimento());
        System.out.println("Endereço: " + cliendeModel.getNome());
    }

    public void imprimirHistoricoCompras() {
        System.out.println(cliendeModel.getListaCompras());
    }
}
