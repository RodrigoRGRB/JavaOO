public class CriaConta{
    public static void main(String[] args){
      Conta primeiraConta =  new Conta();
      primeiraConta.saldo = 200;

      System.out.println(primeiraConta.saldo);

      Conta segundaConta = new Conta();
      segundaConta.titular = "Rodrigo";
      System.out.println("O nome do titular da segunda conta é " + segundaConta.titular);
    }
}