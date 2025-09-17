import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        setCnpj(cnpj);
        this.endereco = endereco;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj == null || cnpj.isEmpty()) {
            throw new IllegalArgumentException("CNPJ não pode ser nulo ou vazio");
        }
        this.cnpj = cnpj;
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario();
        }
        return total;
    }

    public void aplicarAumento(Double percentual) {
        for (Funcionario f : funcionarios) {
            f.aplicarAumento(percentual);
        }
    }

    public List<Funcionario> geFuncionarios() {
        return funcionarios;
    } 

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionário(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public String exibirDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nome)
        .append("CNPJ: ").append(cnpj)
        .append("Endereço: ").append(endereco.exibirDados())
        .append("Funcionários");
        
        for (Funcionario f : funcionarios) {
            sb.append(" - ").append(f.exibirDados()).append("\n");
        }

        sb.append("Folha Salarial Total: R$ ").append(calcularFolhaSalarial());
        return sb.toString();
    }
}
