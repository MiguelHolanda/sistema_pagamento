public class Pix  extends Pagamento{

private double saldo;

    public Pix(double saldo) {
        super();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processar(double valor) {
        if(valor>saldo){
            IO.println("COMPRA NEGADA! saldo insulficiente");
        }else{
            IO.println("COMPRA  VIA PIX APROVADA! id; " + getId());
            IO.println("SALDO ATUAL; " + (saldo-valor));
        }
    }



}
