package jackson.rocha;

import jackson.rocha.contaspagar.modelo.Holerite;
import jackson.rocha.contaspagar.modelo.OrdemServico;
import jackson.rocha.contaspagar.servico.ServicoContaPagar;
import jackson.rocha.pagamento.Beneficiario;
import jackson.rocha.pagamento.MetodoPagamento;
import jackson.rocha.pagamento.Transferencia;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Jackson", "014222222160", "123456");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "119086282639829", "23456789");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}
