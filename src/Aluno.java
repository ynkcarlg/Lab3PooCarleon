public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno() {
        this.nome = "Desconhecido";
        this.notas = new double[4];
        for (int i = 0; i < this.notas.length; i++) {
            this.notas[i] = 0.0;
        }
    }

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.notas = new double[]{nota1, nota2, nota3, nota4};
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.print("Notas: ");
        for (double nota : this.notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    public boolean verificarNotaAprovacao(double valor) {
        for (double nota : this.notas) {
            if (nota < valor) {
                return false;
            }
        }
        return true;
    }
}
