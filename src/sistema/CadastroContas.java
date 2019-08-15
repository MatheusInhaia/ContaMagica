package sistema;


//inserir contas
//remover contas (pelo nome do titular);
//pesquisar uma conta (pelo nome do titular, retornando o objeto ContaMagica)

import java.util.ArrayList;

public class CadastroContas {

    private ArrayList<ContaMagica> listaContas;

    public CadastroContas(){
        listaContas = new ArrayList<>();
    }

    public void insereConta(ContaMagica conta){
        listaContas.add(conta);
    }

    public void removeConta(String nomeTitular){
        ContaMagica aux = pesquisarConta(nomeTitular);
        if(aux!=null){
            listaContas.remove(aux);
        }
    }

    public ContaMagica pesquisarConta(String nomeTitular){
        for(ContaMagica conta: listaContas){
            if(conta.getNomeCliente().equals(nomeTitular)){
                return conta;
            }
        }
        return null;
    }
}
