public class CriaConta{
    public static void main(String[] args){
     Conta contaDoRodrigo = new Conta();
    Conta teste = new Conta();

    contaDoRodrigo.saldo = 100;
    boolean conseguiuRetirar =contaDoRodrigo.saca(20);
    contaDoRodrigo.deposita(60);
    Conta contaDaMarcela = new Conta();
    contaDaMarcela.saldo = 1000;

    if(contaDaMarcela.transfere(3000, contaDoRodrigo)){
      System.out.println("Transferencia feita com sucesso");
    }else{
      System.out.println("faltou dinheiro");
    }
    System.out.println(contaDoRodrigo.saldo);
    System.out.println(teste.saldo);
    System.out.println(contaDaMarcela.saldo);

    Cliente rodrigo = new Cliente();
    rodrigo.nome = "Rodrigo Gabriel";
    rodrigo.cpf = "22.2.2.2.2.";
    rodrigo.profissao = "Diagramador";

    contaDoRodrigo.titular = rodrigo;
    System.out.println(contaDoRodrigo.titular.nome);

}