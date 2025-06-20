public class Employee {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }
}
