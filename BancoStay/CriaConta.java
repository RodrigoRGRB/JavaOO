public class CriaConta{
    public static void main(String[] args){

    Cliente rodrigo = new Cliente();
    rodrigo.setNome("Rodrigo");

    Conta conta = new Conta();
    conta.setCliente(rodrigo);

    System.out.println(conta.getCliente().getNome());

    }
}