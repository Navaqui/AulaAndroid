package fabricadeprogramador.com.br.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by crisnfp on 01/11/16.
 */
public class ResultadoActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle teste = intent.getExtras();
        Double valor = teste.getDouble("teste");

        Toast.makeText(ResultadoActivity.this, valor.toString(), Toast.LENGTH_SHORT).show();
    }
}
