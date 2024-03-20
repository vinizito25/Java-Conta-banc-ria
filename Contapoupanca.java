public class Contapoupanca extends ContaBanc{

    private int numero;
    private double saldo;

    private double taxaDeRendimento;


    public Contapoupanca(String senha, double taxaDeRendimento) {
        super(senha);

        this.taxaDeRendimento = taxaDeRendimento;
    }

    @Override
    public void saca(double valor) {

        setSaldo(super.getSaldo() - valor);

       /* if (saldo < valor) {
            throw new IllegalStateException("Saldo insuficiente para realizar o saque.");
        }
        else if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        else
            System.out.println("Aguarde, valor processando para retirada, obrigado pela preferência");

        saldo -= valor;*/


    }

    @Override
    public void deposita(double valor) {
        setSaldo(super.getSaldo() +valor);

    }

    @Override
    public void tiraExtrato() {
        System.out.println("Extrato da conta:\n " + numero +
            "\n" + saldo + "\n" + taxaDeRendimento);

    }
    
    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
}
