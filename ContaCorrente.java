public class ContaCorrente extends ContaBanc {

    private int transacoesRealizadas;


    public ContaCorrente(int numero, double saldo, int transacooesRealizadas, String senha){
        super(senha);//
        this.transacoesRealizadas=transacoesRealizadas;

    }

    @Override
    public void saca(double valor) {

        setSaldo(super.getSaldo() - valor);
        /*if (saldo < valor) {
            throw new IllegalStateException("Saldo insuficiente para realizar o saque.");
        }
        else if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        else
            System.out.println("Aguarde, valor processando para retirada, obrigado pela preferência");
        }

        }*/
    transacoesRealizadas++;
    }

    @Override
    public void deposita(double valor) {
      setSaldo(super.getSaldo()+valor);
        transacoesRealizadas++;
    }

    @Override
    public void tiraExtrato() {
        this.toString();
        transacoesRealizadas++;
    }


    public int getTransacoesRealizadas() {
        return transacoesRealizadas;
    }

    public void setTransacoesRealizadas(int transacoesRealizadas) {
        this.transacoesRealizadas = transacoesRealizadas;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "transacoesRealizadas=" + transacoesRealizadas +
                "} " + super.toString();
    }
}
