/**
 * 14 – Crie um TAD para representar um funcionário de uma empresa.
 * Deve conter nome, cargo, salário e data de admissão.
 */


interface IFuncionarios {
    void adicionar(String nome, String cargo, double salario, String dataDeAdmissao);
    void remover(String nome, String cargo, String dataDeAdmissao, String dataDeDemissao);
    void listarFuncionarios();
}

class Funcionarios implements IFuncionarios {
    private String nome, cargo, dataDeAdmissao, dataDeDemissao;
    private double salario;

    @Override
    public void adicionar(String nome, String cargo, double salario, String dataDeAdmissao) {}

    @Override
    public void remover(String nome, String cargo, String dataDeAdmissao, String dataDeDemissao) {}

    @Override
    public void listarFuncionarios() {}
}

public class Company {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
    }
}
