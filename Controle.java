public class Controle{

  double soma;

  public double total(Funcionario f){
    this.soma = this.soma + f.getBonificacao();
    return this.soma;
  }


}