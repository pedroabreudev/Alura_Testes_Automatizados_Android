package br.com.msmlabs.tdd_leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {
    //TEMPLATE PARA NOME DO TEST
    // [nome do método] [Estado de Teste] [resultado esperado]
    // [deve] [resultado esperado] [estado de teste]

    @Test
    public void deve_DevolverDescricao_QuandoRecebeDescricao() {
        // criar o cenário de teste
        Leilao console = new Leilao("Console");

        // executar ação esperada
        String descricaoDevolvida = console.getDescricao();

        // testar resultado esperado
        assertEquals("Console", descricaoDevolvida);
    }

    @Test
    public void deve_DevolveMaiorLance_QuandoRecebeApenasUmLance(){
        Leilao console = new Leilao("Console");
        console.propoe(new Lance(new Usuario("Alex"), 200.0));

        double maiorLanceDevolvidoDoConsole = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvidoDoConsole, 0.0001);
    }

    @Test
    public void deve_DevolveMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente(){
        Leilao computador = new Leilao("Computador");
        computador.propoe(new Lance(new Usuario("Alex"), 300.0));
        computador.propoe(new Lance(new Usuario("Fran"), 400.0));

        double maiorLanceDevolvidoDoComputador = computador.getMaiorLance();

        assertEquals(400.0, maiorLanceDevolvidoDoComputador, 0.0001);
    }

    @Test
    public void deve_DevolveMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente(){
        Leilao carro = new Leilao("Carro");
        carro.propoe(new Lance(new Usuario("Alex"), 15000.0));
        carro.propoe(new Lance(new Usuario("Fran"), 10000.0));

        double maiorLanceDevolvidoDoCarro = carro.getMaiorLance();

        assertEquals(15000, maiorLanceDevolvidoDoCarro, 0.0001);
    }
}