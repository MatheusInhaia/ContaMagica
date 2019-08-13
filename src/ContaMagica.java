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
        this.saldo = new BigDecimal("0");
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

    public void sobeCategoria(){
        if(saldo.doubleValue()>= 0 && saldo.doubleValue()<50000 ){
            categorias = Categoria.Silver;
        }else if(saldo.doubleValue()>= 50000 && saldo.doubleValue() < 200000){
            categorias = Categoria.Gold;
        }else if (saldo.doubleValue() >= 200000){
            categorias = Categoria.Platinum;
        }
        /*
        if(saldo.compareTo(new BigDecimal(0))== 1 && saldo.compareTo(new BigDecimal(50000))== -1){
            categorias = Categoria.Silver;
        }else
        if(saldo.compareTo(new BigDecimal(50000))== 1  && saldo.compareTo(new BigDecimal(200000))== -1){
            categorias = Categoria.Gold;
        }else
        if(saldo.compareTo(new BigDecimal(200000))== 1 || saldo.compareTo(new BigDecimal(200000))== 0){
            categorias = Categoria.Platinum;
        }
        */
    }

    public void desceCategoria(){
        if(saldo.doubleValue() < 100000 && getStatus() == Categoria.Platinum){
            categorias = Categoria.Gold;
        }else if(saldo.doubleValue() < 25000){
            categorias = Categoria.Silver;
        }
       /* if(saldo.compareTo(new BigDecimal(100000))==-1 && saldo.compareTo(new BigDecimal(25000))== 1){
            categorias = Categoria.Gold;
        }else if(saldo.compareTo(new BigDecimal(25000)) == -1){
            categorias = Categoria.Silver;
        }
        */
    }
    public BigDecimal valorizaDeposito(){
        if(getStatus() == Categoria.Silver){
            return new BigDecimal("1");
        }else
        if(getStatus() == Categoria.Gold){
           return new BigDecimal("1.01");
        }else
        if(getStatus() == Categoria.Platinum){
            return new BigDecimal("1.025");
        }
        return null;
    }

    public void deposito(BigDecimal valor) {
        if(valor.compareTo(new BigDecimal(0))== 1){
            BigDecimal v = valorizaDeposito();
            saldo = saldo.add(valor.multiply(v));
            sobeCategoria();
        }else{
            throw new IllegalArgumentException("valor invalido");
        }
    }

    public void retirada(BigDecimal valor){
        if(valor.compareTo(saldo) == -1 || valor.compareTo(saldo) == 0){
             saldo = saldo.subtract(valor);
             desceCategoria();
        }else{
            throw new IllegalArgumentException("valor excede o saldo");
        }
    }
}
