package POO.questao07;

public class FestaVip {
    // <modificador> <tipo> <nome-atributo>
    public int qtdCafe = 30;
    public int qtdSalgado = 50;

    public void entrar(){
        beberCafe();
        comerSalgado();
    }
    
    // <modificador> <retorno-metodo> <nome-metodo>
    private void beberCafe() {
        qtdCafe--;
        System.out.println("Bebeu 1 xicara de café");
    }

    private void comerSalgado() {
        qtdSalgado--;
        System.out.println("Comeu 5 salgados");
    }
}
