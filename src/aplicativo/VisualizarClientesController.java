package aplicativo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import sistema.CadastroContas;
import sistema.ContaMagica;
import sistema.ContaMagicaGenerica;

import java.math.BigDecimal;

import static aplicativo.Main.setImagemFundo;

public class VisualizarClientesController {

    public TableView<ContaMagicaGenerica> tabelaClientes;
    public TableColumn<ContaMagica, String> colunaNome;
    public TableColumn<ContaMagica, Integer> colunaIdade;
    public TableColumn<ContaMagica, Enum> colunaCategoria;
    public TableColumn<ContaMagica, BigDecimal> colunaSaldo;

    public Button voltar;

    public Pane paneVisualizar;

    public Main main = new Main();
    public void clicarVoltar()throws Exception{
        main.loadScene("Banco.fxml","");
    }
    private ObservableList<ContaMagicaGenerica> listaDeClientes() {
        ObservableList<ContaMagicaGenerica> contas = FXCollections.observableArrayList();
        for(ContaMagica c: CadastroContas.listarContas()){
            contas.add(new ContaMagicaGenerica(c));
        }
        return contas;
    }

    public void initialize(){
        paneVisualizar.setBackground(new Background(setImagemFundo()));
        tabelaClientes.setBackground(new Background(setImagemFundo()));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
        colunaCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colunaSaldo.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tabelaClientes.setItems(listaDeClientes());
    }
}
