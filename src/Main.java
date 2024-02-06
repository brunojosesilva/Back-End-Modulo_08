
public class Main {

    public static void main(String[] args) {

        double nota1 = 7;
        System.out.println("Valor da nota 1: " + nota1);

        double nota2 = 5;
        System.out.println("Valor da nota 2: " + nota2);

        double nota3 = 6;
        System.out.println("Valor da nota 3: " + nota3);

        double nota4 = 7;
        System.out.println("Valor da nota 4: " + nota4);

        // Calcula a média
        double media = calcularMedia(nota1, nota2, nota3, nota4);

        // Exibe a média
        System.out.println("A média das notas é: " + media);

    }

    // Método para calcular a média
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
}