package sistema;


//inserir contas
//remover contas (pelo nome do titular);
//pesquisar uma conta (pelo nome do titular, retornando o objeto ContaMagica)

import java.util.ArrayList;

public class CadastroContas {

    private static final ArrayList<ContaMagica> listaContas = new ArrayList<>();

   // public CadastroContas(){
     //   listaContas = new ArrayList<>();
  //  }

    public static boolean insereConta(ContaMagica conta){
        if(conta!=null) {
            listaContas.add(conta);
            return true;
        }
        return true;
    }

    public static void removeConta(String nomeTitular){
        ContaMagica aux = pesquisarConta(nomeTitular);
        if(aux!=null){
            listaContas.remove(aux);
        }
    }

    public static ContaMagica pesquisarConta(String nomeTitular){
        for(ContaMagica conta: listaContas){
            if(conta.getCliente().getNome().equals(nomeTitular)){
                return conta;
            }
        }
        return null;
    }

    public static ArrayList<ContaMagica> listarContas(){
        return new ArrayList<>(listaContas);
    }
}
