package jackson.rocha;

import jackson.rocha.contaspagar.servico.ServicoContaPagar;
import jackson.rocha.pagamento.DocumentoPagavel;

public class Principal {
    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();
        
        DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);
    }
}
