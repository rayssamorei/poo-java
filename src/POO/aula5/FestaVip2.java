package POO.aula5;
//configurando visibilidade de atributos e metodos

/*
private = e possibilita o acesso a atributos e métodos
apenas na classe em que a mesma foi declarada.
public =  permite o acesso de qualquer classe.
protected = as mesmas propriedades do identificador private,
acrescentando a possibilidade de acesso pelas subclasses.
default - package-private - pacote privado
*/

public class FestaVip2 {
    public static void main(String[] args) {
        FestaVip festa = new FestaVip();
        festa.entrar();
    }
}
