package br.com.msmlabs.tdd_leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {

    @Test
    public void getDescricao() {
        // criar o cenário de teste
        Leilao console = new Leilao("Console");

        // executar ação esperada
        String descricaoDevolvida = console.getDescricao();

        // testar resultado esperado
        assertEquals("Console", descricaoDevolvida);

    }

    @Test
    public void getMaiorLance(){
        Leilao console = new Leilao("Console");
        console.propoe(new Lance(new Usuario("Alex"), 200.0));

        double maiorLanceDevolvido = console.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);
    }


}