public class Banco {
    private Conta[] correntistas = new Conta[10];
    private Conta[] poupancas = new Conta[10];
    private int countCorrent = 0;
    private int countPoupanca = 0;

    public void getContasCorrente() {
        for(int i = 0; i < correntistas.length; i++) {
            System.out.println("Contas Correntes");
            System.out.println(correntistas[i]);
        }
        for(int i = 0; i < poupancas.length; i++) {
            System.out.println("Contas Poupanças");
            System.out.println(poupancas[i]);
        }
    }

    public void addConta(Conta conta) {
        if (conta.getTypeCont() == 1) {
            poupancas[countPoupanca] = conta;
            countPoupanca++;
        } else if (conta.getTypeCont() == 0) {
            correntistas[countCorrent] = conta;
            countCorrent++;
        }
    }

    public void transferir(Cliente emissor, Cliente destino) {

    }
}
