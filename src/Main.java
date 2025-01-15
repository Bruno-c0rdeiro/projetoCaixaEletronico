import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        String nome;
        int i=0;
        double saldo=1200;

        String menu= """
                Operaçoes:
                1-consultar saldo
                2- Sacar
                3- transferir valor
                4- Depositar
                5- Sair
             
                """;

        while(i!=5){

            // ... (desenho de um caixa eletronico)
            System.out.println("║*******************║");
            System.out.println("║ Saldo:"+saldo);
            System.out.println("╠═══════════════════╣");
            System.out.println("║  1  2  3  4  5  6 ║");
            System.out.println("║  7  8  9  0 ENTER ║");
            System.out.println("╠═══════════════════╣");
            System.out.println("║ Saque | Depósito  ║");
            System.out.println("╚═══════════════════╝");



            System.out.println("Digite seu nome");
            nome=entrada.nextLine();
            System.out.println(nome + " seu saldo atual é de " + saldo );

            System.out.println(menu);
            System.out.println("escolha a opção desejada");
            int numeroDigitado=entrada.nextInt();

            i+=numeroDigitado;

            switch (numeroDigitado){
                case 1:
                    System.out.println("seu saldo é de " + saldo);
                    break;
                case 2:
                    System.out.println("qual valor voçê deseja sacar?");
                    double valor=entrada.nextDouble();
                    if(valor> saldo){
                        System.out.println("saldo não suficiente");
                    }else{
                        System.out.println("o valor sacado foi" + valor);
                        saldo-=valor;
                        System.out.println("seu saldo agora é " + saldo);};
                    break;

                case 3:
                    System.out.println("qual valor voçê deseja transferir?");
                    double valorDaTransferencia=entrada.nextDouble();
                    if(valorDaTransferencia > saldo){
                        System.out.println("saldo não suficiente");
                    } else{
                        System.out.println("o valor transferido foi" + valorDaTransferencia);
                        saldo-=valorDaTransferencia;
                        System.out.println("seu saldo agora é " + saldo); }
                    break;

                case 4:
                    System.out.println("qual valor voce deseja depositar");
                    double valordepositado=entrada.nextDouble();
                    System.out.println("o valor depositado foi " + valordepositado);
                    saldo+=valordepositado;
                    System.out.println("seu saldo é de " + saldo);

            }


        }
    }
}