package POO.questao04;

public class Teste {
    public static void main(String[] args) {

        //Criando o objeto conta e atribuindo valores
        Conta c = new Conta();
        c.saque(200);
        c.deposito(150);
        c.setNumAgencia(1);
        c.setNumConta(1478);
        c.setTitular("Carlos");

        //imprimir na tela as informações
        System.out.println("Número da agencia: " + c.getNumAgencia());
        System.out.println("Número da conta: " + c.getNumConta());
        System.out.println("Número do titular: " + c.getTitular());
    }
}
