import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Empresa> empresas;

    public Sistema() {
        this.empresas = new ArrayList<>();
    }

    public void adicionarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }
    
    public void gerarRelatorioCompleto() {
        System.out.println("===== RELATÓRIO COMPLETO DO SISTEMA =====");
        for (Empresa e : empresas) {
            System.out.println(e.exibirDados());
            System.out.println("----------------------------------------");
        }
    }
}
