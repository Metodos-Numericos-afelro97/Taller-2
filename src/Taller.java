public class Taller {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        double x = 2.25;
        double es = (0.5 * Math.pow(10, -6)) * 100;
        double ea;
        double val = 0;
        int signo = 1;
        int contador = 0;
        int potencia = 0;
        do {
            double valAnt = val;

            ea = Math.abs((val - valAnt) / val) * 100;

            signo = signo * -1;
            contador++;
            potencia++;
        } while (ea > es);
        System.out.println(Math.exp(-x));
        System.out.println("Resultado: " + val);
        System.out.println("Error aproximado: = " + ea + "%");
        System.out.println("Iteraciones = " + contador);
    }
}


