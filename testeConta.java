import java.util.Scanner;
public class testeConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroContas = 0;
        while (numeroContas <= 0) {
            System.out.println("Olá, seja bem-vindo! Quantas contas você deseja criar?");
            numeroContas = Integer.parseInt(sc.nextLine()); //conversão para string.
        }
        ContaBanc[] contas = new ContaBanc[numeroContas];

        for (int i = 0; i < numeroContas; i++) {
            System.out.println("Digite 1 para conta corrente ou outro valor para conta poupança:");
            if (Integer.parseInt(sc.nextLine()) == 1) {
                contas[i] = new ContaCorrente("12345");
            } else {
                contas[i] = new Contapoupanca("54321");

            }
        }
        //cada cb é uma conta, for each, passa por todas as contas automaticamente
        for (ContaBanc cb : contas)
            cb.setNumero((int) (Math.random() * 10000 + 1));
        //se for instanciado como conta poupança, pode chamar o metodo do if abaixo
        for (ContaBanc cb : contas)
            if (cb instanceof Contapoupanca)
                ((Contapoupanca) cb).setTaxaDeRendimento(Math.random());// casting

        for (ContaBanc cb : contas) {
            cb.deposita(Math.random() * 500);
            cb.saca(Math.random() * 100);
            cb.tiraExtrato();
        }

        for (ContaBanc cb : contas
        ) {
            if (cb instanceof Contapoupanca)
                System.out.println("Taxa de rendimento da conta poupança: " + cb.getNumero() + " : " + ((Contapoupanca) cb).getTaxaDeRendimento());//downcasting
            else if (cb instanceof ContaCorrente) {
                System.out.println("Quantidade de transações da conta corrente: " + cb.getNumero() + " : " + ((ContaCorrente) cb).getTransacoesRealizadas());

                Rentavel[] rentaveis = new Rentavel[(int) Math.random()];

                for (int i = 0; i < rentaveis.length; i++) {
                    if (Math.random() < 0.5) {
                        new Contapoupanca("12345");
                    } else {
                        new Contapoupanca("12345");
                        Rentavel r = new Rentavel() {
                            @Override
                            public double calculaRendimento() {
                                return 0;
                            }
                        };

                    }
                }

            }
        }
    }
}


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.




