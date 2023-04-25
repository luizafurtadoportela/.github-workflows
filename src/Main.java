import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Colaboradores> colaboradores = new ArrayList<Colaboradores>();

        Colaboradores colab = new Colaboradores();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        colab.nome = entrada.nextLine();
        System.out.printf("Seu nome é " + colab.nome + "\n");

        System.out.println("Digite seu CPF: ");
        colab.CPF = entrada.nextLine();
        System.out.printf("Seu CPF é " + colab.CPF + "\n");

        System.out.println("Digite seu telefone: ");
        colab.telefone = entrada.nextInt();
        System.out.printf("Seu telefone é " + colab.telefone + "\n");

        System.out.println("Digite sua data de nascimento: ");
        colab.dataNascimento = entrada.nextInt();
        System.out.printf("Sua data de nascimento é " + colab.dataNascimento + "\n");

        System.out.println("Digite sua data de agendamento: ");
        colab.dataAgendamento = entrada.nextInt();
        System.out.printf("Sua data de agendamento é " + colab.dataAgendamento + "\n");

        //defeito
        String vazio = entrada.nextLine();

        System.out.println("Digite o período: ");
        colab.periodo = entrada.nextLine();
        System.out.printf("Seu período é " + colab.periodo + "\n");

        colaboradores.add(colab);
        System.out.println(colaboradores.toString());
    }
}