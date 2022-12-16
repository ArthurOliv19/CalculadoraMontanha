public class Calculadora {
    public static double setFhd;
    public String Nome;
    public double SalarioMensal;

    private int diasUteis = 20;
    private double fhd;

    public double horasUteisMes = diasUteis * fhd;

    public double CalcularValorHora() {
        return ((SalarioMensal * 2) / horasUteisMes);
    }

    public int getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(int diasUteis) {
        this.diasUteis = diasUteis;
    }

    public double getFhd() {
        return fhd;
    }

    public void setFhd(double fhd) {
        this.fhd = fhd;
    }
}
