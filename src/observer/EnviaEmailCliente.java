package observer;

public class EnviaEmailCliente implements NotaFiscalEmitidaListener {

    @Override
    public void update(NotaFiscal notaFiscal) {
        System.out.printf("\n Nota Fiscal %s enviada por email!", notaFiscal.getNumero());
    }

}
