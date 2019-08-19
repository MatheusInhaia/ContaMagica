package aplicativo;


//criar uma conta;
//depositar dinheiro em uma conta;
//sacar dinheiro em uma contar;
//consultar o saldo de uma conta;
//encerrar uma conta.


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;


import javax.swing.*;

import static aplicativo.Main.setImagemFundo;
import static sistema.CadastroContas.listarContas;
import static sistema.CadastroContas.removeConta;

public class BancoController {

    public Button criarConta;
    public Button excluirConta;
    public Button vizualizarClientes;
    public Button voltar;
    public Pane paneBanco;
    public Main main = new Main();

    @FXML
    public void initialize() {
        paneBanco.setBackground(new Background(setImagemFundo()));
    }
    public void clicarCriarConta() throws Exception{
        main.loadScene("CadastroConta.fxml", "Cadastro de cliente");
    }

    public void clicarExcluirConta(){
        removeConta(JOptionPane.showInputDialog("Digite o nome do cliente!"));

    }

    public void clicarVoltar()throws Exception{
        main.loadScene("TelaInicial.fxml", "");
    }

    public void vizualizarClientes()throws Exception{
        main.loadScene("VisualizarClientes.fxml","");
    }
}
