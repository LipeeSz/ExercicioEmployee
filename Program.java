import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println();
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }
}
