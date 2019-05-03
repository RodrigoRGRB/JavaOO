public class CriaConta{
    public static void main(String[] args){

        Conta contaDoRodrigo = new Conta();
    Conta teste = new Conta();

    contaDoRodrigo.deposita(100);
    boolean conseguiuRetirar =contaDoRodrigo.saca(20);
    contaDoRodrigo.deposita(60);



    Conta contaDaMarcela = new Conta();
    contaDaMarcela.deposita(1000);

    if(contaDaMarcela.transfere(3000, contaDoRodrigo)){
      System.out.println("Transferencia feita com sucesso");
    }else{
      System.out.println("faltou dinheiro");
    }
    System.out.println(contaDoRodrigo.getSaldo());
    System.out.println(teste.getSaldo());
    System.out.println(contaDaMarcela.getSaldo());

    Cliente rodrigo = new Cliente();
    rodrigo.nome = "Rodrigo Gabriel";
    rodrigo.cpf = "22.2.2.2.2.";
    rodrigo.profissao = "Diagramador";

    contaDoRodrigo.titular = rodrigo;
    System.out.println(contaDoRodrigo.titular.nome);

    contaDoRodrigo.setAgencia(1113);
    contaDoRodrigo.setNumero(1000001);

    System.out.println("Numero da agencia: "+ contaDoRodrigo.getAgencia() + "\nNumero da conta: "+contaDoRodrigo.getNumero());

    }
}