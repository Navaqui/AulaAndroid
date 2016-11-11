package fabricadeprogramador.com.br.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by crisnfp on 01/11/16.
 */
public class ResultadoActivity extends Activity {

    @Bind(R.id.resultado)
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle teste = intent.getExtras();
        Double valor = teste.getDouble("resultado");

        resultado.setText(valor.toString());
    }

    @OnClick(R.id.bt_fechar)
    public void fechar() {
        finish();
    }
}
