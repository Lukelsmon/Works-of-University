package poo;

public class numero {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }
    public int subtrair(int a, int b) {
        return a - b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        Sobrecarregado calc = new Sobrecarregado();

        system.out.printIn("Teste de Inteiros");
        int resultado_da_soma_int = calc.somar(10, 5);
        int resultado_da_subtracao_int = calc.subtrair(10, 5);

        system.out.printIn("\n Teste de Decimais");
        double resultado_soma_double = calc.somar(10.5, 3.2);
        double resultado_subtracao_double = calc.subtrair(10.5, 3.2);

        system.out.printIn("Soma Double: 10.5 + 3.2 = " + resultado_soma_double);
        system.out.printIn("Subtração Double: 10.5 - 3.2 = " + resultado_subtracao_double);

        system.out.printIn("\n Teste de Valores Mistos");
        double resultado_misto01 = calc.somar(5, 3.7);
        double resultado_misto02 = calc.subtrair(8.5, 2);

        system.out.printIn("Soma Mista: 5 + 3.7 =" + resultado_misto01);
        system.out.printIn("Subtração Mista: 8.5 - 2 = " + resultado_misto02);

        system.out.printIn("\n Teste de números Negativos");
        int resultado_negativo_int = calc.somar(-5, 8);
        double resultado_negativo_double = calc.subtrair(-2.5, 1.3);

        system.out.printIn("Soma com negativos Int: -5 + 8 = " + resultado_negativo_int);
        system.out.printIn("Subtração com negativo Double: -2.5 - 1.3 = " _ resultado_negativo_double);
    }
}