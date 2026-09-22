public class Credito  extends Pagamento{

    private double limite;

    public Credito(double limite) {
        this.limite = limite;
    }

    @Override
    public void processar(double valor) {
        if(limite<valor){
            IO.println("COMPRA NEGADA! limite ultrapassado");
        }else {
            IO.println("COMPRA NO CREDITO APROVADA! ID;" + getId());
        }
    }


}
