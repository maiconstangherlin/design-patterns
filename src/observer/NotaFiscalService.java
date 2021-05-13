package observer;

import java.util.List;

public class NotaFiscalService {

    private final List<NotaFiscalEmitidaListener> notaFiscalEmitidaListeners;

    public NotaFiscalService(List<NotaFiscalEmitidaListener> notaFiscalEmitidaListeners) {
        this.notaFiscalEmitidaListeners = notaFiscalEmitidaListeners;
    }

    void emitir(NotaFiscal notaFiscal) {
        System.out.printf("\n Nota fiscal %s emitida!", notaFiscal.getNumero());

        for (NotaFiscalEmitidaListener listener : notaFiscalEmitidaListeners) {
            listener.update(notaFiscal);
        }
    }

}
