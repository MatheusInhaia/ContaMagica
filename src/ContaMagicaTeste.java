
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaMagicaTeste {


    @BeforeEach
    public void setUp(){
        //ContaMagica conta = new ContaMagica("Matheus");
    }

    @Test
    public void getNomeCliente(){
        ContaMagica conta = new ContaMagica("Matheus");
        assertEquals("Matheus", conta.getNomeCliente());
    }

    @Test
    public void getSaldo(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(300));
        assertEquals(new BigDecimal(300), conta.getSaldo());
    }

    @Test
    public void getStatusSilver(){
        ContaMagica conta = new ContaMagica("Matheus");
        assertEquals(ContaMagica.Categoria.Silver, conta.getStatus());
    }

    @Test
    public void getStatusGold(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        assertEquals(ContaMagica.Categoria.Gold, conta.getStatus());

    }
    @Test
    public void getStatusPlatinum(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        assertEquals(ContaMagica.Categoria.Platinum, conta.getStatus());
    }


    @Test
    public void valorizaDeposito1(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(55000));
        assertEquals(new BigDecimal(1.01), conta.valorizaDeposito());
    }

    @Test
    public void valorizaDeposito2(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(250000));
        assertEquals(new BigDecimal(1.025), conta.valorizaDeposito());
    }

    @Test
    public void depositoSilver(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(500));
        conta.deposito(new BigDecimal(500));
        assertEquals(new BigDecimal(1000), conta.getSaldo());
    }

    @Test
    public void depositoGold(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.deposito(new BigDecimal(1000));
        assertEquals(new BigDecimal(51010), conta.getSaldo());
    }

    @Test
    public void depositoPlatinum(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.deposito(new BigDecimal(1000));
        assertEquals(new BigDecimal(201025), conta.getSaldo());
    }

    @Test
    public void retiradaNormal(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.deposito(new BigDecimal(1000));
        conta.retirada(new BigDecimal(40000));
        assertEquals(new BigDecimal(11010), conta.getSaldo());
    }

    @Test
    public void depositoExcecao(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(0));
    }

    @Test
    public void retiradaExcecao(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.retirada(new BigDecimal(60000));
    }


    @Test
    public void desceCategoriaGold(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.retirada(new BigDecimal(150000));
        assertEquals(ContaMagica.Categoria.Gold, conta.getStatus());
    }

    @Test
    public void desceCategoriaGold2(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.retirada(new BigDecimal(176000));
        assertEquals(ContaMagica.Categoria.Gold, conta.getStatus());
    }

    @Test
    public void desceCategoriaSilver2(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(200000));
        conta.retirada(new BigDecimal(176000));
        conta.retirada(new BigDecimal(1000));
        assertEquals(ContaMagica.Categoria.Silver, conta.getStatus());
    }

    @Test
    public void desceCategoriaSilver(){
        ContaMagica conta = new ContaMagica("Matheus");
        conta.deposito(new BigDecimal(50000));
        conta.retirada(new BigDecimal(30000));
        assertEquals(ContaMagica.Categoria.Silver, conta.getStatus());
    }
}
