public class SegundoPunto {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        double x = 2.25;

        double potencia = Math.pow(10, -6);
        double error_sec = (0.5 * potencia) * (100);
        double error_actual = 100;
        int potenciaFormula = 1;
        int count = 1;
        double valorAc = 1;
        double valorAn = 0;
        double resultado = 1;

        while (error_actual > error_sec) {
            valorAn = valorAc;

            resultado += Math.pow(x, potenciaFormula) / Factorial(potenciaFormula);

            valorAc = 1 / resultado;

            error_actual = Math.abs((valorAc - valorAn) / valorAc) * 100;

            potenciaFormula += 1;
            count++;

            System.out.println("Valor: " + valorAc);
            System.out.println("Error aproximado: " + error_actual);
            System.out.println("num de iteración: " + count);
            System.out.println("=================================================");

        }

    }

    public static double Factorial(int numero) {
        double respuesta = 1;
        for (int i = 2; i <= numero; i++) {
            respuesta *= i;
        }
        return respuesta;
    }

}