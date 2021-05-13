package observer;

public class ArmazenaXml implements NotaFiscalEmitidaListener {
    @Override
    public void update(NotaFiscal notaFiscal) {
        System.out.printf("\n XML da nota fiscal %s armazenado!", notaFiscal.getNumero());
    }
}
