import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final List<ContaBancaria> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void criarConta(Cliente cliente) {
        var conta = new ContaBancaria(cliente);
        contas.add(conta);
        System.out.printf("Conta criada para o cliente %s, número da conta: %d%n", cliente.getNome(), conta.getNumeroConta());
    }

    public ContaBancaria buscarConta(int numeroConta) {
        return contas.stream()
                .filter(conta -> conta.getNumeroConta() == numeroConta)
                .findFirst()
                .orElse(null);
    }
}
// java