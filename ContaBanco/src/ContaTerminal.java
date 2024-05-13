import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Seja bem vindo ao banco Deus te Pague!");
        System.out.println("Olá usuário! Vamos criar uma conta nesta incrível agência bancária!");
        
        System.out.print("Primeiro, me diga seu nome completo: ");
        String nomeCliente = ler.nextLine();

        System.out.print("Certo, " + nomeCliente + ", agora me diga o número da conta de sua agência: ");
        int num = ler.nextInt();

        System.out.print("Agora o Código da agência (ex: 067-8): ");ler.nextLine();
        String agencia = ler.nextLine();

        System.out.print("Estamos quase acabando!\nInsira o valor que você depositar: ");
        Double saldo = ler.nextDouble();

        System.out.println("Prontinho Sr(ª) ".concat(nomeCliente));
        System.out.println("Agradeçemos sua preferência ao criar uma conta no nosso banco!\n");
        System.out.print("Sua agência é ".concat(agencia));
        System.out.println(", da conta " + num + " e o seu saldo líquido já é de " + saldo + " reais.");
        System.out.println("Tenho um bom dia! :D");
        
    }
}
