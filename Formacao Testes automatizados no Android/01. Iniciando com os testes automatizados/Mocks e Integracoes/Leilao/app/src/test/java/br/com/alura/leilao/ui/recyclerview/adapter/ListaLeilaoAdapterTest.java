package br.com.alura.leilao.ui.recyclerview.adapter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.alura.leilao.model.Leilao;

public class ListaLeilaoAdapterTest {

    @Test
    public void deve_AtualizarListaDeleiloes_QuandoReceberListaDeLeiloes() {
        ListaLeilaoAdapter adapter = new ListaLeilaoAdapter(null);
        adapter.atualiza(new ArrayList<>(Arrays.asList(
                new Leilao("Console"),
                new Leilao("Computador")
        )));

        int quantidadeLeiloesDevolvida = adapter.getItemCount();

        assertThat(quantidadeLeiloesDevolvida, is(2));
    }

}