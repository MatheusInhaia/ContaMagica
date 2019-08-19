package aplicativo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sistema.CadastroContas;

import javax.swing.*;

import static aplicativo.Main.conta;


public class TelaInicialController {


    public Button cliente;
    public Button gerente;

    public Main main = new Main();



    @FXML
    public void initialize() {
    }

    public void clicarCliente()throws Exception{
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        if(CadastroContas.pesquisarConta(nome)!=null){
            conta = CadastroContas.pesquisarConta(nome);
            main.loadScene("OperacoesCliente.fxml","");

       }else{
            JOptionPane.showMessageDialog(null,"Usuario incorreto!");
        }

    }

    public void clicarGerente() throws Exception{
        main.loadScene("Banco.fxml","");
    }
}
