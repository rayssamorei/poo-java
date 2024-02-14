package POO.questao02;

public class Pessoa {
    private int idade;
    private String nome;
    private double altura;

    //<modificador-acesso> <retorno> nomeDoMetodo
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

}
