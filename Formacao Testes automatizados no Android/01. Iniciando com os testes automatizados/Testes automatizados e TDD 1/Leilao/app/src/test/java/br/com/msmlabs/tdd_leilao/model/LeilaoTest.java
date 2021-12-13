package br.com.msmlabs.tdd_leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {
    private Leilao console = new Leilao("Console");
    private Usuario alex = new Usuario("Alex");
    private Usuario fran = new Usuario("Fran");


    //TEMPLATE PARA NOME DO TEST
    // [nome do método] [Estado de Teste] [resultado esperado]
    // [deve] [resultado esperado] [estado de teste]

    @Test
    public void deve_DevolverDescricao_QuandoRecebeDescricao() {
        // executar ação esperada
        String descricaoDevolvida = console.getDescricao();

        // testar resultado esperado
        assertEquals("Console", descricaoDevolvida);
    }

    @Test
    public void deve_DevolveMaiorLance_QuandoRecebeApenasUmLance() {
        console.propoe(new Lance(alex, 200.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolveMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente() {
        console.propoe(new Lance(alex, 300.0));
        console.propoe(new Lance(fran, 400.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(400.0, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolveMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente() {
        console.propoe(new Lance(alex, 15000.0));
        console.propoe(new Lance(fran, 10000.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(15000, maiorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMenorLance_QuandoRecebeApenasUmLance() {
        console.propoe(new Lance(alex, 100.0));

        double menorLanceDevolvido = console.getMenorLance();

        assertEquals(100.0, menorLanceDevolvido, 0.0001);
    }

    @Test
    public void deve_DevolverMenorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente() {
        console.propoe(new Lance(alex, 100.0));
        console.propoe(new Lance(fran, 200.0));

        double menorLanceDevolvido = console.getMenorLance();

        assertEquals(100.0, menorLanceDevolvido, 0.0001);

    }

    @Test
    public void deve_DevolverMenorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente() {
        console.propoe(new Lance(alex, 5000.0));
        console.propoe(new Lance(fran, 4000.0));

        double menorLanceDevolvido = console.getMenorLance();

        assertEquals(4000.0, menorLanceDevolvido, 0.0001);

    }

}