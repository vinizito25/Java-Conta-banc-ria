import java.util.Scanner;
public abstract class ContaBanc {

    private String senha;
    private int numero;
    private double saldo;

    public ContaBanc(String senha) {
        this.senha = senha;
    }

    public ContaBanc(String senha, int numero, double saldo) {

        this.senha = senha;
        this.numero = numero;
        this.saldo = saldo;

    }


    public abstract void saca(double Valor);
  /*No Java, quando você declara um método como abstrato, você não fornece uma
implementação para ele dentro da classe abstrata. Você só fornece a assinatura do método,
sem chaves e sem corpo. Portanto, o método abstrato não pode ter uma implementação dentro da classe abstrata.*/

    public abstract void deposita(double valor);

    public abstract void tiraExtrato();


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alteraSenha(String senha) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha anterior :)");
        if (sc.nextLine().equals(this.senha)) {

            this.senha = senha;

            System.out.println("Senha alterada :o");

        } else {
            System.out.println("Erro, senha não alterada");

        }

    }
        @Override
        public String toString () {
            return "Conta Bancária [Senha=" + senha + ", numero=" + numero + ", saldo=" + saldo + "]";
        }

    }
