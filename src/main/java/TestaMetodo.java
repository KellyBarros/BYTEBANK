import javax.swing.*;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);
        boolean conseguiuRetirar = contaDoPaulo.saca(50);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        if (contaDaMarcela.tranfere(1500, contaDoPaulo)) {
            System.out.println("Sucesso");
        } else {
            System.out.println("Negado");
        }
        System.out.println("Conta da Marcela: " + contaDaMarcela.saldo);
        System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
    }
}
