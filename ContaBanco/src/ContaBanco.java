public class ContaBanco {
    public static void main(String[] args) throws Exception {

        ContaTerminal conta1 = new ContaTerminal();

        conta1.adicionarNumero();
        conta1.adicionarAgencia();
        conta1.adicionarNomeCliente();
        conta1.adicionarSaldo();

        String dadosCliente = "Numero cliente: "+conta1.numero +"\n" + 
        "Agencia: "+conta1.agencia+ "\n"+
        "Nome do cliente: "+conta1.nomeCliente+"\n"+
        "Saldo: "+conta1.saldo;

        System.out.println(dadosCliente);
    }
}
