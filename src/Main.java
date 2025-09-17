public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testando as Classes ===");

        // Aluno
        Aluno aluno = new Aluno("João", 7.5, 8.0, 9.0, 6.5);
        aluno.imprimirInformacoes();
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Aprovado com nota 7.0? " + aluno.verificarNotaAprovacao(7.0));
        System.out.println();

        // Turma
        Turma turma = new Turma("Turma A", new String[]{"João", "Maria", "José", null, "Ana"});
        turma.imprimirTurma();
        System.out.println("Total de alunos: " + turma.quantidadeAlunos());
        System.out.println("Aluno Maria está na turma? " + turma.buscarAluno("Maria"));
        System.out.println();

        // Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", new String[]{"Livro A", "Livro B", "Livro C", null, null});
        biblioteca.imprimirLivros();
        System.out.println("Livros disponíveis: " + biblioteca.contarLivrosDisponiveis());
        System.out.println("Livro B disponível? " + biblioteca.verificarDisponibilidade("Livro B"));
        System.out.println();

        // Empresa
        Empresa empresa = new Empresa("Tech Solutions", new String[]{"Carlos", "Beatriz", null, "Fernando", null, null, null, null});
        empresa.imprimirFuncionarios();
        System.out.println("Funcionários cadastrados: " + empresa.contarFuncionarios());
        System.out.println("Funcionário Ana cadastrado? " + empresa.verificarFuncionario("Ana"));
        System.out.println();

        // Estoque
        Estoque estoque = new Estoque("Produto X", new int[]{10, 20, 30, 40, 50});
        estoque.imprimirEstoque();
        System.out.println("Total em estoque: " + estoque.calcularTotalEstoque());
        System.out.println("Algum lote tem mais que 25? " + estoque.verificarDisponibilidade(25));
    }
}
