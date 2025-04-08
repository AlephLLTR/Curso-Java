package ex_4;

public class ContaBanco {
    private String titular_conta;
    private int id_conta;
    private double saldo_conta;

    public ContaBanco(String titular_conta, int id_conta, double saldo_conta) {
        setTitularConta(titular_conta);
        this.id_conta = id_conta;
        setSaldoConta(saldo_conta);
    }

    private void setTitularConta(String titular_conta){
        this.titular_conta = titular_conta;
    }
    private String getTitularConta(){
        return this.titular_conta;
    }
    private int getIdConta(){
        return this.id_conta;
    }
    private void setSaldoConta(double saldo_conta) {
        this.saldo_conta = saldo_conta;
    }
    private double getSaldoConta() {
        return saldo_conta;
    }
    public void realizarDeposito(double deposito){
        setSaldoConta(getSaldoConta() + deposito);
    }
    public void realizarSaque(double saque){
        if (getSaldoConta() <= 0.0) {
            System.out.println("O saldo da conta é insuficiente para realizaçaão do saque.");
        } else {
            setSaldoConta(getSaldoConta() - saque - 5.0);
            System.out.println("Saldo atual: R$ " + getSaldoConta());
        }
    }
    public void retificaNomeTitular(String nome_alterado){
        System.out.println("Nome atual do titular: " + getTitularConta());
        setTitularConta(nome_alterado);
        System.out.println("Nome novo do titular: " + getTitularConta());
    }

    @Override
    public String toString() {
        return "Conta de ID " + id_conta + " do titular " + titular_conta + "Saldo disponível: " + saldo_conta;
    }

}
