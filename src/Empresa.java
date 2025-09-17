public class Empresa {
    private String nome;
    private String[] funcionarios;

    public Empresa() {
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }

    public Empresa(String nome, String[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprimirFuncionarios() {
        System.out.println("Empresa: " + this.nome);
        System.out.println("Funcionários:");
        for (String funcionario : this.funcionarios) {
            if (funcionario != null) {
                System.out.println(funcionario);
            }
        }
    }

    public int contarFuncionarios() {
        int count = 0;
        for (String funcionario : this.funcionarios) {
            if (funcionario != null) count++;
        }
        return count;
    }

    public boolean verificarFuncionario(String nomeFuncionario) {
        for (String funcionario : this.funcionarios) {
            if (funcionario != null && funcionario.equals(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }
}
