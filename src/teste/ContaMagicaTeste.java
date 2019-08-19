package teste;
import sistema.Cliente;
import sistema.ContaMagica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaMagicaTeste{
/*
    public Cliente cliente;
    public ContaMagica conta;
    public SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    Date data = formato.parse("08/02/1994");


    @BeforeEach
    public void setUp()throws Exception{
       cliente = new Cliente("matheus", new Date(formato.parse("08/02/1994")));
       conta = new ContaMagica(cliente);
    }

    @Test
    public void getNomeCliente(){
       // ContaMagica conta = new ContaMagica("Matheus");
        Assertions.assertEquals("Matheus", conta.getCliente().getNome());
    }

    @Test
    public void getSaldo(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal("300.00"));
        Assertions.assertEquals(new BigDecimal("300.00"), conta.getSaldo());
    }

    @Test
    public void getStatusSilver(){
       // ContaMagica conta = new ContaMagica("Matheus");
        Assertions.assertEquals(ContaMagica.Categoria.Silver, conta.getStatus());
    }

    @Test
    public void getStatusGold(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        Assertions.assertEquals(ContaMagica.Categoria.Gold, conta.getStatus());

    }
    @Test
    public void getStatusPlatinum(){
        //ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        Assertions.assertEquals(ContaMagica.Categoria.Platinum, conta.getStatus());
    }


    @Test
    public void valorizaDeposito1(){
        //ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(55000));
        Assertions.assertEquals(new BigDecimal("1.01"), conta.valorizaDeposito());
    }

    @Test
    public void valorizaDeposito2(){
        //ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(250000));
        Assertions.assertEquals(new BigDecimal("1.025"), conta.valorizaDeposito());
    }

    @Test
    public void depositoSilver(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(500));
        conta.deposito(new BigDecimal(500));
        Assertions.assertEquals(new BigDecimal(1000), conta.getSaldo());
    }

    @Test
    public void depositoGold(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.deposito(new BigDecimal(1000));
        Assertions.assertEquals(new BigDecimal("51010.00"), conta.getSaldo());
    }

    @Test
    public void depositoPlatinum(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal("200000.0000"));
        conta.deposito(new BigDecimal("1000.0000"));
        Assertions.assertEquals(new BigDecimal("201025.0000000"), conta.getSaldo());
    }

    @Test
    public void retiradaNormal(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.deposito(new BigDecimal(1000));
        conta.retirada(new BigDecimal(40000));
        Assertions.assertEquals(new BigDecimal("11010.00"), conta.getSaldo());
    }

    @Test
    public void depositoExcecao(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(0));
    }

    @Test
    public void retiradaExcecao(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.retirada(new BigDecimal(60000));
    }


    @Test
    public void desceCategoriaGold(){
        //ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.retirada(new BigDecimal(150000));
        Assertions.assertEquals(ContaMagica.Categoria.Gold, conta.getStatus());
    }

    @Test
    public void desceCategoriaGold2(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.retirada(new BigDecimal(176000));
        Assertions.assertEquals(ContaMagica.Categoria.Gold, conta.getStatus());
    }

    @Test
    public void desceCategoriaSilver2(){
       // ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.retirada(new BigDecimal(176000));
        conta.retirada(new BigDecimal(1000));
        Assertions.assertEquals(ContaMagica.Categoria.Silver, conta.getStatus());
    }

    @Test
    public void desceCategoriaSilver(){
        //ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.retirada(new BigDecimal(30000));
        Assertions.assertEquals(ContaMagica.Categoria.Silver, conta.getStatus());
    }
    */
}
