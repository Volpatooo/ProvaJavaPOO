public class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;

    public Funcionario(String nome, String cpf, Double salario) {
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou vazio");
        }
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário não pode ser nulo ou vazio");
        }
        this.salario = salario;
    }

    public void aplicarAumento(Double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public String exibirDados() {
        return ("Nome: " + nome + "CPF: " + cpf + "Salário: " + salario);
    }
}
