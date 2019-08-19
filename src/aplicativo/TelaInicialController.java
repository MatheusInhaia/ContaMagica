package aplicativo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import sistema.CadastroContas;

import javax.swing.*;

import static aplicativo.Main.conta;
import static aplicativo.Main.setImagemFundo;


public class TelaInicialController {

    public Pane paneInicial;
    public Button cliente;
    public Button gerente;

    public Main main = new Main();



    @FXML
    public void initialize() {
        paneInicial.setBackground(new Background(setImagemFundo()));
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
