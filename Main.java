public class Main {
    public static void main(String[] args) {
        // Criando endereços
        Endereco endereco1 = new Endereco("Rua Blablabla", 100, "Blumenau");
        Endereco endereco2 = new Endereco("Rua Leopoldo", 200, "Blumenau");

        // Criando empresas
        Empresa empresa1 = new Empresa("Sênior", "11111111111111", endereco1);
        Empresa empresa2 = new Empresa("Premier Soft", "22222222222222", endereco2);

        // Criando funcionários para empresa1
        Funcionario f1 = new Funcionario("Mateus", "12345678901", 10000.0);
        Funcionario f2 = new Funcionario("Pedro", "23456789012", 5000.0);
        Funcionario f3 = new Funcionario("Lucas", "34567890123", 7000.0);

        // Criando funcionários para empresa2
        Funcionario f4 = new Funcionario("João", "45678901234", 5000.0);
        Funcionario f5 = new Funcionario("Heitor", "56789012345", 6000.0);
        Funcionario f6 = new Funcionario("José", "67890123456", -100.0);

        // Adicionando funcionários às empresas
        empresa1.adicionarFuncionario(f1);
        empresa1.adicionarFuncionario(f2);
        empresa1.adicionarFuncionario(f3);

        empresa2.adicionarFuncionario(f4);
        empresa2.adicionarFuncionario(f5);
        empresa2.adicionarFuncionario(f6);

        // Calculando e exibindo folha salarial antes do aumento
        System.out.println("Folha salarial empresa1: R$ " + empresa1.calcularFolhaSalarial());
        System.out.println("Folha salarial empresa2: R$ " + empresa2.calcularFolhaSalarial());

        // Aplicando aumento de 10% em todas as empresas
        empresa1.aplicarAumento(10.0);
        empresa2.aplicarAumento(10.0);

        // Removendo um funcionário
        empresa1.removerFuncionário(f2); // remove Pedro da empresa1

        // Gerando relatório completo
        System.out.println("\n===== RELATÓRIO COMPLETO =====\n");
        System.out.println(empresa1.exibirDados());
        System.out.println("\n-----------------------------\n");
        System.out.println(empresa2.exibirDados());
    }
}
