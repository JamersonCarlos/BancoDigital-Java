public class main {
     public static void main(String[] args) {
          Banco bradesco = new Banco();
          Cliente[] clientes = new Cliente[10];

          //Criando Clientes
          clientes[0] = new Cliente("Jamerson Carlos", new Conta(913, 2901,1));
          clientes[1] = new Cliente("Maria Miranda", new Conta(913, 3213,1));
          clientes[2] = new Cliente("Junior Vaz", new Conta(913, 7821, 0));
          clientes[3] = new Cliente("Alberto Silva", new Conta(913, 8021, 0));

          //Adicionando ao banco as contas
          bradesco.addConta(clientes[0].getYouCont());
          bradesco.addConta(clientes[1].getYouCont());
          bradesco.addConta(clientes[2].getYouCont());
          bradesco.addConta(clientes[3].getYouCont());

          
     }
}
