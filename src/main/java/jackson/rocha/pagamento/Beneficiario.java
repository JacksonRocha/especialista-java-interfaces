package jackson.rocha.pagamento;

public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contaBancaria;

    public Beneficiario(String chavePix, String contaBancaria, String nome) {
        this.chavePix = chavePix;
        this.contaBancaria = contaBancaria;
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean naoPossuiChavePix() {
        return getChavePix() == null || getChavePix().isEmpty();
    }

    public boolean naoPossuiContaBancaria(String contaBancaria) {
        return getContaBancaria() == null || getContaBancaria().isEmpty();
    }


}
