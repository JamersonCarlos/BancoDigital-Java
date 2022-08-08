public class Conta {
    private int agencia;
    private int conta;
    //1 = corrente e 0 = poupança
    private int typeCont;
    private double saldo;

    public Conta(int agencia, int conta, int tipo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public int getTypeCont() {
        return this.typeCont;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = this.saldo + valor;
    }

}
