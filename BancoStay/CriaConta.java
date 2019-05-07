public class CriaConta{
  //cria conta
  public static void main(String[] args){

    // Controle c = new Controle();

    // Funcionario f  = new Funcionario();
    // System.out.println(f.getBonificacao());

    // Gerente g = new Gerente();
    // System.out.println(g.getBonificacao());

    // c.total(f);
    // c.total(g);
    // System.out.println(c.soma);

  ContaCorrente cc = new ContaCorrente(111,111);
  cc.deposita(100.0);

  ContaPoupanca cp = new ContaPoupanca(222,222);
  cp.deposita(100.0);

  cc.transfere(10.0, cp);

  System.out.println("CC: " + cc.getSaldo());
  System.out.println("CP: " + cp.getSaldo());



  }
}