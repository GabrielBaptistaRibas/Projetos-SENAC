public class No {
    private int id;
    private No esq;
    private No dir;

    public No(int id) {
        this.id = id;
        this.esq = null;
        this.dir = null;
    }

    public int getId() {
        return id;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }
}
