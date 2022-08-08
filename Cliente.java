
public class Cliente {
    private String nome;
    private Conta youCont;

    public Cliente(String nome, Conta youCont) {
        this.nome = nome;
        this.youCont = youCont;
    }

    public String getNome() {
        return nome;
    }

    public Conta getYouCont() {
        return this.youCont;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            youCont.setSaldo(valor);
        }
    }

    public void sacar(double valor) {
        if (youCont.getSaldo() >= valor) {
            youCont.setSaldo(-valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void saldo() {
        System.out.println("R$" + youCont.getSaldo());
    }
}
