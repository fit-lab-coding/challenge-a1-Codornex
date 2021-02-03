package fit.challenge;

public class ImcCalculator {
    public static String calculate(double vPeso, double vAltura) {
        double imc = vPeso / (Math.pow(vAltura, 2));
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }
}
