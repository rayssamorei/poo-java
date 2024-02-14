package POO.questao05;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    //método construtor - são os primeiros métodos chamados ao criar uma classe
    // pode ser utilizado parametros mas não é recomendavel mais de 3-4 parametros
    public Pessoa(String nome, int idade, float altura){
        System.out.println("Uma pessoa acabou de nascer!");
        //pode ser utilizados para inicializar, mandar mensagens e chamar métodos
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDados(){
        System.out.format("Nome: %s, idade = %d e %.2fm\n", nome, idade, altura);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getAltura() {
        return altura;
    }
    
}
