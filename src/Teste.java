import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTeste Funcionário: ");
        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o endereco: ");
        String endereco = scanner.nextLine();
        System.out.println("Informe o sexo(F ou M): ");
        char sexo = scanner.nextLine().charAt(0);;
        System.out.println("Informe a cor de sua calculadora: ");
        String corCalculadora = scanner.nextLine();

        FuncionarioCaixa funcionario = new FuncionarioCaixa(nome, endereco, sexo, new Calculadora(corCalculadora));
        funcionario.imprimeInfo();

        System.out.println("\nTeste Operações: ");
        System.out.println("2 + 2: " + funcionario.soma(2, 2));
        System.out.println("5 - 4: " + funcionario.subtrai(5, 4));
        System.out.println("2 x 3: " + funcionario.multiplica(2, 3));
        System.out.println("6 / 3: " + funcionario.divide(6, 3));
        System.out.println("72^2: " + funcionario.elevaAoQuadrado(72));
        System.out.println("83^3: " + funcionario.elevaAoCubo(83));
        
        System.out.println("\nTeste Empresa: ");
        System.out.println("Informe o nome da empresa: ");
        nome = scanner.nextLine();
        Empresa empresa1 = new Empresa(nome, funcionario, new FuncionarioCaixa());
        empresa1.imprimeInfo();
    }
}
