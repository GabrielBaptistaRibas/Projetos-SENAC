public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Criação de nós para a árvore (exemplo)
        No raiz = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);

        raiz.setEsq(no2);
        raiz.setDir(no3);
        no2.setEsq(no4);

        arvore.raiz = raiz;

        // Contar nós na sub-árvore esquerda
        int count = arvore.contarNosEsquerdaFestiva();
        System.out.println("Número de nós na sub-árvore esquerda: " + count);

        // Imprimir a árvore com recuos
        arvore.imprimirComRecuos();
    }
}
