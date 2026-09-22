void main() {

    Pix pix = new Pix(200);

    pix.processar(300);
    pix.processar(10);

Credito cartao = new Credito(400);

cartao.processar(300);

Boleto boleto = new Boleto(LocalDate.of(2026, 05, 10));

boleto.processar(500);


}
