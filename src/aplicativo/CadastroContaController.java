package aplicativo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import sistema.CadastroContas;
import sistema.Cliente;
import sistema.ContaMagica;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static aplicativo.Main.setImagemFundo;
import static sistema.CadastroContas.insereConta;
import static sistema.CadastroContas.listarContas;


public class CadastroContaController {

    public Button cadastrar;
    public Button cancelar;

    public Label labelNome;
    public Label labelIdade;

    public TextField textFieldNome;
    public TextField textFieldIdade;

    public Pane paneCadastro;

    public Main main = new Main();



    @FXML
    public void initialize() {
        paneCadastro.setBackground(new Background(setImagemFundo()));
    }

    public void clicarCancelar()throws Exception{
        main.loadScene("Banco.fxml","Banco alegria");
    }

    public void clicarCadastrar()throws  Exception{
        if(textFieldNome.getText().isEmpty() || textFieldIdade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o formulario corretamente.");
           // main.loadScene("cadastroConta.fxml", "Cadastro de cliente");
        }else {
            Cliente cliente = new Cliente(textFieldNome.getText(), Integer.parseInt(textFieldIdade.getText()));
            ContaMagica novaConta = new ContaMagica(cliente);
            if (insereConta(novaConta)) {
                JOptionPane.showMessageDialog(null,"Conta criada com sucesso!");
                main.loadScene("Banco.fxml", "Banco alegria");
            } else {
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar.");
                main.loadScene("cadastroConta.fxml", "Cadastro de cliente");
            }
        }


    }

}
