package br.com.nicolas.screenmatch.principal;

import br.com.nicolas.screenmatch.modelos.Filme;
import br.com.nicolas.screenmatch.modelos.Serie;
import br.com.nicolas.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoNicolas = new Filme("Dogville", 2003);
        filmeDoNicolas.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoNicolas;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoNicolas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }



        }
    }
}
