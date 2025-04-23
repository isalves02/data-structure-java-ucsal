import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Aluno> lista = new ListaDuplamenteEncadeada<Aluno>();

        System.out.println("Questão 1 - Inclusão e exibição de números inteiros:");
        inclusaoNumerosInteiros();

        System.out.println("Questão 2 - Faça um programa que leia duas sequências de nomes de pessoas e\n" +
                "armazene-os em duas listas simplesmente encadeadas L1 e L2,\n" +
                "respectivamente. Em seguida, o programa deve criar uma terceira lista\n" +
                "encadeada, contendo os nomes comuns às duas listas e mostrar a lista\n" +
                "resultante.");
        criandoTerceiraListaApartirDeOutrasListas();

        System.out.println("Questão 3 - Utilizando listas duplamente encadeadas, faça um programa que cadastre\n" +
                "5 alunos, com o seu nome e idade. Após cadastrar os 5 alunos, deverá ter um\n" +
                "método para incluir no início da lista um aluno e no final da lista mais um aluno,\n" +
                "totalizando assim uma lista com 7 alunos. Liste os 7 alunos da lista. ");
        listaAlunos();

        System.out.println("Questão 4 - Faça um programa utilizando listas duplamente encadeadas que\n" +
                "armazene os 15 números impares. O programa deverá ter as seguintes\n" +
                "funcionalidades:");
        listaImpares();
    }

    public static void inclusaoNumerosInteiros() {
        ListaDuplamenteEncadeada<Integer> list = new ListaDuplamenteEncadeada<Integer>();
        try {
            list.inserirEsquerda(10);
            list.inserirEsquerda(15);
            list.inserirDireita(13);
            list.inserirDireita(21);
            list.imprimir();

            list.removerEsquerda();
            list.imprimir();

            list.removerDireita();
            list.imprimir();

        } catch (ExceptionListaVazia e) {
            System.out.println(e.getMessage());
        }
    }

    public static void criandoTerceiraListaApartirDeOutrasListas() {
        ListaEncadeadaGenerica<String> listaPessoa1 = new ListaEncadeadaGenerica<String>();
        listaPessoa1.adicionar("Isabel");
        listaPessoa1.adicionar("Luis");
        listaPessoa1.adicionar("Pietra");
        listaPessoa1.listar();

        ListaEncadeadaGenerica<String> listaPessoa2 = new ListaEncadeadaGenerica<String>();
        listaPessoa2.adicionar("Joana");
        listaPessoa2.adicionar("José");
        listaPessoa2.adicionar("Maria");
        listaPessoa2.listar();

        ListaEncadeadaGenerica<String> listaPessoa3 = new ListaEncadeadaGenerica<String>();

        while(listaPessoa1.temProximo()) {
            while(listaPessoa2.temProximo()) {
                if(listaPessoa2.getAtual().getValor() == listaPessoa1.getAtual().getValor()) {
                    listaPessoa3.adicionar(listaPessoa2.getAtual().getValor());
                }
            }
        }

        listaPessoa3.listar();
    }

    public static void imprimirListaAlunos(ListaDuplamenteEncadeada<Aluno> listaAluno) {
        while(listaAluno.temProximo()) {
            System.out.println("Aluno: "+listaAluno.getAtual().getValor().getNome()+" / Idade: "+listaAluno.getAtual().getValor().getIdade());
        }
    }

    public static void incluirInicioFimAluno(ListaDuplamenteEncadeada<Aluno> listaAluno) {
        listaAluno.inserirEsquerda(new Aluno("Bernadete", 19));
        listaAluno.inserirDireita(new Aluno("Bernardo", 25));
        System.out.println();
    }

    public static void listaAlunos() {
        Aluno aluno1 = new Aluno("Isabel", 22);
        Aluno aluno2 = new Aluno("José", 20);
        Aluno aluno3 = new Aluno("Pedro", 15);
        Aluno aluno4 = new Aluno("Paulo", 19);
        Aluno aluno5 = new Aluno("Ana", 18);

        ListaDuplamenteEncadeada<Aluno> listaAluno = new ListaDuplamenteEncadeada<Aluno>();
        listaAluno.inserirEsquerda(aluno1);
        listaAluno.inserirEsquerda(aluno2);
        listaAluno.inserirEsquerda(aluno3);
        listaAluno.inserirEsquerda(aluno4);
        listaAluno.inserirEsquerda(aluno5);

        imprimirListaAlunos(listaAluno);

        incluirInicioFimAluno(listaAluno);

        imprimirListaAlunos(listaAluno);
    }

    // questão 4
    public static void listaImpares() {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();

        int i = 0, num = 0;
        Random random = new Random();

        while(i < 15) {
            num = random.nextInt(100);
            if(num % 2 == 1) {
                lista.inserirDireita(num);
                i++;
            }
        }

        try {
            lista.imprimir();
        } catch (ExceptionListaVazia e) {
            System.out.println(e.getMessage());
        }
    }

}