public class ContaBancaria {
    private static int contador = 1;
    private final int numeroConta;
    private double saldo;
    private final Cliente cliente;

    public ContaBancaria(Cliente cliente) {
        this.numeroConta = contador++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de %.2f realizado. Saldo atual: %.2f%n", valor, saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de %.2f realizado. Saldo atual: %.2f%n", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor <= saldo && valor > 0) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.printf("Transferência de %.2f realizada para a conta %d%n", valor, contaDestino.getNumeroConta());
        } else {
            System.out.println("Transferência falhou. Verifique o saldo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
