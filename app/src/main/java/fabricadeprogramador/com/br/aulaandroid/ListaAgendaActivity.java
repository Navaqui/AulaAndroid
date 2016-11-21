package fabricadeprogramador.com.br.aulaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by crisnfp on 08/11/16.
 */

public class ListaAgendaActivity extends AppCompatActivity {

    @Bind(R.id.lv_lista_agenda)
    ListView lista;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_agenda);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        //String nome = intent.getStringExtra("pessoa");
        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");
        pessoa.setImagem(R.drawable.pri);
        //GerenciadorAgenda.adicionar(pessoa);

        BancoDeDados banco = new BancoDeDados(this);
        banco.salvar(pessoa);

        //ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, GerenciadorAgenda.getNomes());
        PessoaListAdapter adapter = new PessoaListAdapter(this, banco.buscarTodos());
        lista.setAdapter(adapter);
    }

    @OnClick(R.id.bt_fechar)
    public void fechar() {
        finish();
    }
}
