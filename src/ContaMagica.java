import java.math.BigDecimal;

public class ContaMagica {

    public enum Categoria{
        Silver, Gold, Platinum;
    }
    private Categoria categorias;
    private String cliente;
    private BigDecimal saldo;

    public ContaMagica(String nome){
        this.cliente = nome;
        this.categorias = Categoria.Silver;
        this.saldo = new BigDecimal(0);
    }
    public String getNomeCliente(){
        return this.cliente;
    }
    public BigDecimal getSaldo(){
        return this.saldo;
    }
    public Categoria getStatus(){
        return this.categorias;
    }


    public void deposito(BigDecimal valor) {
        if(valor.compareTo(new BigDecimal(0))== 1){   //new BigDecimal(0).compareTo(valor)== 1){
            saldo.add(valor);
        }else{
            throw new IllegalArgumentException("valor invalido");
        }
    }

    public void retirada(BigDecimal valor){
        if(valor.compareTo(saldo) == -1 || valor.compareTo(saldo) == 0){
             saldo.subtract(valor);
        }else{
            throw new IllegalArgumentException("valor excede o saldo");
        }
    }
}
