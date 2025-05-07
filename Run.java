import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
		Cliente marcelo = new Cliente();
		marcelo.setNome("Marcelo");
	    Conta cc1 = new ContaCorrente(marcelo);
		Conta poupanca1 = new ContaPoupanca(marcelo);

        Cliente paula = new Cliente();
		paula.setNome("Paula");
	    Conta cc2 = new ContaCorrente(paula);
		Conta poupanca2 = new ContaPoupanca(paula);

        System.out.println("Depositar na conta corrende de: " + marcelo.getNome());
        System.out.println("Digite o valor: ");
        Scanner valor = new Scanner(System.in);
        var dep = valor.nextDouble();
        valor.close();
        cc1.depositar(dep);
        System.out.println("Deposito de " + dep + " realizado.");
        System.out.println("Transferindo para " + cc2.cliente.getNome());
        cc1.transferir(dep, cc2);
   

		//cc1.depositar(100);
		//cc1.transferir(100, poupanca);
		
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
	}
}
