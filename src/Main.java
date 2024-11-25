public class Main {
    public static void main(String[] args) {
        // Criando clientes
        var cliente1 = new Cliente("Camila", "123.456.789-00");
        var cliente2 = new Cliente("João", "987.654.321-00");

        // Criando o banco
        var banco = new Banco("Banco Digital");

        // Criando contas para os clientes
        banco.criarConta(cliente1);
        banco.criarConta(cliente2);

        // Buscando as contas
        var conta1 = banco.buscarConta(1);
        var conta2 = banco.buscarConta(2);

        // Realizando operações bancárias
        if (conta1 != null) {
            conta1.depositar(1000.0);
            conta1.sacar(300.0);
        }

        if (conta2 != null) {
            conta2.depositar(500.0);
        }

        if (conta1 != null && conta2 != null) {
            conta1.transferir(conta2, 200.0);
        }
    }
}



