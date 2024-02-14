package POO.questao06;
public class Celular2 {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular(); //Objeto
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.sistemaOperacional = "iOS";
        celularA.espacoArmazenamento = 256;

        Celular celularB = new Celular(); //Objeto
        celularB.nome = "Galaxy note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.sistemaOperacional = "Android";
        celularB.espacoArmazenamento = 256;

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.sistemaOperacional = "Android";
        celularC.espacoArmazenamento = 128;

        
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}
