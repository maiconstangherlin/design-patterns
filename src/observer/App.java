package observer;

import java.util.List;

public class App {

    public static void main(String[] args) {
        var notaFiscal = new NotaFiscal("114405");
        var listeners = List.of(
                new EnviaEmailCliente(),
                new ArmazenaXml()
        );

        var service = new NotaFiscalService(listeners);
        service.emitir(notaFiscal);
    }
}
