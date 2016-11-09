package fabricadeprogramador.com.br.aulaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by crisnfp on 08/11/16.
 */

public class AgendaActivity extends AppCompatActivity {
    @Bind(R.id.ed_agenda_nome)
    EditText edNome;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_salvar)
    public void salvar() {
        Intent irLista = new Intent(AgendaActivity.this,ListaAgendaActivity.class);
        irLista.putExtra("nome", edNome.getText().toString());
        startActivity(irLista);
    }

    @OnClick(R.id.bt_fechar)
    public void fechar() {
        finish();
    }
}
