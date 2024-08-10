public class ArvoreBinaria {
    No raiz;

    public int contarNosEsquerdaFestiva() {
        return contarNosEsquerdaFestiva(raiz);
    }

    private int contarNosEsquerdaFestiva(No no) {
        if (no == null) {
            return 0;
        }
        int count = contarNosEsquerdaFestiva(no.getEsq());
        if (no.getEsq() != null) {
            count++;
        }
        count += contarNosEsquerdaFestiva(no.getDir());
        return count;
    }

    public void imprimirComRecuos() {
        imprimirComRecuos(raiz, 0);
    }

    private void imprimirComRecuos(No no, int nivel) {
        if (no != null) {
            imprimirComRecuos(no.getDir(), nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print(" ");
            }
            System.out.println(no.getId());
            imprimirComRecuos(no.getEsq(), nivel + 1);
        }
    }
}
