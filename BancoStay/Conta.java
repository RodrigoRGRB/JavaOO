public class Conta{
  private double saldo;
  int agencia;
  private int numero;
  private Cliente titular;

  public Conta(int agencia, int numero){
    this.agencia = agencia;
    this.numero = numero;
  }

  public void deposita(double valor){
    this.saldo += valor;
  }

  public boolean saca(double valor){
    if(this.saldo >= valor){
      this.saldo -=  valor;
      return true;
    }else{
      return false;
    }
  }

  public boolean transfere(double valor, Conta destino){
    if(this.saldo >= valor){
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public int getNumero(){
    return this.numero;
  }

  public void setNumero(int novoNumero){
    this.numero = novoNumero;
  }

  public int getAgencia(){
    return this.agencia;
  }

  public void setAgencia(int numero){
    this.agencia = numero;
  }

  public void setCliente(Cliente novoCliente){
    this.titular = novoCliente;
  }

  public Cliente getCliente(){
      return this.titular;
  }

}