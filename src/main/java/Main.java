import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            switch (opcao) {

                case 1:

                    System.out.println("Seja bem vindo aos nossos serviços exclusivos para Pessoa Física!");

                    System.out.println();

                    Cliente suellen = new Cliente();
                    suellen.setPessoaFisica("Suellen");

                    Conta cc = new ContaCorrente(suellen);
                    Conta poupanca = new ContaPoupanca(suellen);

                    cc.depositar(100);
                    cc.transferir(100, poupanca);

                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();

                    break;

                case 2:

                    System.out.println("Seja bem vindo aos nossos serviços exclusivos para Pessoa Jurídica!");

                    System.out.println();

                    Cliente digitalCoder = new Cliente();
                    digitalCoder.setPessoaJurica("DIGITAL CODER LTDA");

                    Conta correnteJuridica = new ContaCorrente(digitalCoder) ;

                    Conta poupancaJuridica = new ContaPoupanca(digitalCoder);

                    correnteJuridica.depositar(100.000);
                    poupancaJuridica.transferir(100.000, poupancaJuridica);

                    correnteJuridica.imprimirExtratoJuridico();
                    poupancaJuridica.imprimirExtratoJuridico();

                    break;

                case 3:

                    break;
            }
            System.out.println();

            System.out.println("1. Pessoa Física");

            System.out.println("2. Pessoa Jurídica");

            System.out.println("3. Sair");

            System.out.println();

            System.out.println("Escolha a opção:");

            opcao = scn.nextInt();

        }
    }
}







