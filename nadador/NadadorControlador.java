// package nadador;
// import java.time.LocalDate;

// public class NadadorControlador {
//     private NadadorModelo modelo;
//     private NadadorView view;
    
//     public NadadorControlador(NadadorModelo modelo, NadadorView view){
//         this.modelo = modelo;
//         this.view = view;
//      }
  
//     public String getNome() {
//         return modelo.getNome();
//     }
//     public void setNome(String nome) {
//         modelo.setNome(nome);
//     }
//     public LocalDate getDataNascimento() {
//         return modelo.getDataNascimento();
//     }
//     public void setDataNascimento(LocalDate dataNascimento) {
//         modelo.setDataNascimento(dataNascimento);
//     }
//     public String getClasse() {
//         return modelo.getClasse();
//     }
//     public void setClasse(String classe) {
//         modelo.setClasse(classe);
//     }
//     public int getQtdVitorias() {
//         return modelo.getQtdVitorias();
//     }
//     public void setQtdVitorias(int qtdVitorias) {
//         modelo.setQtdVitorias(qtdVitorias);
//     }
//      public void updateView(){				
//         view.imprimirDados(modelo.getNome(), modelo.getDataNascimento(), modelo.getClasse(), modelo.getQtdVitorias());
//      }	
// }
