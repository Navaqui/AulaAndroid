package fabricadeprogramador.com.br.aulaandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crisnfp on 08/11/16.
 */

public class GerenciadorAgenda {
    private static List<String> nomes = new ArrayList<>();

    public static List<String> getNomes() {
        return nomes;
    }

    public static void adicionar(String nome) {
        nomes.add(nome);
    }
}
