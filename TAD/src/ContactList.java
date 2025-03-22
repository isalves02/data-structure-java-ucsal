import java.util.Scanner;

interface IContactList {
    void adicionar(String nome, String numero);
    void atualizar(String nomeVelho, String nomeNovo, String numeroNovo);
    void remover(String nome);
}

class ContactLisClass implements IContactList {
    String[][] agenda = new String[3][2];

    @Override
    public void adicionar(String nome, String numero) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i][0] == null) {
                agenda[i][0] = nome;
                agenda[i][1] = numero;
                System.out.println("Contato adicionado: " + nome + " - " + numero);
                return;
            }
        }
        System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
    }

    @Override
    public void atualizar(String nomeVelho, String nomeNovo, String numeroNovo) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i][0] != null && agenda[i][0].equals(nomeVelho)) {
                agenda[i][0] = nomeNovo;
                agenda[i][1] = numeroNovo;
                System.out.println("Contato atualizado: " + nomeNovo + " - " + numeroNovo);
                return;
            }
        }
        System.out.println("Contato não encontrado para atualização.");
    }

    @Override
    public void remover(String nome) {
        System.out.println("Implementação do método abstrato.");
    }
}

public class ContactList {
    public static void main(String[] args) {
        int pos = 0;
        Scanner sc = new Scanner(System.in);
        ContactLisClass contactList = new ContactLisClass();
        String[][] agenda = contactList.agenda;
        String nome, numero;

        do {
            System.out.println("Digite o nome que você quer cadastrar:");
            nome = sc.next();

            System.out.println("Digite o número que você quer cadastrar: ");
            numero = sc.next();

            contactList.adicionar(nome, numero);

            System.out.println("Cadastrado com sucesso! ");
            pos++;
        } while (agenda[agenda.length-1][0] == null || agenda[agenda.length-1][1] == null);


        // exibir
        for (var i = 0; i <= agenda.length; i++) {
            if (agenda[i][0] != null || agenda[i][1] != null)
                System.out.println("nome: "+ agenda[i][0] + " número: " + agenda[i][1]);

            if(i+1 == agenda.length)
                System.out.println("Quantidade total que a agenda suporta: "+ agenda.length);
        }
    }
}


