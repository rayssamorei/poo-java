package POO.questao02;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setAltura(1.73);
        p.setIdade(16);
        p.setNome("Rayssa");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Altura: " + p.getAltura());
    }
}