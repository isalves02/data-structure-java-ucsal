interface IBankAccountFuncionalities {
    double verSaldo();
    void depositar(double valor);
    void sacar(double valor);
    String atualizarSaldo();
}

class BankAccountFuncionalities implements IBankAccountFuncionalities {
    private double saldo = 0;

    @Override
    public double verSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo <= 0 || this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public String atualizarSaldo() {
        return "Seu saldo atualizado é: R$" + this.saldo;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccountFuncionalities bankAccount = new BankAccountFuncionalities();
        System.out.println(bankAccount.atualizarSaldo());
    }
}
