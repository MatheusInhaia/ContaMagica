package sistema;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ContaMagicaGenerica {
    private SimpleStringProperty nome;
    private SimpleIntegerProperty idade;
    private SimpleStringProperty categoria;
    private SimpleStringProperty saldo;

    public ContaMagicaGenerica(ContaMagica conta){
        this.nome = new SimpleStringProperty(conta.getCliente().getNome());
        this.idade = new SimpleIntegerProperty(conta.getCliente().getIdade());
        this.categoria = new SimpleStringProperty(conta.getStatus().name());
        this.saldo = new SimpleStringProperty(conta.getSaldo().toString());
    }

    public String getNome(){
        return nome.get();
    }

    public int getIdade(){
        return idade.getValue();
    }

    public String getCategoria(){
        return categoria.get();
    }

    public String getSaldo(){
        return saldo.get();
    }
}
