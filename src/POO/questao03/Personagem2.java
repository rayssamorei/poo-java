package POO.questao03;
public class Personagem2 {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;
        
        heroi.mostrarStatus();
        // "Personagem: <name> (lvl <nivel>) com <forca> de força."
        heroi.atacar("Hydra", "Golpe Duplo");
        //chamei o metodo "atacar" e passei o argumento string "Hydra"
        System.out.println(heroi.calcularDano());

    }
}
