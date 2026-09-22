public abstract class Pagamento {

    private int id = 0;

    public Pagamento() {

    }

    public abstract void processar(double valor);


    public int getId() {
        id+=1;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

