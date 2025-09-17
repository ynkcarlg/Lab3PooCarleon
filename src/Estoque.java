public class Estoque {
    private String produto;
    private int[] quantidades;

    public Estoque() {
        this.produto = "Produto Desconhecido";
        this.quantidades = new int[5];
    }

    public Estoque(String produto, int[] quantidades) {
        this.produto = produto;
        this.quantidades = quantidades;
    }

    public void imprimirEstoque() {
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidades:");
        for (int i = 0; i < this.quantidades.length; i++) {
            System.out.println("Lote " + (i + 1) + ": " + this.quantidades[i]);
        }
    }

    public int calcularTotalEstoque() {
        int total = 0;
        for (int qtd : this.quantidades) {
            total += qtd;
        }
        return total;
    }

    public boolean verificarDisponibilidade(int quantidadeMinima) {
        for (int qtd : this.quantidades) {
            if (qtd > quantidadeMinima) {
                return true;
            }
        }
        return false;
    }
}
