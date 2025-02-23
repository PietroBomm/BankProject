import java.util.Scanner;

public class bankaccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Digite seu nome: ";
        System.out.println(name);
        name = scanner.nextLine();
        int accountNumber = 0;
        System.out.println("Digite o número da conta: ");
        accountNumber = scanner.nextInt();
        double balance = 3500.00;
        int operation = 0;
        do {
            System.out.println("**********Menu**********");
            System.out.println("Bem-vindo " + name + "!");
            System.out.println("Número da conta: " + accountNumber);
            System.out.println("Saldo atual: R$" + balance);
            System.out.println("*************************");
            System.out.println("Operações disponíveis:");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Transferência");
            System.out.println("4 - Sair");
            System.out.println("*************************");
            System.out.println("Digite o número da operação desejada: ");
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Digite o valor do saque: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        balance -= withdraw;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Saldo atual: R$" + balance);
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Depósito realizado com sucesso");
                    System.out.println("Saldo atual: R$" + balance);
                    break;
                case 3:
                    System.out.println("Digite o valor da transferência: ");
                    double transfer = scanner.nextDouble();
                    if (transfer > balance) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        balance -= transfer;
                        System.out.println("Transferência realizada com sucesso");
                        System.out.println("Saldo atual: R$" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços");
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
            if (operation != 4) {
                System.out.println("Deseja realizar outra operação? (1 - Sim / 2 - Não)");
                int continueOperation = scanner.nextInt();
                if (continueOperation == 2) {
                    operation = 4;
                    System.out.println("Obrigado por utilizar nossos serviços");

                }
            }

        } while (operation != 4);
        scanner.close();
    }
}
