package aplicativo;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import javax.swing.*;
import java.math.BigDecimal;

import static aplicativo.Main.conta;

public class OperecoesClienteController {

    public Button sacar;
    public Button depositar;
    public Button verSaldo;
    public Button voltar;

    public Label nomeCliente;


    public Main main = new Main();

    @FXML
    public void initialize() {
        nomeCliente.setText(conta.getCliente().getNome());
    }



    public void clicarSacar(){
        BigDecimal valor = new BigDecimal(JOptionPane.showInputDialog("Digite o valor"));
        conta.retirada(valor);

    }

    public void clicarDepositar(){
        BigDecimal valor = new BigDecimal(JOptionPane.showInputDialog("Digite o valor"));
        conta.deposito(valor);
    }

    public void clicarVerSaldo(){
        JOptionPane.showMessageDialog(null,"Seu saldo é: "+conta.getSaldo());

    }

    public void clicarVoltar()throws Exception{
        main.loadScene("TelaInicial.fxml","");
        conta = null;
    }

}
