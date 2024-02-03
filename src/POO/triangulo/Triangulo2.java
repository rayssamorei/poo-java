package POO.triangulo;

import java.util.Scanner;

public class Triangulo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Informe o lado 1: ");
        triangulo.lado1 = entrada.nextDouble();

        System.out.println("Informe o lado 2: ");
        triangulo.lado2 = entrada.nextDouble();

        System.out.println("Informe o lado 3: ");
        triangulo.lado3 = entrada.nextDouble();

        System.out.println("A area do triangulo é: " + triangulo.calcularArea() + "cm");
        triangulo.descobrirTipo(triangulo.lado1, triangulo.lado2, triangulo.lado3);
        System.out.println("O perimetro do triangulo é: " + triangulo.perimetro(triangulo.lado1, triangulo.lado2, triangulo.lado3) + "cm");

        entrada.close();
    }
}
