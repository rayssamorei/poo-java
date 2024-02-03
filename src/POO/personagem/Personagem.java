package POO.personagem;
import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;


    //metodos começam com letra minuscula
    // void - nao tem retorno
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    //metodo que recebe como parametro alvo do tipo string


    int calcularDano() {
        Random gerador = new Random();
        // 1... 20
        // nextInt(); 0...19
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    void atacar(String alvo, String habilidade){
        //se eu passo uma string vazia o tamanho(.length()) é igual a 0
        int danoCausado = calcularDano();
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou %s contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
        }
    }
}
