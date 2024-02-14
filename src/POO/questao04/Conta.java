package POO.questao04;

public class Conta {
    //atributos
    private int numConta;
    private int numAgencia;
    private double extrato;
    private String titular;
    
    //métodos

    //métodos de saque e deposito da conta
    public void saque (double valor){
        extrato -= valor;
    }

    public void deposito (double valor){
        extrato += valor;
    }

    //métodos de get - que servem para pegar um valor e set - que servem para alterar o valor
    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumAgencia(){
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia){
        this.numAgencia = numAgencia;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getExtrato(){
        return extrato;
    }
}
