package fabricadeprogramador.com.br.aulaandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crisnfp on 08/11/16.
 */

public class GerenciadorAgenda {
    private static List<Pessoa> pessoasList = new ArrayList<>();

    public static List<Pessoa> getNomes() {
        return pessoasList;
    }

    public static void adicionar(Pessoa pessoa) {
        pessoasList.add(pessoa);
    }
}
