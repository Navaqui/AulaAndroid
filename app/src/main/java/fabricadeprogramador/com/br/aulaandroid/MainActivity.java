package fabricadeprogramador.com.br.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btsoma = (Button) findViewById(R.id.bt_soma);
        Button btsub = (Button) findViewById(R.id.bt_sub);
        Button btmult = (Button) findViewById(R.id.bt_mult);
        Button btdiv = (Button) findViewById(R.id.bt_div);
        Button btok = (Button) findViewById(R.id.bt_OK);

        final EditText ed1 = (EditText) findViewById(R.id.ed1);
        final EditText ed2 = (EditText) findViewById(R.id.ed2);

        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToResult = new Intent(MainActivity.this, ResultadoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("teste",3 );
                goToResult.putExtras(bundle);
                startActivity(goToResult);
            }
        });

        btsoma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(ed1.getText().toString());
                Double n2 = Double.parseDouble(ed2.getText().toString());
                Double soma = n1 + n2;
                Toast.makeText(MainActivity.this, "Resultado: " + soma, Toast.LENGTH_SHORT).show();
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(ed1.getText().toString());
                Double n2 = Double.parseDouble(ed2.getText().toString());
                Double result = n1 - n2;
                Toast.makeText(MainActivity.this, "Resultado: " + result, Toast.LENGTH_SHORT).show();
            }
        });
        btmult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(ed1.getText().toString());
                Double n2 = Double.parseDouble(ed2.getText().toString());
                Double result = n1 * n2;
                Toast.makeText(MainActivity.this, "Resultado: " + result, Toast.LENGTH_SHORT).show();
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Double n1 = Double.parseDouble(ed1.getText().toString());
                Double n2 = Double.parseDouble(ed2.getText().toString());
                Double result = n1 / n2;
                Toast.makeText(MainActivity.this, "Resultado: " + result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
