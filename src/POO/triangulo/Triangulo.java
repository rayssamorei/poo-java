package POO.triangulo;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    
    double calcularArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        //semi-perimetro
        //formula de herão para calcular sem precisar da altura e da base
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    void descobrirTipo (double lado1, double lado2, double lado3){
        String tipo;
        if(lado1 == lado2 && lado2 == lado3){
            tipo = "Equilátero";
        } else if(lado1 != lado2 && lado2 != lado3){
            tipo = "Escaleno";
        } else {
            tipo = "Isósceles";
        }
        System.out.println("O tipo do triangulo de acordo com seus lados é: " + tipo);
    }

    double perimetro(double lado1, double lado2, double lado3){
        return lado1+lado2+lado3;
    }
}
