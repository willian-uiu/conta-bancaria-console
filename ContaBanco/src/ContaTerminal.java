import java.util.Scanner;

public class ContaTerminal {
    Scanner sc = new Scanner(System.in);

    int numero;
    String agencia;
    String nomeCliente;
    float  saldo;

    public void adicionarNumero(){
        System.out.println("Por favor, digite o numero:");
        this.numero = sc.nextInt();
        sc.nextLine();
    }

    public void adicionarAgencia(){
        System.out.println("Por favor digite a agência: ");
        this.agencia = sc.nextLine();
    }

    public void adicionarNomeCliente(){
        System.out.println("Por favor digite o nome do cliente: ");
        this.nomeCliente = sc.nextLine();
    }

    public void adicionarSaldo(){
        System.out.println("Por favor informe o saldo: ");
        this.saldo = sc.nextFloat();
    }
}
