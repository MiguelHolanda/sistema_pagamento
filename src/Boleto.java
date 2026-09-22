import java.time.LocalDate;

public class Boleto extends Pagamento {

private LocalDate vencimento;



    public Boleto(LocalDate vencimento) {
        this.vencimento = LocalDate.now();
    }

    @Override
    public void processar(double valor) {
        IO.println("BOLETO NO VALOR DE R$"+valor+" COM VENCIMENT EM "+vencimento.plusDays(7));
    }
}
